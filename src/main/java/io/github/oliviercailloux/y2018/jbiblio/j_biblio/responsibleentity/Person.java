package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures.TimeStampedDescription;

/**
 * data transfer object or DTO of Person
 */

public class Person extends AbstractResponsibleEntity {

	private String firstName;
	private String middleName;
	private String lastName;
	private String personTitle;
	private TimeStampedDescription birthdate;
	private TimeStampedDescription deathdate;

	public Person(String nameAuthority, String firstName, String middleName, String lastName, String personTitle,
			TimeStampedDescription birthdate, TimeStampedDescription deathdate) {

		this.nameAuthority = nameAuthority;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.personTitle = personTitle;
		this.birthdate = birthdate;
		this.deathdate = deathdate;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonTitle() {
		return personTitle;
	}

	public void setPersonTitle(String personTitle) {
		this.personTitle = personTitle;
	}

	public TimeStampedDescription getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(TimeStampedDescription birthdate) {
		this.birthdate = birthdate;
	}

	public TimeStampedDescription getDeathdate() {
		return deathdate;
	}

	public void setDeathdate(TimeStampedDescription deathdate) {
		this.deathdate = deathdate;
	}

}
