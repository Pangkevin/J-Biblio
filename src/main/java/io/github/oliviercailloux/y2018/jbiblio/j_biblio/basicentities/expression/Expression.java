package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.json.bind.annotation.JsonbPropertyOrder;
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * 
 */

@XmlRootElement(name = "Expression")
@XmlAccessorType(XmlAccessType.NONE)
@JsonbPropertyOrder({ "idExpression", "work", "titleOfExpression", "formOfExpression", "languageOfExpression",
		"otherDistinguishingCharacteristic" })
@Entity
@Table(name = "Expression")
public class Expression {

	/**
	 * Not <code>null</code>.
	 */

	@ManyToOne
	@XmlElement
	private Work work;
	/**
	 * Not <code>null</code>.
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@XmlElement
	private int idExpression;
	/**
	 * Not <code>null</code>.
	 */
	@XmlTransient
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "expression", cascade = { CascadeType.ALL })
	private List<Manifestation> manifestations;
	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	@XmlElement
	private List<String> titleOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "formOfExpression")
	@XmlElement
	private String formOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@Transient
	@XmlElement
	private List<TimeStampedDescription> dateOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "languageOfExpression")
	@XmlElement
	private String languageOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	@XmlElement
	private List<String> otherDistinguishingCharacteristic;

	/*
	 * Attributs qui ne seront pas développés private String
	 * extensibilityOfExpression; private String revisabilityOfExpression; private
	 * Integer extentOfTheExpression; private String summarizationOfContent; private
	 * String contextForTheExpression; private String
	 * criticalResponseToTheExpression; private String
	 * useRestrictionsOnTheExpression;
	 */

	public Expression() {

		this.formOfExpression = "";
		this.languageOfExpression = "";
		this.dateOfExpression = new ArrayList<>();
		this.titleOfExpression = new ArrayList<>();
		this.manifestations = new ArrayList<>();
		this.otherDistinguishingCharacteristic = new ArrayList<>();

	}

	public Expression(Work work, int idExpression, String formOfExpression,
			List<TimeStampedDescription> dateOfExpression, String languageOfExpression) {
		this.work = Objects.requireNonNull(work);
		this.idExpression = Objects.requireNonNull(idExpression);
		this.formOfExpression = Objects.requireNonNull(formOfExpression);
		this.dateOfExpression = Objects.requireNonNull(dateOfExpression);
		this.languageOfExpression = Objects.requireNonNull(languageOfExpression);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public int getIdWork() {
		return this.work.getIdWork();
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Work getWork() {
		return this.work;
	}

	/**
	 * @param otherDistinguishingCharacteristic not <code>null</code>.
	 */
	public void setWork(Work work) {
		this.work = Objects.requireNonNull(work);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public int getIdExpression() {
		return idExpression;
	}

	public void setIdExpression(int idExpression) {
		this.idExpression = idExpression;
	}

	public List<Manifestation> getManifestations() {
		return manifestations;
	}

	public void setIdManifestations(List<Manifestation> manifestations) {
		this.manifestations = Objects.requireNonNull(manifestations);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<String> getTitleOfExpression() {
		return titleOfExpression;
	}

	public void setTitleOfExpression(List<String> titleOfExpression) {
		this.titleOfExpression = Objects.requireNonNull(titleOfExpression);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getFormOfExpression() {
		return formOfExpression;
	}

	public void setFormOfExpression(String formOfExpression) {
		this.formOfExpression = Strings.nullToEmpty(formOfExpression);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<TimeStampedDescription> getDateOfExpression() {
		return dateOfExpression;
	}

	/**
	 * @param dateOfExpression not <code>null</code>.
	 */
	public void setDateOfExpression(List<TimeStampedDescription> dateOfExpression) {
		this.dateOfExpression = Objects.requireNonNull(dateOfExpression);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getLanguageOfExpression() {
		return languageOfExpression;
	}

	/**
	 * @param languageOfExpression if <code>null</code>, will be converted to an
	 *                             empty string.
	 */
	public void setLanguageOfExpression(String languageOfExpression) {
		this.languageOfExpression = Strings.nullToEmpty(languageOfExpression);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<String> getOtherDistinguishingCharacteristic() {
		return otherDistinguishingCharacteristic;
	}

	/**
	 * @param otherDistinguishingCharacteristic not <code>null</code>.
	 */
	public void setOtherDistinguishingCharacteristic(List<String> otherDistinguishingCharacteristic) {
		this.otherDistinguishingCharacteristic = Objects.requireNonNull(otherDistinguishingCharacteristic);
	}

}
