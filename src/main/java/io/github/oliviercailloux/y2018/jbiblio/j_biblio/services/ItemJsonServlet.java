package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.BufferedReader;
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
import javax.ws.rs.core.MediaType;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

@SuppressWarnings("serial")
@WebServlet("item/get")
public class ItemJsonServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(ItemJsonServlet.class.getCanonicalName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType("application/json");
		resp.setLocale(Locale.ENGLISH);
		/**
		 * Converting to Json format
		 */
		try (Jsonb jsonb = JsonbBuilder.create();) {

			// transform an object item to a Jsonb format in string format
			Item item = this.initItem(req);
			String jsonItem = jsonb.toJson(item);
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println(jsonItem);
			LOGGER.info(" Display object in JSON format " + jsonItem);

		} catch (Exception e) {
			// Send error status

			LOGGER.warning(" Error  " + e.toString());
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "The research failed");

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType(MediaType.TEXT_PLAIN);
		resp.setLocale(Locale.ENGLISH);
		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = req.getReader()) {
				/**
				 * Jpa will be implement in the next sprint
				 */
				@SuppressWarnings("unused")
				Item item = jsonb.fromJson(reader, Item.class);
			}
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println("The object is successfully inserted");
		}

		catch (Exception e) {

			LOGGER.warning(" Error  " + e.toString());
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "insert failed.");
		}

	}

	private Item initItem(HttpServletRequest req) throws NumberFormatException, NullPointerException {

		int idItem = Integer.parseInt(req.getParameter("idItem"));
		int idManifestation = Integer.parseInt(req.getParameter("idManifestation"));
		/**
		 * If parsInt doesn't throw NumberFormatException, then we can init a Item
		 */
		Item item = new Item();
		item.setIdItem(idItem);
		item.setIdManifestation(idManifestation);
		// itemIdentifier musto be not null
		item.setItemIdentifier(req.getParameter("itemIdentifier"));
		// if null will be converted to an empty string
		item.setFingerprint(req.getParameter("fingerprint"));
		item.setProvenanceOfTheItem(req.getParameter("provenanceOfTheItem"));

		return item;

	}
}
