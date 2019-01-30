package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.*;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.*;

/**
 * This class represents the 3rd element from group 1 entities of FRBR model
 * Manifestation is the physical embodiment of an expression of a work We will
 * implement at a first place only the attributes related to publications We can
 * enhance the class later to include attributes related to other types of
 * manifestations (books, music, ...)
 */

public class Manifestation {
	private int idManifestation;
	private Collection<Integer> idItems;
	private Collection<String> titleOfTheManifestation;
	private Collection<ResponsibleEntity> statementOfResponsibility;
	private String editionDesignation;
	private Collection<Integer> placeOfPublicationDistribution;
	private Collection<ResponsibleEntity> publisherDistributer;
	private Collection<TimeStampedDescription> dateOfPublicationDistribution;
	public String manifestationIdentifier;

	/**
	 * This function is the constructor of manifestation entity
	 * 
	 * @param idManifestation                A systematic identifier of a
	 *                                       manifestation
	 * @param idItems                        A list of items that embody this
	 *                                       manifestation
	 * @param titleOfTheManifestation        Words or phrases that name the
	 *                                       manifestation
	 * @param statementOfResponsibility      One or more individuals or groups
	 *                                       responsible for the creation or
	 *                                       realization of the manifestation
	 * @param editionDesignation             The difference between the
	 *                                       manifestation and a related
	 *                                       manifestation previously issued by the
	 *                                       same publisher/distributor
	 * @param placeOfPublicationDistribution Ids of the places linked to the
	 *                                       publisher/distributor
	 * @param publisherDistributer           The individual, group, or organization
	 *                                       responsible for the publication,
	 *                                       distribution, issuing, or release of
	 *                                       the manifestation
	 * @param dateOfPublicationDistribution  The date of the public release of the
	 *                                       manifestation
	 * @param manifestationIdentifier        Number or code uniquely associated with
	 *                                       the manifestation to identify it
	 */

	public Manifestation(int idManifestation, Collection<Integer> idItems, Collection<String> titleOfTheManifestation,
			Collection<ResponsibleEntity> statementOfResponsibility, String editionDesignation,
			Collection<Integer> placeOfPublicationDistribution, Collection<ResponsibleEntity> publisherDistributer,
			Collection<TimeStampedDescription> dateOfPublicationDistribution, String manifestationIdentifier) {

		this.idManifestation = idManifestation;
		this.idItems = idItems;
		this.titleOfTheManifestation = titleOfTheManifestation;
		this.statementOfResponsibility = statementOfResponsibility;
		this.editionDesignation = editionDesignation;
		this.placeOfPublicationDistribution = placeOfPublicationDistribution;
		this.publisherDistributer = publisherDistributer;
		this.dateOfPublicationDistribution = dateOfPublicationDistribution;
		this.manifestationIdentifier = manifestationIdentifier;

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

	public Collection<ResponsibleEntity> getStatementOfResponsibility() {
		return statementOfResponsibility;
	}

	public void setStatementOfResponsibility(Collection<ResponsibleEntity> statementOfResponsibility) {
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

	public Collection<ResponsibleEntity> getPublisherDistributer() {
		return publisherDistributer;
	}

	public void setPublisherDistributer(Collection<ResponsibleEntity> publisherDistributer) {
		this.publisherDistributer = publisherDistributer;
	}

	public Collection<TimeStampedDescription> getDateOfPublicationDistribution() {
		return dateOfPublicationDistribution;
	}

	public void setDateOfPublicationDistribution(Collection<TimeStampedDescription> dateOfPublicationDistribution) {
		this.dateOfPublicationDistribution = dateOfPublicationDistribution;
	}

}
