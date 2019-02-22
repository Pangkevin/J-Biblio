package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * This class use Mockito to test doPost and doGet methods which are in the
 * ItemJsonServlet class
 *
 */
class ItemJsonServletTest extends Mockito {

	@Test
	public void testDoGet() throws Exception {
		/*
		 * Create the mock object of HttpServletRequest and HttpServletResponse
		 */
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);

		/*
		 * Mock parameter
		 */
		when(request.getParameter("idItem")).thenReturn("412");
		when(request.getParameter("idManifestation")).thenReturn("420");
		when(request.getParameter("itemIdentifier")).thenReturn("A12S3");
		when(request.getParameter("fingerprint")).thenReturn("DS21T47DT");
		when(request.getParameter("provenanceOfTheItem")).thenReturn("AAA");
		when(response.getWriter()).thenReturn(writer);
		// Call servlet
		new ItemJsonServlet().doGet(request, response);
		writer.flush();
		assertTrue(stringWriter.toString().contains(
				"{\"idItem\":412,\"idManifestation\":420,\"itemIdentifier\":\"A12S3\",\"fingerprint\":\"DS21T47DT\",\"provenanceOfTheItem\":\"AAA\"}"));

	}

	@Test
	public void testDoPost() throws Exception {
		/*
		 * Create the mock object of HttpServletRequest and HttpServletResponse
		 */
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		String js = "{\"fingerprint\":\"DS21T47DT\",\"idItem\":412,\"idManifestation\":412,\"itemIdentifier\":\"A12S3\",\"provenanceOfTheItem\":\"RES\"}";
		try (BufferedReader bf = new BufferedReader(new StringReader(js));) {

			/*
			 * mock the behavior of response to return the value of writer
			 */
			when(request.getReader()).thenReturn(bf);
			when(response.getWriter()).thenReturn(writer);

			new ItemJsonServlet().doPost(request, response);
			writer.flush();
			/*
			 * Last step to test if the output of message error is correct
			 */
			assertTrue(stringWriter.toString().contains("The object is successfully insert"));
		}
	}
}
