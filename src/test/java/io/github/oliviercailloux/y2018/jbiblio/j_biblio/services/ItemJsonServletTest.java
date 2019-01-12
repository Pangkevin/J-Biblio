package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.Item;

class ItemJsonServletTest extends Mockito {

	@Test
	public void testServlet() {
		try {
			/*
			 * Create the mock object of HttpServletRequest and HttpServletResponse
			 */
			HttpServletRequest request = mock(HttpServletRequest.class);
			HttpServletResponse response = mock(HttpServletResponse.class);
			/*
			 * Create an object Item to test the output of JSON format
			 */
			Item item = new Item(412, "A12S3", "DS21T47DT");
			ObjectMapper mapper = new ObjectMapper();
			String jsonItem = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
			/*
			 * */
			StringWriter stringWriter = new StringWriter();
			PrintWriter writer = new PrintWriter(stringWriter);
			/*
			 * mock the behavior of response to return the value of writer
			 */
			when(response.getWriter()).thenReturn(writer);

			new ItemJsonServlet().doGet(request, response);
			writer.flush();
			/*
			 * Last step to test if the output of JSON format is correct
			 */
			assertTrue(stringWriter.toString().contains(jsonItem));
		} catch (IOException e) {
			e.getStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
