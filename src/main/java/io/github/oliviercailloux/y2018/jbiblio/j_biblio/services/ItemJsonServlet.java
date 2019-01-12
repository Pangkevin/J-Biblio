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
			/**
			 * This mapper provides functionality for converting between Java objects and
			 * matching JSON constructs
			 */
			ObjectMapper mapper = new ObjectMapper();
			Item item = new Item(412, "A12S3", "DS21T47DT");
			/**
			 * transform a object item to a Json format in string format
			 */
			String jsonItem = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
			/**
			 * Page successfully processed
			 */

			resp.setStatus(200);
			/**
			 * 
			 * Send message to custumer
			 */
			resp.getWriter().println(jsonItem);
			/**
			 * display logs in console
			 */

			LOGGER.info(" Display object in JSON format " + jsonItem);

		} catch (JsonGenerationException e) {
			/**
			 * Send error status
			 */
			LOGGER.warning(" Display object in JSON format " + e.toString());

			resp.setStatus(404);
		}

}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idItem = request.getParameter("412");
        String itemIdentifier = request.getParameter("A12S3");
        String fingerprint = request.getParameter("DS21T47DT");
        



        try {
        	Item item = new Item(Integer.parseInt(idItem), itemIdentifier, fingerprint);
        	LOGGER.info("Item idItem : " + idItem);
        	LOGGER.info("Item itemIdentifier : " + itemIdentifier);
        	LOGGER.info("Item fingerprint : " + fingerprint);
        	
			response.setStatus(200);
			response.getWriter().println("The object is successfully insert");
        }
        
        catch (NumberFormatException e) {

			LOGGER.warning("The insert failed");
			response.setStatus(400);
			response.getWriter().println("The insert failed");
			
      
    }


	}
	}
