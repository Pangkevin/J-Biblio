package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import javax.inject.Inject;
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

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.PersonService;

@SuppressWarnings("serial")
@WebServlet("person")
public class PersonServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(PersonServlet.class.getCanonicalName());
	@PersistenceContext
	private EntityManager em;

	@Inject
	private PersonService personService;// = new CommentService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType(MediaType.APPLICATION_JSON);
		resp.setLocale(Locale.ENGLISH);
		/**
		 * Converting to Json format
		 */
		try (Jsonb jsonb = JsonbBuilder.create();) {

			final List<Person> allPerson = personService.getAll();
			String jsonItem = "";

			jsonItem = jsonb.toJson(allPerson);

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

				Person work = jsonb.fromJson(reader, Person.class);
				personService.persist(work);
			}
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println("The object is successfully initialized");
		}

		catch (Exception e) {

			LOGGER.warning(" Error  " + e.toString());
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "insert failed.");
		}

	}

}
