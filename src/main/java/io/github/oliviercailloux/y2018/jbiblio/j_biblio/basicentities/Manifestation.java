package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities;

import java.io.Serializable;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.*;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.*;

/**
 * This class represents the 3rd element from group 1 entities of FRBR model
 * Manifestation is the physical embodiment of an expression of a work We will
 * implement at a first place only the attributes related to publications We can
 * enhance the class later to include attributes related to other types of
 * manifestations (books, music, ...)
 */

@SuppressWarnings("serial")
@XmlRootElement(name = "Manifestation")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@Entity
@Table(name = "Manifestation")
public class Manifestation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idManifestation;

	/**
	 * Not <code>null</code>.
	 */
	@ManyToOne
	private Expression expression;

	/**
	 * Not <code>null</code>.
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "manifestation", cascade = { CascadeType.ALL })
	private List<Item> items;

	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	private List<String> titleOfTheManifestation;

	/**
	 * Not <code>null</code>.
	 */
	@Transient
	private List<ResponsibleEntity> statementOfResponsibility;

	/**
	 * Not <code>null</code>, empty if unknown.
	 */
	private String editionDesignation;

	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	private List<Integer> placeOfPublicationDistribution;

	/**
	 * Not <code>null</code>. Adapted for the parsing from mods to java object
	 */
	@Transient
	private List<Place> lblPlaceOfPublication;

	/**
	 * Not <code>null</code>.
	 */

	@Transient
	private List<Person> publisherDistributer;

	@Transient
	private List<ResponsibleEntity> publisherDistributerResponsibleEntity;

	/**
	 * Not <code>null</code>.
	 */
	@Transient
	private List<TimeStampedDescription> dateOfPublicationDistribution;

	/**
	 * Not <code>null</code>. Adapted for the parsing from mods to java object
	 */
	@Transient
	private OriginInfo originInfo;

	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "manifestationIdentifier")
	private String manifestationIdentifier;

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

	public Manifestation(int idManifestation, List<Item> itemsList, List<String> titleOfTheManifestation,
			List<ResponsibleEntity> statementOfResponsibility, String editionDesignation,
			List<Integer> placeOfPublicationDistribution, List<Person> publisherDistributer,
			List<TimeStampedDescription> dateOfPublicationDistribution, String manifestationIdentifier) {

		this.idManifestation = idManifestation;
		this.items = Objects.requireNonNull(itemsList);
		this.titleOfTheManifestation = Objects.requireNonNull(titleOfTheManifestation);
		this.statementOfResponsibility = Objects.requireNonNull(statementOfResponsibility);
		this.editionDesignation = Objects.requireNonNull(editionDesignation);
		this.placeOfPublicationDistribution = Objects.requireNonNull(placeOfPublicationDistribution);
		this.publisherDistributer = Objects.requireNonNull(publisherDistributer);
		this.dateOfPublicationDistribution = Objects.requireNonNull(dateOfPublicationDistribution);
		this.manifestationIdentifier = Objects.requireNonNull(manifestationIdentifier);

	}

	public Manifestation() {
		this.items = new ArrayList<>();
		this.titleOfTheManifestation = new ArrayList<>();
		this.statementOfResponsibility = new ArrayList<>();
		this.editionDesignation = "";
		this.placeOfPublicationDistribution = new ArrayList<>();
		this.publisherDistributer = new ArrayList<>();
		this.dateOfPublicationDistribution = new ArrayList<>();
		this.manifestationIdentifier = "";

	}

	public int getIdManifestation() {
		return idManifestation;
	}

	public void setIdManifestation(int idManifestation) {
		this.idManifestation = idManifestation;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param idItems not <code>null</code>
	 */
	public void setItems(List<Item> items) {
		this.items = Objects.requireNonNull(items);
	}

	/**
	 * @return not <code>null</code>.
	 **/
	@XmlElementWrapper(name = "titleInfo")
	@XmlElement(name = "title")
	public List<String> getTitleOfTheManifestation() {
		return titleOfTheManifestation;
	}

	/**
	 * 
	 * @param titleOfTheManifestation not <code>null</code>
	 */
	public void setTitleOfTheManifestation(List<String> titleOfTheManifestation) {
		this.titleOfTheManifestation = Objects.requireNonNull(titleOfTheManifestation);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<ResponsibleEntity> getStatementOfResponsibility() {
		return statementOfResponsibility;
	}

	/**
	 * 
	 * @param statementOfResponsibility not <code>null</code>
	 */
	public void setStatementOfResponsibility(List<ResponsibleEntity> statementOfResponsibility) {
		this.statementOfResponsibility = Objects.requireNonNull(statementOfResponsibility);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getEditionDesignation() {
		return editionDesignation;
	}

	/**
	 * 
	 * @param editionDesignation if <code>null</code>, will be converted to an empty
	 *                           string.
	 */
	public void setEditionDesignation(String editionDesignation) {
		this.editionDesignation = Strings.nullToEmpty(editionDesignation);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<Integer> getPlaceOfPublicationDistribution() {
		return placeOfPublicationDistribution;
	}

	/**
	 * 
	 * @param placeOfPublicationDistribution not <code>null</code>
	 */
	public void setPlaceOfPublicationDistribution(List<Integer> placeOfPublicationDistribution) {
		this.placeOfPublicationDistribution = Objects.requireNonNull(placeOfPublicationDistribution);
	}

	/**
	 * @return not <code>null</code>. Adapted to objects parsed from mods to java
	 */
	public List<Person> getPublisherDistributer() {
		if (originInfo != null) {
			return originInfo.getPublisher();
		}
		return this.publisherDistributer;
	}

	/**
	 * 
	 * @param publisherDistributer not <code>null</code>
	 */
	public void setPublisherDistributer(List<Person> publisherDistributer) {
		originInfo.setPublisher(Objects.requireNonNull(publisherDistributer));
		this.publisherDistributer = Objects.requireNonNull(publisherDistributer);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<TimeStampedDescription> getDateOfPublicationDistribution() {
		return dateOfPublicationDistribution;
	}

	/**
	 * 
	 * @param dateOfPublicationDistribution not <code>null</code>
	 */
	public void setDateOfPublicationDistribution(List<TimeStampedDescription> dateOfPublicationDistribution) {
		this.dateOfPublicationDistribution = Objects.requireNonNull(dateOfPublicationDistribution);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<Place> getPlaceOfPublication() {
		if (originInfo != null) {
			return originInfo.getPlace();
		}
		return this.lblPlaceOfPublication;
	}

	public void setPlaceOfPublication(List<Place> placeOfPublication) {
		originInfo.setPlace(Objects.requireNonNull(placeOfPublication));
		this.lblPlaceOfPublication = Objects.requireNonNull(placeOfPublication);
	}

	@XmlElement(name = "originInfo", type = OriginInfo.class)
	public OriginInfo getOriginInfo() {
		return originInfo;
	}

	public void setOriginInfo(OriginInfo originInfo) {
		this.originInfo = Objects.requireNonNull(originInfo);
	}

}
