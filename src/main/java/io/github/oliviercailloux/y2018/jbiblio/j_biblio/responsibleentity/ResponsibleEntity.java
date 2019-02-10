package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;

public class ResponsibleEntity {

	private Person person;
	private CorporateBody corporateBody;

	public ResponsibleEntity(Person person)  throws NullPointerException{
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
			/**
			 * IllegalStateException is used to indicated that a method has been invoked at
			 * an illegal or inappropriate time. asPersonn must not to be use if a
			 * corporateBody is instanciated
			 */
			throw new IllegalStateException();
		}

		return this.person;

	}

	public CorporateBody asCorporateBody() throws IllegalStateException {

		if (person != null) {
			/**
			 * IllegalStateException is used to indicated that a method has been invoked at
			 * an illegal or inappropriate time. asPersonn must not to be use if a person is
			 * instanciated
			 */
			throw new IllegalStateException();
		}

		return this.corporateBody;

	}

}
