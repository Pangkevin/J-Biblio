package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * data transfer object or DTO of Person
 */
@XmlRootElement(name = "publisher")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person extends AbstractResponsibleEntity {

	/**
	 * Not <code>null</code>, may be empty.
	 */
	private String firstName;

	/**
	 * Not <code>null</code>, may be empty.
	 */
	private String middleName;

	/**
	 * Not <code>null</code>, may be empty.
	 */
	private String lastName;

	/**
	 * Not <code>null</code>, may be empty.
	 */
	private String personTitle;

	/**
	 * Not <code>null</code>.
	 */
	private TimeStampedDescription birthDate;

	/**
	 * Not <code>null</code>.
	 */
	private Optional<TimeStampedDescription> deathDate;
	
	public Person() {
		this.middleName="hell";
	}

	public Person(String nameAuthority, String firstName, String lastName, TimeStampedDescription birthDate) {

		this.nameAuthority = Objects.requireNonNull(nameAuthority);
		this.firstName = Objects.requireNonNull(firstName);
		this.middleName = "";
		this.lastName = Objects.requireNonNull(lastName);
		this.personTitle = "";
		this.birthDate = Objects.requireNonNull(birthDate);
		this.deathDate = Optional.empty();

	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName not <code>null</code>.
	 */
	public void setFirstName(String firstName) {
		this.firstName = Objects.requireNonNull(firstName);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * 
	 * @param middleName if <code>null</code>, will be converted to an empty string.
	 */
	public void setMiddleName(String middleName) {
		this.middleName = Strings.nullToEmpty(middleName);

	}

	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName not <code>null</code>
	 */
	public void setLastName(String lastName) {
		this.lastName = Objects.requireNonNull(lastName);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getPersonTitle() {
		return personTitle;
	}

	/**
	 * 
	 * @param personTitle if <code>null</code>, will be converted to an empty
	 *                    string.
	 */
	public void setPersonTitle(String personTitle) {
		this.personTitle = Strings.nullToEmpty(personTitle);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public TimeStampedDescription getBirthDate() {
		return birthDate;
	}

	/**
	 * 
	 * @param birthdate not <code>null</code>.
	 */
	public void setBirthDate(TimeStampedDescription birthdate) {
		this.birthDate = Objects.requireNonNull(birthdate);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Optional<TimeStampedDescription> getDeathDate() {
		return deathDate;
	}

	/**
	 * 
	 * @param deathdate may be <code>null</code>.
	 */
	public void setDeathDate(TimeStampedDescription deathdate) {
		this.deathDate = Optional.ofNullable(deathdate);
	}

}
