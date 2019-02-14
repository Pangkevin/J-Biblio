package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

/**
 * This class use Mockito to test doPost and doGet methods which are in the
 * ItemJsonServlet class
 *
 */
class ItemJsonServletTest extends Mockito {
	// private static final Logger LOGGER =
	// Logger.getLogger(ItemJsonServlet.class.getCanonicalName());
	/*
	 * Create an object Item to test the output of JSON format
	 */
	Item item = new Item(412, 412, "A12S3", "DS21T47DT", "RES");

	@Test
	public void testDoGet() {
		/*
		 * Create the mock object of HttpServletRequest and HttpServletResponse
		 */
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		try (Jsonb jsonb = JsonbBuilder.create();) {

			/*
			 * transform a object item to a Jsonb format
			 */
			final String json = jsonb.toJson(item);
			/*
			 * mock the behavior of response to return the value of writer
			 */
			when(response.getWriter()).thenReturn(writer);

			new ItemJsonServlet().doGet(request, response);
			writer.flush();
			/*
			 * Last step to test if the output of JSON format is correct
			 */
			assertEquals(
					"{\"fingerprint\":\"DS21T47DT\",\"idItem\":412,\"idManifestation\":412,\"itemIdentifier\":\"A12S3\",\"provenanceOfTheItem\":\"RES\"}",
					json);

		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(stringWriter.toString().contains(" Display object in JSON format "));
		}
	}

	@Test
	public void testDoPost() {
		/*
		 * Create the mock object of HttpServletRequest and HttpServletResponse
		 */
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		try {
			/*
			 * mock the behavior of response to return the value of writer
			 */
			when(request.getParameter("idItem")).thenReturn("412");
			when(request.getParameter("idManifestation")).thenReturn("420");
			when(request.getParameter("itemIdentifier")).thenReturn("A12S3");
			when(request.getParameter("fingerprint")).thenReturn("DS21T47DT");
			when(request.getParameter("provenanceOfTheItem")).thenReturn("AAA");

			when(response.getWriter()).thenReturn(writer);

			new ItemJsonServlet().doPost(request, response);
			writer.flush();
			/*
			 * Last step to test if the output of message error is correct
			 */
			assertTrue(stringWriter.toString().contains("The object is successfully insert"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
