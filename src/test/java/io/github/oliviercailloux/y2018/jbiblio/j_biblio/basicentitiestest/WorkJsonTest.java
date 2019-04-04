package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;

class WorkJsonTest {

	@Test
	public void testConvertJsonToWorkObject() throws Exception {

		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = new BufferedReader(new StringReader("{\"formOfWork\":\"toto\"}"));) {

				Work work = jsonb.fromJson(reader, Work.class);
				assertEquals(work.getFormOfWork(), "toto");

			}
		}

	}

	@Test
	void testConvertManifestationToJson() throws Exception {

		List<Work> listJsonManifestation = new ArrayList<>();
		String jsonRepresentation = "[{\"dateOfPublicationDistribution\":[],\"editionDesignation\":\"larousse\",\"idManifestation\":0,\"items\":[],\"placeOfPublicationDistribution\":[],\"publisherDistributer\":[],\"statementOfResponsibility\":[],\"titleOfTheManifestation\":[]}]";

		Work work = new Work();
		work.setFormOfWork("toto");

		listJsonManifestation.add(work);

		try (Jsonb jsonb = JsonbBuilder.create();) {

			String jsonManifestation = jsonb.toJson(listJsonManifestation);
			System.out.println(jsonManifestation);

		}
	}

}
