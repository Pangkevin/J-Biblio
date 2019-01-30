package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.SubType_Expression;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
/**
 * Specific class of Expression
 *
 */
public class SerialExpression extends Expression {

	private String sequencingPattern;
	private boolean expectedRegularityOfIssue; 
	private String expectedFrequencyOfIssue; 

	public SerialExpression(int idWork, int idExpression, String formOfExpression,
			Collection<TimeStampedDescription> dateOfExpression, String languageOfExpression) {
		super(idWork, idExpression, formOfExpression, dateOfExpression, languageOfExpression);

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
