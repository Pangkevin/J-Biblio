package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.Item;

class ItemJsonServletTest extends Mockito {

	@Test
	public void testServlet() throws Exception {
		/*
		 * */
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		Item item = new Item(412, "A12S3", "DS21T47DT");
		ObjectMapper mapper = new ObjectMapper();
		String jsonItem = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(writer);

		new ItemJsonServlet().doGet(request, response);

		writer.flush(); // it may not have been flushed yet...

		assertTrue(stringWriter.toString().contains(jsonItem));
	}
}
