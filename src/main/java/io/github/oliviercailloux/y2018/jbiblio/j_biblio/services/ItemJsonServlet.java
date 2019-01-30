package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Logger;
import javax.json.stream.JsonGenerationException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

@SuppressWarnings("serial")
@WebServlet("json/get")
public class ItemJsonServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(ItemJsonServlet.class.getCanonicalName());

	@SuppressWarnings("static-access")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType("application/json");
		resp.setLocale(Locale.ENGLISH);

		Item item = new Item(412, 412, "A12S3", "DS21T47DT", "RES");

		try {
			Jsonb jsonb = JsonbBuilder.create();
			// transform a object item to a Jsonb format in string format

			String jsonItem = jsonb.toJson(item);
			// Page successfully processed
			resp.setStatus(200);
			// Send message to customer
			resp.getWriter().println(jsonItem);
			// display logs in console
			LOGGER.info(" Display object in JSON format " + jsonItem);

		} catch (JsonGenerationException | NumberFormatException e) {
			// Send error status

			LOGGER.warning(" Error  " + e.toString());
			resp.setStatus(404);
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "The research failed");

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idItem = req.getParameter("idItem");
		String idManifestation = req.getParameter("idManifestation");
		String itemIdentifier = req.getParameter("itemIdentifier");
		String fingerprint = req.getParameter("fingerprint");
		String provenanceOfTheItem = req.getParameter("provenanceOfTheItem");

		try {
			Item item = new Item(Integer.parseInt(idItem), Integer.parseInt(idManifestation), itemIdentifier,
					fingerprint, provenanceOfTheItem);
			LOGGER.info("Item idItem : " + item.getIdItem());
			LOGGER.info("Item idManifestation : " + item.getIdManifestation());
			LOGGER.info("Item itemIdentifier : " + item.getItemIdentifier());
			LOGGER.info("Item fingerprint : " + item.getFingerprint());
			LOGGER.info("Item provenanceOfTheItem : " + item.getProvenanceOfTheItem());

			resp.setStatus(200);
			resp.getWriter().println("The object is successfully insert");
		}

		catch (NumberFormatException e) {

			LOGGER.warning("The insert failed");
			LOGGER.warning(" Error  " + e.toString());
			resp.setStatus(400);
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "insert failed.");
		}

	}
}
