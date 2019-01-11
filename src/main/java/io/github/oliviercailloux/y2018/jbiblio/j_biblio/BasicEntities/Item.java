package io.github.oliviercailloux.y2018.jbiblio.j_biblio.BasicEntities;

public class Item {
	private int idItem;
	private String itemIdentifier;
	private String fingerprint;
	private String provenanceOfTheItem;
	private String marks_Inscriptions;
	private String exhibitionHistory;
	private String conditionOfTheItem;
	private String treatmentHistory;
	private String scheduledTreatment;
	private String accessRestrictionsOnTheItem;

	public Item(int idItem, String itemIdentifier, String fingerprint) {
		this.idItem = idItem;
		this.itemIdentifier = itemIdentifier;
		this.fingerprint = fingerprint;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getItemIdentifier() {
		return itemIdentifier;
	}

	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getProvenanceOfTheItem() {
		return provenanceOfTheItem;
	}

	public void setProvenanceOfTheItem(String provenanceOfTheItem) {
		this.provenanceOfTheItem = provenanceOfTheItem;
	}

	public String getMarks_Inscriptions() {
		return marks_Inscriptions;
	}

	public void setMarks_Inscriptions(String marks_Inscriptions) {
		this.marks_Inscriptions = marks_Inscriptions;
	}

	public String getExhibitionHistory() {
		return exhibitionHistory;
	}

	public void setExhibitionHistory(String exhibitionHistory) {
		this.exhibitionHistory = exhibitionHistory;
	}

	public String getConditionOfTheItem() {
		return conditionOfTheItem;
	}

	public void setConditionOfTheItem(String conditionOfTheItem) {
		this.conditionOfTheItem = conditionOfTheItem;
	}

	public String getTreatmentHistory() {
		return treatmentHistory;
	}

	public void setTreatmentHistory(String treatmentHistory) {
		this.treatmentHistory = treatmentHistory;
	}

	public String getScheduledTreatment() {
		return scheduledTreatment;
	}

	public void setScheduledTreatment(String scheduledTreatment) {
		this.scheduledTreatment = scheduledTreatment;
	}

	public String getAccessRestrictionsOnTheItem() {
		return accessRestrictionsOnTheItem;
	}

	public void setAccessRestrictionsOnTheItem(String accessRestrictionsOnTheItem) {
		this.accessRestrictionsOnTheItem = accessRestrictionsOnTheItem;
	}

}
