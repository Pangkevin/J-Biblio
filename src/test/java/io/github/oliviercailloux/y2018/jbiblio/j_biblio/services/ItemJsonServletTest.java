package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
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

	@Test
	public void testDoGet() throws Exception {

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
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
			assertTrue(stringWriter.toString().contains(
					"The object is successfully initialized. Database insertion  will be implemented in the next sprint"));
		}
	}

	@Test
	public void testConvertJsonToItemObject() throws Exception {

		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = new BufferedReader(new StringReader(
					"{\"fingerprint\":\"DS21T47DT\",\"idItem\":412,\"idManifestation\":420,\"itemIdentifier\":\"A12S3\",\"provenanceOfTheItem\":\"RES\"}"));) {
				/**
				 * we used fromJson(BufferedReader, Class) in doPost method to convert a Json
				 * format to an Item Object
				 */
				Item item = jsonb.fromJson(reader, Item.class);
				assertEquals(item.getIdItem(), 412);
				assertEquals(item.getIdManifestation(), 420);
				assertEquals(item.getItemIdentifier(), "A12S3");
				assertEquals(item.getFingerprint(), "DS21T47DT");
				assertEquals(item.getProvenanceOfTheItem(), "RES");
			}
		}

	}

}
