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

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.Item;
@SuppressWarnings("serial")
@WebServlet("json/get")
public class ItemJsonServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(ItemJsonServlet.class.getCanonicalName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType("application/json");
		resp.setLocale(Locale.ENGLISH);
		try {
			ObjectMapper mapper = new ObjectMapper();
			Item item = new Item(412, "A12S3", "DS21T47DT");
			String jsonItem = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
			/**
			 * Page traité avec succès
			 */

		resp.setStatus(200);
		/**
		 * 
		 * Envoie message au client
		 */
		resp.getWriter().println(jsonItem);
		/**
		 * Affichage dans les logs de la console
		 */

		LOGGER.info(" Display object in JSON format ");
		
		}catch(JsonGenerationException  e) {
			/**
			 * Page traité avec succès
			 */
			resp.setStatus(404);
		}
}

}
