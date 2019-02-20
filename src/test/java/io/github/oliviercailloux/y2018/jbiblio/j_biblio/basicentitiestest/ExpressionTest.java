package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

public class ExpressionTest {
	@Test
	public void createExpression() {

		Collection<String> titleOfWork = new ArrayList<>();
		titleOfWork.add("Romeo and Juliet");
		String formOfWork = "play";

		Collection<TimeStampedDescription> collectionDateStructure = new ArrayList<>();

		TimeStampedDescription dateStructure = new TimeStampedDescription("1598", Instant.parse("1598-05-05T23:00:00Z"));
		collectionDateStructure.add(dateStructure);
		Work work = new Work(123, titleOfWork, formOfWork);

		String formOfExpression = "movie";
		String langageOfExpression = "English";
		Expression expression = new Expression(work, 500, formOfExpression, collectionDateStructure,
				langageOfExpression);

		assertEquals(expression.getIdWork(), 123);
		assertTrue(expression.getDateOfExpression().contains(dateStructure));
		assertEquals(expression.getIdExpression(), 500);
		assertEquals(expression.getFormOfExpression(), "movie");
		assertEquals(expression.getLanguageOfExpression(), "English");

	}

	@Test
	void testThrowsNullPointeurExpressionConstructor() {
		Collection<TimeStampedDescription> collectionDateStructure = new ArrayList<>();

		TimeStampedDescription dateStructure = new TimeStampedDescription("1598",Instant.parse("1598-05-05T23:00:00Z"));
		collectionDateStructure.add(dateStructure);

		String formOfExpression = "movie";
		String langageOfExpression = "English";

		assertThrows(NullPointerException.class, () -> {

			// Create manifestation
			@SuppressWarnings("unused")
			Expression expression = new Expression(null, 500, formOfExpression, collectionDateStructure,
					langageOfExpression);

		});
	}

}
