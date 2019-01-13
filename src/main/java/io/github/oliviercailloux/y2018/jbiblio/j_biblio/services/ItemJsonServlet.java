package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
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

	// simulates the database
	static final Collection<Item> itemsList = new ArrayList<Item>() {
		{
			add(new Item(412, "A12S3", "DS21T47DT"));
			add(new Item(413, "A12S3", "DS21T47DT"));
			add(new Item(414, "A12S3", "DS21T47DT"));
		}
	};
	@SuppressWarnings("static-access")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType("application/json");
		resp.setLocale(Locale.ENGLISH);
		
			/**
			 * This mapper provides functionality for converting between Java objects and
			 * matching JSON constructs
			 */
			ObjectMapper mapper = new ObjectMapper();
			try {
			//	Parse int 
				String idItem = req.getParameter("idItem");
				int idItemInt = Integer.parseInt(idItem);
				
				// Search object in collection
				for (Item item : this.itemsList) {

					if (item.getIdItem() == idItemInt) {
						// transform a object item to a Json format in string format
						String jsonItem = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
						// Page successfully processed
						resp.setStatus(200);
						// Send message to customer
						resp.getWriter().println(jsonItem);
						// display logs in console
						LOGGER.info(" Display object in JSON format " + jsonItem);
						// If found, we leave the loop
						break;

					}

				}

			} catch (JsonGenerationException | NumberFormatException e) {
				// Send error status

				LOGGER.warning(" Error  " + e.toString());
				resp.setStatus(404);
				resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "The research failed");

			}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException
	{
		String idItem = req.getParameter("idItem");
		String itemIdentifier = req.getParameter("itemIdentifier");
		String fingerprint = req.getParameter("fingerprint");

		try {
			Item item = new Item(Integer.parseInt(idItem), itemIdentifier, fingerprint);
			LOGGER.info("Item idItem : " + item.getIdItem());
			LOGGER.info("Item itemIdentifier : " + item.getItemIdentifier());
			LOGGER.info("Item fingerprint : " + item.getFingerprint());
			
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
