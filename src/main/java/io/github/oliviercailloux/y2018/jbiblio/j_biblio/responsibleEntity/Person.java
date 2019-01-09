package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleEntity;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures.DateStructure;

/**
 * data transfer object or DTO of Person
 */

public class Person extends AbstractResponsibleEntity {

	private String firstName;
	private String middleName;
	private String lastName;
	private String personTitle;
	private DateStructure birthdate;
	private DateStructure deathdate;

	public Person(String nameAuthority, String firstName, String middleName, String lastName, String personTitle,
			DateStructure birthdate, DateStructure deathdate) {

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

	public DateStructure getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(DateStructure birthdate) {
		this.birthdate = birthdate;
	}

	public DateStructure getDeathdate() {
		return deathdate;
	}

	public void setDeathdate(DateStructure deathdate) {
		this.deathdate = deathdate;
	}

}
