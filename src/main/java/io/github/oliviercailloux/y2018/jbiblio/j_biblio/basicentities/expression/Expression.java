package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * 
 */
@Entity
public class Expression {

	/**
	 * Not <code>null</code>.
	 */
	@ManyToOne
	private Work work;
	/**
	 * Not <code>null</code>.
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idExpression;
	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "expression", cascade = { CascadeType.ALL })
	private Collection<Manifestation> manifestations;
	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	private Collection<String> titleOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "formOfExpression")
	private String formOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@Transient
	private Collection<TimeStampedDescription> dateOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "languageOfExpression")
	private String languageOfExpression;
	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	private Collection<String> otherDistinguishingCharacteristic;

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
			Collection<TimeStampedDescription> dateOfExpression, String languageOfExpression) {
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

	public Collection<Manifestation> getManifestations() {
		return manifestations;
	}

	public void setIdManifestations(Collection<Manifestation> manifestations) {
		this.manifestations = Objects.requireNonNull(manifestations);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Collection<String> getTitleOfExpression() {
		return titleOfExpression;
	}

	public void setTitleOfExpression(Collection<String> titleOfExpression) {
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
	public Collection<TimeStampedDescription> getDateOfExpression() {
		return dateOfExpression;
	}

	/**
	 * @param dateOfExpression not <code>null</code>.
	 */
	public void setDateOfExpression(Collection<TimeStampedDescription> dateOfExpression) {
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
	public Collection<String> getOtherDistinguishingCharacteristic() {
		return otherDistinguishingCharacteristic;
	}

	/**
	 * @param otherDistinguishingCharacteristic not <code>null</code>.
	 */
	public void setOtherDistinguishingCharacteristic(Collection<String> otherDistinguishingCharacteristic) {
		this.otherDistinguishingCharacteristic = Objects.requireNonNull(otherDistinguishingCharacteristic);
	}

}
