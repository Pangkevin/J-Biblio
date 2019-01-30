package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.DateStructure;

public class ExpressionTest {
	@Test
	public void createExpression() {

		Collection<String> titleOfWork = new ArrayList<String>();
		titleOfWork.add("Romeo and Juliet");
		String formOfWork = "play";

		Collection<DateStructure> collectionDateStructure = new ArrayList<DateStructure>();
		Date date = new Date(1598, 1, 1);
		DateStructure dateStructure = new DateStructure("1598", date);
		collectionDateStructure.add(dateStructure);
		Work work = new Work(123, titleOfWork, formOfWork);

		String formOfExpression = "movie";
		String langageOfExpression = "English";
		Expression expression = new Expression(123, 500, formOfExpression, collectionDateStructure,
				langageOfExpression);

		assertEquals(expression.getIdWork(), 123);
		assertTrue(expression.getDateOfExpression().contains(dateStructure));
		assertEquals(expression.getIdExpression(), 500);
		assertEquals(expression.getFormOfExpression(), "movie");
		assertEquals(expression.getLanguageOfExpression(), "English");

	}

}
