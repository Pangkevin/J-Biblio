package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
/**
 * 
 * @see ImageExpression, MusicalExpression, SerialExpresison
 */
public class Expression {
	
	private int idWork;
	private int idExpression;
	private Collection<Integer> idManifestations;
	
	private Collection<String> titleOfExpression;
	private String formOfExpression;
	private Collection<TimeStampedDescription> dateOfExpression;
	private String languageOfExpression;
	private Collection<String> otherDistinguishingCharacteristic;
	private String extensibilityOfExpression;
	private String revisabilityOfExpression;
	private Integer extentOfTheExpression;
	private String summarizationOfContent;
	private String contextForTheExpression;
	private String criticalResponseToTheExpression;
	private String useRestrictionsOnTheExpression;
	
	public Expression(int idWork, int idExpression, String formOfExpression, Collection<TimeStampedDescription> dateOfExpression, String languageOfExpression){
		this.setIdWork(idWork);
		this.idExpression = idExpression;
		this.formOfExpression = formOfExpression;
		this.dateOfExpression = dateOfExpression;
		this.languageOfExpression = languageOfExpression;
	}
	
	public int getIdWork() {
		return idWork;
	}

	public void setIdWork(int idWork) {
		this.idWork = idWork;
	}

	public int getIdExpression() {
		return idExpression;
	}
	public void setIdExpression(int idExpression) {
		this.idExpression = idExpression;
	}
	public Collection<Integer> getIdManifestations() {
		return idManifestations;
	}
	public void setIdManifestations(Collection<Integer> idManifestations) {
		this.idManifestations = idManifestations;
	}
	public Collection<String> getTitleOfExpression() {
		return titleOfExpression;
	}
	public void setTitleOfExpression(Collection<String> titleOfExpression) {
		this.titleOfExpression = titleOfExpression;
	}
	public String getFormOfExpression() {
		return formOfExpression;
	}
	public void setFormOfExpression(String formOfExpression) {
		this.formOfExpression = formOfExpression;
	}
	public Collection<TimeStampedDescription> getDateOfExpression() {
		return dateOfExpression;
	}
	public void setDateOfExpression(Collection<TimeStampedDescription> dateOfExpression) {
		this.dateOfExpression = dateOfExpression;
	}
	public String getLanguageOfExpression() {
		return languageOfExpression;
	}
	public void setLanguageOfExpression(String languageOfExpression) {
		this.languageOfExpression = languageOfExpression;
	}
	public Collection<String> getOtherDistinguishingCharacteristic() {
		return otherDistinguishingCharacteristic;
	}
	public void setOtherDistinguishingCharacteristic(Collection<String> otherDistinguishingCharacteristic) {
		this.otherDistinguishingCharacteristic = otherDistinguishingCharacteristic;
	}
	public String getExtensibilityOfExpression() {
		return extensibilityOfExpression;
	}
	public void setExtensibilityOfExpression(String extensibilityOfExpression) {
		this.extensibilityOfExpression = extensibilityOfExpression;
	}
	public String getRevisabilityOfExpression() {
		return revisabilityOfExpression;
	}
	public void setRevisabilityOfExpression(String revisabilityOfExpression) {
		this.revisabilityOfExpression = revisabilityOfExpression;
	}
	public Integer getExtentOfTheExpression() {
		return extentOfTheExpression;
	}
	public void setExtentOfTheExpression(Integer extentOfTheExpression) {
		this.extentOfTheExpression = extentOfTheExpression;
	}
	public String getSummarizationOfContent() {
		return summarizationOfContent;
	}
	public void setSummarizationOfContent(String summarizationOfContent) {
		this.summarizationOfContent = summarizationOfContent;
	}
	public String getContextForTheExpression() {
		return contextForTheExpression;
	}
	public void setContextForTheExpression(String contextForTheExpression) {
		this.contextForTheExpression = contextForTheExpression;
	}
	public String getCriticalResponseToTheExpression() {
		return criticalResponseToTheExpression;
	}
	public void setCriticalResponseToTheExpression(String criticalResponseToTheExpression) {
		this.criticalResponseToTheExpression = criticalResponseToTheExpression;
	}
	public String getUseRestrictionsOnTheExpression() {
		return useRestrictionsOnTheExpression;
	}
	public void setUseRestrictionsOnTheExpression(String useRestrictionsOnTheExpression) {
		this.useRestrictionsOnTheExpression = useRestrictionsOnTheExpression;
	}
	
	
	

	
	
	
}
