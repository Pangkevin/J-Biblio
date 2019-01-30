package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.SubType_Expression;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
/**
 * Specific class of Expression
 *
 *
 */
public class MusicalExpression extends Expression {



	private String typeOfScore;
	private Collection<String> mediumOfPerformance;
	
	public MusicalExpression(int idWork, int idExpression, String formOfExpression,
			Collection<TimeStampedDescription> dateOfExpression, String languageOfExpression) {
		super(idWork, idExpression, formOfExpression, dateOfExpression, languageOfExpression);

	}
	
	public String getTypeOfScore() {
		return typeOfScore;
	}
	public void setTypeOfScore(String typeOfScore) {
		this.typeOfScore = typeOfScore;
	}
	public Collection<String> getMediumOfPerformance() {
		return mediumOfPerformance;
	}
	public void setMediumOfPerformance(Collection<String> mediumOfPerformance) {
		this.mediumOfPerformance = mediumOfPerformance;
	}
	
	
}
