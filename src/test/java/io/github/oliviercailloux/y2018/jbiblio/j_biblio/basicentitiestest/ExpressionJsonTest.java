package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;

public class ExpressionJsonTest {

	@Test
	public void testConvertJsonToExpressionObject() throws Exception {

		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = new BufferedReader(
					new StringReader("{\"formOfExpression\":\"writing\",\"languageOfExpression\":\"FR\"}"));) {

				Expression expression = jsonb.fromJson(reader, Expression.class);
				assertEquals(expression.getFormOfExpression(), "writing");
				assertEquals(expression.getLanguageOfExpression(), "FR");
				;
			}
		}

	}


}
