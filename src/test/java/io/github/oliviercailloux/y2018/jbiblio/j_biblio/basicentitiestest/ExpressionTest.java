package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

public class ExpressionTest {

	@Test
	void testThrowsNullPointeurExpressionConstructor() {
		List<TimeStampedDescription> collectionDateStructure = new ArrayList<>();

		TimeStampedDescription dateStructure = new TimeStampedDescription("1598",
				Instant.parse("1598-05-05T23:00:00Z"));
		collectionDateStructure.add(dateStructure);

		String formOfExpression = "movie";
		String langageOfExpression = "English";

		assertThrows(NullPointerException.class, () -> {

			// Create manifestation

			new Expression(null, 500, formOfExpression, collectionDateStructure, langageOfExpression);

		});
	}

}
