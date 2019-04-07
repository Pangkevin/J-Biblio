package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;

class ManifestationJsonTest {

	@Test
	void testConvertManifestationToJson() throws Exception {

		List<Manifestation> listJsonManifestation = new ArrayList<>();
		String jsonRepresentation = "[{\"idManifestation\":0,\"titleOfTheManifestation\":[],\"statementOfResponsibility\":[],\"editionDesignation\":\"larousse\",\"placeOfPublicationDistribution\":[],\"publisherDistributer\":[],\"dateOfPublicationDistribution\":[],\"items\":[]}]";

		Manifestation manifestation = new Manifestation();
		manifestation.setEditionDesignation("larousse");

		listJsonManifestation.add(manifestation);

		try (Jsonb jsonb = JsonbBuilder.create();) {

			String jsonManifestation = jsonb.toJson(listJsonManifestation);
			System.out.println(jsonManifestation);
			assertEquals(jsonManifestation, jsonRepresentation);
		}
	}

	@Test
	void testConvertJsonToManifestation() throws Exception {

		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = new BufferedReader(
					new StringReader("{\"editionDesignation\":\"larousse\"}"));) {
				/**
				 * we used fromJson(BufferedReader, Class) in doPost method to convert a Json
				 * format to an Item Object
				 */
				Manifestation manifestation = jsonb.fromJson(reader, Manifestation.class);
				assertEquals(manifestation.getEditionDesignation(), "larousse");

			}
		}

	}
}
