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

	public Person(String nameAuthority, String firstName, String lastName, TimeStampedDescription birthdate) {

		this.nameAuthority = Objects.requireNonNull(nameAuthority);
		this.firstName = Objects.requireNonNull(firstName);
		this.middleName = "";
		this.lastName = Objects.requireNonNull(lastName);
		this.personTitle = "";
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
	public TimeStampedDescription getBirthdate() {
		return birthdate;
	}

	/**
	 * 
	 * @param birthdate not <code>null</code>.
	 */
	public void setBirthdate(TimeStampedDescription birthdate) {
		this.birthdate = Objects.requireNonNull(birthdate);
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
	public void setDeathdate(TimeStampedDescription deathdate) {
		this.deathdate = Optional.ofNullable(deathdate);
	}

}
