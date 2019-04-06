package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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

}
