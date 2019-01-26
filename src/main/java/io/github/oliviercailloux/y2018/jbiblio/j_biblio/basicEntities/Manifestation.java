package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleEntity.*;

public class Manifestation {
	private int idManifestation;
	private Collection<Integer> idItems;
	private Collection<String> titleOfTheManifestation;
	private Collection<IResponsibleEntity> statementOfResponsibility;
	private String editionDesignation;
	private Collection<Integer> placeOfPublicationDistribution;
	private Collection<IResponsibleEntity> publisherDistributer;
	private Collection<TimeStampedDescription> dateOfPublicationDistribution;
	private Collection<IResponsibleEntity> fabricatorManufacturer;
	private Collection<String> seriesStatement;
	private Collection<String> formOfCarrier;
	private Collection<String> extentOfTheCarrier;
	private Collection<String> physicalMedium;
	private Collection<String> captureMode;
	private String dimensionsOfTheCarrier;
	private String manifestationIdentifier;
	private Collection<IResponsibleEntity> sourceForAcquisition;
	private String termsOfAvailability;
	private String accessRestrictions;
	private String typeface;
	private int typeSize;
	private String foliation;
	private String collation;
	private String publicationStatus;
	private Collection<String> numbering;
	private String playingSpeed;
	private String grooveWidth;
	private String kindOfCutting;
	private int tapeConfiguration;
	private String kindOfSound;
	private String specialReproductionCharacteristic;
	private String colour;
	private String reductionRatio;
	private String polarity;
	private String generation;
	private String presentationFormat;
	private Collection<String> systemRequirements;
	private Collection<String> fileCharacteristics;
	private Collection<String> modeOfAccess;
	private String accessAddress;

	public Manifestation(int idManifestation, Collection<Integer> idItems, Collection<String> titleOfTheManifestation) {
		this.idManifestation = idManifestation;
		this.idItems = idItems;
		this.titleOfTheManifestation = titleOfTheManifestation;
	}

	public int getIdManifestation() {
		return idManifestation;
	}

	public void setIdManifestation(int idManifestation) {
		this.idManifestation = idManifestation;
	}

	public Collection<Integer> getIdItems() {
		return idItems;
	}

	public void setIdItems(Collection<Integer> idItems) {
		this.idItems = idItems;
	}

	public Collection<String> getTitleOfTheManifestation() {
		return titleOfTheManifestation;
	}

	public void setTitleOfTheManifestation(Collection<String> titleOfTheManifestation) {
		this.titleOfTheManifestation = titleOfTheManifestation;
	}

	public Collection<IResponsibleEntity> getStatementOfResponsibility() {
		return statementOfResponsibility;
	}

	public void setStatementOfResponsibility(Collection<IResponsibleEntity> statementOfResponsibility) {
		this.statementOfResponsibility = statementOfResponsibility;
	}

	public String getEditionDesignation() {
		return editionDesignation;
	}

	public void setEditionDesignation(String editionDesignation) {
		this.editionDesignation = editionDesignation;
	}

	public Collection<Integer> getPlaceOfPublicationDistribution() {
		return placeOfPublicationDistribution;
	}

	public void setPlaceOfPublicationDistribution(Collection<Integer> placeOfPublicationDistribution) {
		this.placeOfPublicationDistribution = placeOfPublicationDistribution;
	}

	public Collection<IResponsibleEntity> getPublisherDistributer() {
		return publisherDistributer;
	}

	public void setPublisherDistributer(Collection<IResponsibleEntity> publisherDistributer) {
		this.publisherDistributer = publisherDistributer;
	}

	public Collection<TimeStampedDescription> getDateOfPublicationDistribution() {
		return dateOfPublicationDistribution;
	}

	public void setDateOfPublicationDistribution(Collection<TimeStampedDescription> dateOfPublicationDistribution) {
		this.dateOfPublicationDistribution = dateOfPublicationDistribution;
	}

	public Collection<IResponsibleEntity> getFabricatorManufacturer() {
		return fabricatorManufacturer;
	}

	public void setFabricatorManufacturer(Collection<IResponsibleEntity> fabricatorManufacturer) {
		this.fabricatorManufacturer = fabricatorManufacturer;
	}

	public Collection<String> getSeriesStatement() {
		return seriesStatement;
	}

	public void setSeriesStatement(Collection<String> seriesStatement) {
		this.seriesStatement = seriesStatement;
	}

	public Collection<String> getFormOfCarrier() {
		return formOfCarrier;
	}

	public void setFormOfCarrier(Collection<String> formOfCarrier) {
		this.formOfCarrier = formOfCarrier;
	}

	public Collection<String> getExtentOfTheCarrier() {
		return extentOfTheCarrier;
	}

