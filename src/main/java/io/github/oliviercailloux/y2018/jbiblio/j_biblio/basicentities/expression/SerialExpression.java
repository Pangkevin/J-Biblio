package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * Specific class of Expression Abandoned - Will not be developped
 *
 */
public class SerialExpression extends Expression {

	private String sequencingPattern;
	private boolean expectedRegularityOfIssue;
	private String expectedFrequencyOfIssue;

	public SerialExpression(Work work, int idExpression, String formOfExpression,
			Collection<TimeStampedDescription> dateOfExpression, String languageOfExpression) {
		super(work, idExpression, formOfExpression, dateOfExpression, languageOfExpression);

	}

	public String getSequencingPattern() {
		return sequencingPattern;
	}

	public void setSequencingPattern(String sequencingPattern) {
		this.sequencingPattern = sequencingPattern;
	}

	public boolean isExpectedRegularityOfIssue() {
		return expectedRegularityOfIssue;
	}

	public void setExpectedRegularityOfIssue(boolean expectedRegularityOfIssue) {
		this.expectedRegularityOfIssue = expectedRegularityOfIssue;
	}

	public String getExpectedFrequencyOfIssue() {
		return expectedFrequencyOfIssue;
	}

	public void setExpectedFrequencyOfIssue(String expectedFrequencyOfIssue) {
		this.expectedFrequencyOfIssue = expectedFrequencyOfIssue;
	}
}
