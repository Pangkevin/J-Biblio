package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.Place;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 * data transfer object or DTO of Person
 */

@XmlRootElement(name = "publisher")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@Entity
@Table(name = "Person")
@JsonbPropertyOrder({ "nameAuthority", "idPerson", "firstName", "middleName", "lastName", "personTitle", "birthDate",
		"birthDate" })
public class Person {

	/**
	 * nameAuthory It should not be allowed to be unknown. This is an essential
	 * information. Not <code>null</code>, empty if unknown.
	 */
	@Column(name = "nameAuthority")
	private String nameAuthority;

	@Id
	@Column(name = "idPerson")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idPerson;
	/**
	 * Not <code>null</code>, may be empty.
	 */
	@Column(name = "firstName")
	private String firstName;

	/**
	 * Not <code>null</code>, may be empty.
	 */
	@Column(name = "middleName")
	private String middleName;

	/**
	 * Not <code>null</code>, may be empty.
	 */
	@Column(name = "lastName")
	private String lastName;

	/**
	 * Not <code>null</code>, may be empty.
	 */
	@Column(name = "personTitle")
	private String personTitle;

	/**
	 * Not <code>null</code>.
	 */
	@OneToOne(cascade = { CascadeType.ALL })
	private TimeStampedDescription birthDate;

	/**
	 * Not <code>null</code>.
	 */

	@OneToOne
	private TimeStampedDescription deathDate;

	public Person() {

		this.nameAuthority = "";
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.personTitle = "";
		birthDate = new TimeStampedDescription();

	}

	/**
	 * Return name authority of the Responsible entitie
	 * 
	 * @return not <code>null</code>.
	 */
	public String getNameAuthority() {
		return nameAuthority;
	}

	/**
	 * 
	 * @param nameAuthority
	 */
	public void setNameAuthority(String nameAuthority) {
		this.nameAuthority = Objects.requireNonNull(nameAuthority);
	}

	public Person(String title) {
		this.setPersonTitle(title);
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
	@XmlElement(name = "artname")
	public String getPersonTitle() {
		return this.personTitle;
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
		return Optional.ofNullable(this.deathDate);
	}

	/**
	 * 
	 * @param deathdate may be <code>null</code>.
	 */
	public void setDeathDate(TimeStampedDescription deathdate) {
		this.deathDate = deathdate;
	}

	public boolean equals(Person b) {
		if (b.getPersonTitle().equals(this.getPersonTitle()))
			return true;

		return false;
	}
}
