package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 */

@Entity
@Table(name = "Work")
@JsonbPropertyOrder({ "idWork", "titleOfWork", "formOfWork", "dateOfWork", "otherDistinguishingCharacteristic",
		"intendedTermination", "intendedAudience", "contextForTheWork" })
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Work {

	/**
	 * Not <code>null</code>.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@XmlElement
	private int idWork;

	/**
	 * Not <code>null</code>.
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "work", cascade = { CascadeType.ALL })
	@XmlElementWrapper(name = "expressions")
	@XmlElement(name = "expression")
	private List<Expression> expressions;

	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	@XmlElementWrapper(name = "titles")
	@XmlElement(name = "title")
	private List<String> titleOfWork;

	/**
	 * Class to which the work belongs (novel play etc.) Not <code>null</code>.
	 */
	@Column(name = "formOfWork")
	@XmlElement
	private String formOfWork;

	/**
	 * Normally the year Not <code>null</code>.
	 */
	@Transient
	private List<TimeStampedDescription> dateOfWork;

	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	@XmlElementWrapper(name = "characteristics")
	@XmlElement(name = "characteristic")
	private List<String> otherDistinguishingCharacteristic;

	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "intendedTermination")
	@XmlElement
	private boolean intendedTermination;

	/**
	 * Not <code>null</code>.
	 */
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	@XmlElementWrapper(name = "audiences")
	@XmlElement(name = "adience")
	private List<String> intendedAudience;

	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "contextForTheWork")
	@XmlElement
	private String contextForTheWork;

	public Work() {

		expressions = new ArrayList<>();
		titleOfWork = new ArrayList<>();
		dateOfWork = new ArrayList<>();
		intendedAudience = new ArrayList<>();
		otherDistinguishingCharacteristic = new ArrayList<>();
		formOfWork = "";
		contextForTheWork = "";

	}

	public Work(int idWork, List<String> titleOfWork, String formOfWork) {
		this.idWork = Objects.requireNonNull(idWork);
		this.titleOfWork = Objects.requireNonNull(titleOfWork);
		this.formOfWork = Objects.requireNonNull(formOfWork);

	}

	/**
	 * @return not <code>null</code>.
	 */
	public Work getWork() {
		return Objects.requireNonNull(this);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public int getIdWork() {
		return idWork;
	}

	/**
	 * @param idWork not <code>null</code>.
	 */
	public void setIdWork(int idWork) {
		this.idWork = idWork;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<Expression> getExpressions() {
		return expressions;
	}

	/**
	 * @param expressions not <code>null</code>.
	 */
	public void setExpressions(List<Expression> expressions) {
		this.expressions = Objects.requireNonNull(expressions);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<String> getTitleOfWork() {
		return titleOfWork;
	}

	/**
	 * @param titleOfWork not <code>null</code>.
	 */
	public void setTitleOfWork(List<String> titleOfWork) {
		this.titleOfWork = Objects.requireNonNull(titleOfWork);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getFormOfWork() {
		return formOfWork;
	}

	/**
	 * @param contextForTheWork if <code>null</code>, will be converted to an empty
	 *                          string.
	 */
	public void setFormOfWork(String formOfWork) {
		this.formOfWork = Strings.nullToEmpty(formOfWork);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<TimeStampedDescription> getDateOfWork() {
		return dateOfWork;
	}

	/**
	 * @param dateOfWork not <code>null</code>.
	 */
	public void setDateOfWork(List<TimeStampedDescription> dateOfWork) {
		this.dateOfWork = Objects.requireNonNull(dateOfWork);
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

	public boolean isIntendedTermination() {
		return intendedTermination;
	}

	public void setIntendedTermination(boolean intendedTermination) {
		this.intendedTermination = intendedTermination;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public List<String> getIntendedAudience() {
		return intendedAudience;
	}

	/**
	 * @param intendedAudience not <code>null</code>.
	 */
	public void setIntendedAudience(List<String> intendedAudience) {
		this.intendedAudience = Objects.requireNonNull(intendedAudience);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getContextForTheWork() {
		return contextForTheWork;
	}

	/**
	 * @param contextForTheWork if <code>null</code>, will be converted to an empty
	 *                          string.
	 */
	public void setContextForTheWork(String contextForTheWork) {
		this.contextForTheWork = Strings.nullToEmpty(contextForTheWork);
	}

}