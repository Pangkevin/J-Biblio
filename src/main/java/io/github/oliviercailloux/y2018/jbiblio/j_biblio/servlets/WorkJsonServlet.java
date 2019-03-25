package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.WorkService;

@SuppressWarnings("serial")
@WebServlet("work")
public class WorkJsonServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(WorkJsonServlet.class.getCanonicalName());
	@PersistenceContext
	private EntityManager em;

	@Inject
	private WorkService workService;// = new CommentService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType(MediaType.APPLICATION_JSON);
		resp.setLocale(Locale.ENGLISH);
		/**
		 * Converting to Json format
		 */
		try (Jsonb jsonb = JsonbBuilder.create();) {

			/**
			 * Jpa will be implemented in the next sprint
			 */

			final List<Work> allItems = workService.getAll();

			String jsonItem = convertToJson(allItems.get(0));
			// jsonItem = jsonb.toJson(allItems);

			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println(jsonItem);
			LOGGER.info(" Display object in JSON format " + jsonItem);

		} catch (Exception e) {
			// Send error status
			LOGGER.warning(" Error  " + e.toString());
			throw new ServletException(e);

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType(MediaType.TEXT_PLAIN);
		resp.setLocale(Locale.ENGLISH);
		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = req.getReader()) {

				Work work = jsonb.fromJson(reader, Work.class);
				Expression expression = new Expression();
				expression.setWork(work);
				work.getExpressions().add(expression);
				workService.persist(work);
			}
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println(
					"The object is successfully initialized. Database insertion  will be implemented in the next sprint");
		}

		catch (Exception e) {

			LOGGER.warning(" Error  " + e.toString());
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "insert failed.");
		}

	}

	/**
	 * This fonction allow to transform a work object and his his children into Json format
	 * 
	 * @param work
	 * @return
	 */
	public String convertToJson(Work work) {

		JsonObjectBuilder workBuilder = Json.createObjectBuilder();
		JsonObjectBuilder jsonObjectExpression = Json.createObjectBuilder();
		jsonObjectExpression.build();
		workBuilder.add("idWork", work.getIdWork());
		workBuilder.add("idExpressions", work.getDateOfWork().toString());
		workBuilder.add("otherDistinguishingCharacteristic", work.getOtherDistinguishingCharacteristic().toString());
		workBuilder.add("intendedTermination", work.getIntendedAudience().toString());
		workBuilder.add("intendedAudience", work.getIntendedAudience().toString());
		workBuilder.add("contextForTheWork", work.getContextForTheWork());
		workBuilder.add("titleOfWork", work.getTitleOfWork().toString());
		workBuilder.add("formOfWork", work.getFormOfWork());
		/**
		 * Convert Collection of Expression to JsonArrayBuilder
		 */
		JsonArrayBuilder jsonArrayExpression = Json.createArrayBuilder();
		for (Expression e : work.getExpressions()) {
			/**
			 * Convert Collection of TimeStampedDescription to JsonArrayBuilder
			 */
			JsonArrayBuilder jsonArrayTimeStampedDescription = Json.createArrayBuilder();
			for (TimeStampedDescription tsd : e.getDateOfExpression()) {
				jsonArrayTimeStampedDescription.add(Json.createObjectBuilder().add("description", tsd.getDescription())
						.add("date", tsd.getDate().toString()));
			}

			jsonArrayExpression.add(Json.createObjectBuilder().add("formOfExpression", e.getFormOfExpression())
					.add("idExpression", e.getIdExpression()).add("languageOfExpression", e.getLanguageOfExpression())
					.add("idManifestations", e.getIdManifestations().toString())
					.add("titleOfExpression", e.getTitleOfExpression().toString())
					.add("dateOfExpression", jsonArrayTimeStampedDescription)
					.add("otherDistinguishingCharacteristic", e.getOtherDistinguishingCharacteristic().toString()));
		}

		workBuilder.add("expressions", jsonArrayExpression);
		/**
		 * Convert Collection of TimeStampedDescription to JsonArrayBuilder
		 */
		JsonArrayBuilder jsonArrayTimeStampedDescription = Json.createArrayBuilder();
		for (TimeStampedDescription tsd : work.getDateOfWork()) {
			jsonArrayTimeStampedDescription.add(Json.createObjectBuilder().add("description", tsd.getDescription())
					.add("date", tsd.getDate().toString()));
		}

		workBuilder.add("dateOfWork", jsonArrayTimeStampedDescription);

		JsonObject workJson = workBuilder.build();

		return workJson.toString();
	}

	public Work initWork(HttpServletRequest req) throws NumberFormatException, NullPointerException {

		int idWork = Integer.parseInt(req.getParameter("idWork"));
		String titleOfWork = req.getParameter("titleOfWork");
		String formOfWork = req.getParameter("formOfWork");
		Collection<String> collectionTitleOfWork = new ArrayList<>();

		if (!StringUtils.isBlank(titleOfWork)) {

			collectionTitleOfWork.add(titleOfWork);
		}

		Work work = new Work(idWork, collectionTitleOfWork, formOfWork);

		return work;

	}

}
