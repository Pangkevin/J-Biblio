package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;
import java.util.Optional;
import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * data transfer object or DTO of Person
 */

public class Person extends AbstractResponsibleEntity {

	/**
	 * Not <code>null</code>.
	 */
	private String firstName;

	/**
	 * Not <code>null</code>.
	 */
	private String middleName;

	/**
	 * Not <code>null</code>.
	 */
	private String lastName;

	/**
	 * Not <code>null</code>.
	 */
	private String personTitle;

	/**
	 * Not <code>null</code>.
	 */
	private TimeStampedDescription birthdate;

	/**
	 * Not <code>null</code>.
	 */
	private Optional<TimeStampedDescription> deathdate;

	public Person(String nameAuthority, String firstName, String middleName, String lastName, String personTitle,
			TimeStampedDescription birthdate) {

		this.nameAuthority = Strings.nullToEmpty(nameAuthority);
		this.firstName = Strings.nullToEmpty(firstName);
		this.middleName = Strings.nullToEmpty(middleName);
		this.lastName = Strings.nullToEmpty(lastName);
		this.personTitle = Strings.nullToEmpty(personTitle);
		this.birthdate = Objects.requireNonNull(birthdate);
		this.deathdate = Optional.empty();

	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName if <code>null</code>, will be converted to an empty string.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName if <code>null</code>, will be converted to an empty string.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		this.personTitle = personTitle;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public TimeStampedDescription getBirthdate() {
		return birthdate;
	}

	/**
	 * 
	 * @param birthdate not <code>null</code>.
	 */
	public void setBirthdate(TimeStampedDescription birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Optional<TimeStampedDescription> getDeathdate() {
		return deathdate;
	}

	/**
	 * 
	 * @param deathdate may be <code>null</code>.
	 */
	public void setDeathdate(Optional<TimeStampedDescription> deathdate) {
		this.deathdate = Objects.requireNonNull(deathdate);
	}

}
