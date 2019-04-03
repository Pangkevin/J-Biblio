package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publisher")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ResponsibleEntity {

	private Person person;
	private CorporateBody corporateBody;
	
	public ResponsibleEntity(){
		
	}

	public ResponsibleEntity(Person person) throws NullPointerException {
		this.person = Objects.requireNonNull(person);
	}

	public ResponsibleEntity(CorporateBody corporateBody) throws NullPointerException {
		this.corporateBody = Objects.requireNonNull(corporateBody);
	}

	/**
	 * asPerson throw a IllegalStateException if corporatbody is different of null
	 */
	public Person asPerson() throws IllegalStateException {

		if (corporateBody != null) {

			throw new IllegalStateException();
		}

		return this.person;

	}

	public CorporateBody asCorporateBody() throws IllegalStateException {

		if (person != null) {

			throw new IllegalStateException();
		}

		return this.corporateBody;

	}
	@XmlElement(name="publisher", type= Person.class)
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public CorporateBody getCorporateBody() {
		return corporateBody;
	}

	public void setCorporateBody(CorporateBody corporateBody) {
		this.corporateBody = corporateBody;
	}

}
