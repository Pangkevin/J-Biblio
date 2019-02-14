package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * Specific class of Expression Abandoned - Will not be developped
 *
 */
public class ImageExpression extends Expression {

	private Integer scale;
	private String projection;
	private String presentationTechnique;
	private String representationOfRelief;
	private Collection<String> geodetic;
	private String recordingTechnique;
	private Collection<String> specialCharacteristic;
	private String technique;

	public ImageExpression(Work work, int idExpression, String formOfExpression,
			Collection<TimeStampedDescription> dateOfExpression, String languageOfExpression) {
		super(work, idExpression, formOfExpression, dateOfExpression, languageOfExpression);

	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public String getProjection() {
		return projection;
	}

	public void setProjection(String projection) {
		this.projection = projection;
	}

	public String getPresentationTechnique() {
		return presentationTechnique;
	}

	public void setPresentationTechnique(String presentationTechnique) {
		this.presentationTechnique = presentationTechnique;
	}

	public String getRepresentationOfRelief() {
		return representationOfRelief;
	}

	public void setRepresentationOfRelief(String representationOfRelief) {
		this.representationOfRelief = representationOfRelief;
	}

	public Collection<String> getGeodetic() {
		return geodetic;
	}

	public void setGeodetic(Collection<String> geodetic) {
		this.geodetic = geodetic;
	}

	public String getRecordingTechnique() {
		return recordingTechnique;
	}

	public void setRecordingTechnique(String recordingTechnique) {
		this.recordingTechnique = recordingTechnique;
	}

	public Collection<String> getSpecialCharacteristic() {
		return specialCharacteristic;
	}

	public void setSpecialCharacteristic(Collection<String> specialCharacteristic) {
		this.specialCharacteristic = specialCharacteristic;
	}

	public String getTechnique() {
		return technique;
	}

	public void setTechnique(String technique) {
		this.technique = technique;
	}

}
