package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

public class ExpressionTest {
	@Test
	public void createExpression() {

		try {

			Collection<String> titleOfWork = new ArrayList<>();
			titleOfWork.add("Romeo and Juliet");
			String formOfWork = "play";

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			Collection<TimeStampedDescription> collectionDateStructure = new ArrayList<>();
			String createdate = "1603-01-01";
			Instant createDate;

			createDate = formatter.parse(createdate).toInstant();

			TimeStampedDescription dateStructure = new TimeStampedDescription("1598", createDate);
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

		} catch (ParseException e) {
			e.printStackTrace();
			assertFalse(true);
		}

	}

}
