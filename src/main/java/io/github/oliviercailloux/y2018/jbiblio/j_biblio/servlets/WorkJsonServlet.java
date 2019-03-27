package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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

import com.google.common.base.Strings;

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

			final List<Work> allItems;
			// get parameter value
			String formOfWork = Strings.nullToEmpty(req.getParameter("formOfWork"));
			String contextForTheWork = Strings.nullToEmpty(req.getParameter("contextForTheWork"));

			/**
			 * Checks if both parameters are empty otherwise we select all work in the
			 * work's table
			 */
			if (!StringUtils.isBlank(formOfWork) || !StringUtils.isBlank(contextForTheWork)) {
				allItems = workService.findByField(formOfWork, contextForTheWork);
			} else {
				allItems = workService.getAll();
			}

			/**
			 * Allow to convert a work object in JSON representation thanks to to JSON-P
			 */

			String jsonItem = convertToJson(allItems);
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
			resp.getWriter().println("The object is successfully initialized.");
		}

		catch (Exception e) {

			LOGGER.warning(" Error  " + e.toString());
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "insert failed.");
		}

	}

	/**
	 * This fonction allow to transform a work object and his his children into Json
	 * format
	 * 
	 * @param work
	 * @return
	 */
	public String convertToJson(List<Work> listWork) {
		/**
		 * Init workListBuilder and jsonArrayWork to display a list of Work in JSON
		 * format
		 */
		JsonObjectBuilder workListBuilder = Json.createObjectBuilder();
		JsonArrayBuilder jsonArrayWork = Json.createArrayBuilder();
		/**
		 * For each work in the listWork, we convert a work in JsonObjectBuilder. Each
		 * JsonObjectBuilder will be added in the jsonArrayWork
		 */
		for (Work work : listWork) {

			JsonObjectBuilder workBuilder = Json.createObjectBuilder();
			workBuilder.add("idWork", work.getIdWork());
			workBuilder.add("idExpressions", Json.createArrayBuilder(work.getDateOfWork()));
			workBuilder.add("otherDistinguishingCharacteristic",
					Json.createArrayBuilder(work.getOtherDistinguishingCharacteristic()));
			workBuilder.add("intendedTermination", Json.createArrayBuilder(work.getIntendedAudience()));
			workBuilder.add("intendedAudience", Json.createArrayBuilder(work.getIntendedAudience()));
			workBuilder.add("contextForTheWork", work.getContextForTheWork());
			workBuilder.add("titleOfWork", Json.createArrayBuilder(work.getTitleOfWork()));
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
					jsonArrayTimeStampedDescription.add(Json.createObjectBuilder()
							.add("description", tsd.getDescription()).add("date", tsd.getDate().toString()));
				}

				jsonArrayExpression.add(Json.createObjectBuilder().add("formOfExpression", e.getFormOfExpression())
						.add("idExpression", e.getIdExpression())
						.add("languageOfExpression", e.getLanguageOfExpression())
						.add("idManifestations", Json.createArrayBuilder(e.getIdManifestations()))
						.add("titleOfExpression", Json.createArrayBuilder(e.getTitleOfExpression()))
						.add("dateOfExpression", jsonArrayTimeStampedDescription)
						.add("otherDistinguishingCharacteristic",
								Json.createArrayBuilder(e.getOtherDistinguishingCharacteristic())));
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
			jsonArrayWork.add(workBuilder);
		}
		workListBuilder.add("Work", jsonArrayWork);
		JsonObject workJson = workListBuilder.build();
		return workJson.toString();
	}

}