	public void setExtentOfTheCarrier(Collection<String> extentOfTheCarrier) {
		this.extentOfTheCarrier = extentOfTheCarrier;
	}

	public Collection<String> getPhysicalMedium() {
		return physicalMedium;
	}

	public void setPhysicalMedium(Collection<String> physicalMedium) {
		this.physicalMedium = physicalMedium;
	}

	public Collection<String> getCaptureMode() {
		return captureMode;
	}

	public void setCaptureMode(Collection<String> captureMode) {
		this.captureMode = captureMode;
	}

	public String getDimensionsOfTheCarrier() {
		return dimensionsOfTheCarrier;
	}

	public void setDimensionsOfTheCarrier(String dimensionsOfTheCarrier) {
		this.dimensionsOfTheCarrier = dimensionsOfTheCarrier;
	}

	public String getManifestationIdentifier() {
		return manifestationIdentifier;
	}

	public void setManifestationIdentifier(String manifestationIdentifier) {
		this.manifestationIdentifier = manifestationIdentifier;
	}

	public Collection<IResponsibleEntity> getSourceForAcquisition() {
		return sourceForAcquisition;
	}

	public void setSourceForAcquisition(Collection<IResponsibleEntity> sourceForAcquisition) {
		this.sourceForAcquisition = sourceForAcquisition;
	}

	public String getTermsOfAvailability() {
		return termsOfAvailability;
	}

	public void setTermsOfAvailability(String termsOfAvailability) {
		this.termsOfAvailability = termsOfAvailability;
	}

	public String getAccessRestrictions() {
		return accessRestrictions;
	}

	public void setAccessRestrictions(String accessRestrictions) {
		this.accessRestrictions = accessRestrictions;
	}

	public String getTypeface() {
		return typeface;
	}

	public void setTypeface(String typeface) {
		this.typeface = typeface;
	}

	public int getTypeSize() {
		return typeSize;
	}

	public void setTypeSize(int typeSize) {
		this.typeSize = typeSize;
	}

	public String getFoliation() {
		return foliation;
	}

	public void setFoliation(String foliation) {
		this.foliation = foliation;
	}

	public String getCollation() {
		return collation;
	}

	public void setCollation(String collation) {
		this.collation = collation;
	}

	public String getPublicationStatus() {
		return publicationStatus;
	}

	public void setPublicationStatus(String publicationStatus) {
		this.publicationStatus = publicationStatus;
	}

	public Collection<String> getNumbering() {
		return numbering;
	}

	public void setNumbering(Collection<String> numbering) {
		this.numbering = numbering;
	}

	public String getPlayingSpeed() {
		return playingSpeed;
	}

	public void setPlayingSpeed(String playingSpeed) {
		this.playingSpeed = playingSpeed;
	}

	public String getGrooveWidth() {
		return grooveWidth;
	}

	public void setGrooveWidth(String grooveWidth) {
		this.grooveWidth = grooveWidth;
	}

	public String getKindOfCutting() {
		return kindOfCutting;
	}

	public void setKindOfCutting(String kindOfCutting) {
		this.kindOfCutting = kindOfCutting;
	}

	public int getTapeConfiguration() {
		return tapeConfiguration;
	}

	public void setTapeConfiguration(int tapeConfiguration) {
		this.tapeConfiguration = tapeConfiguration;
	}

	public String getKindOfSound() {
		return kindOfSound;
	}

	public void setKindOfSound(String kindOfSound) {
		this.kindOfSound = kindOfSound;
	}

	public String getSpecialReproductionCharacteristic() {
		return specialReproductionCharacteristic;
	}

	public void setSpecialReproductionCharacteristic(String specialReproductionCharacteristic) {
		this.specialReproductionCharacteristic = specialReproductionCharacteristic;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getReductionRatio() {
		return reductionRatio;
	}

	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public String getPolarity() {
		return polarity;
	}

	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public String getPresentationFormat() {
		return presentationFormat;
	}

	public void setPresentationFormat(String presentationFormat) {
		this.presentationFormat = presentationFormat;
	}

	public Collection<String> getSystemRequirements() {
		return systemRequirements;
	}

	public void setSystemRequirements(Collection<String> systemRequirements) {
		this.systemRequirements = systemRequirements;
	}

	public Collection<String> getFileCharacteristics() {
		return fileCharacteristics;
	}

	public void setFileCharacteristics(Collection<String> fileCharacteristics) {
		this.fileCharacteristics = fileCharacteristics;
	}

	public Collection<String> getModeOfAccess() {
		return modeOfAccess;
	}

	public void setModeOfAccess(Collection<String> modeOfAccess) {
		this.modeOfAccess = modeOfAccess;
	}

	public String getAccessAddress() {
		return accessAddress;
	}

	public void setAccessAddress(String accessAddress) {
		this.accessAddress = accessAddress;
	}

}
