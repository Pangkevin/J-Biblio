package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentitytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.CorporateBody;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.ResponsibleEntity;

class ResponsibleEntityTest {
	/**
	 * tests throws IllegalStateException
	 */
	@Test
	void addPersonResponsibleEntityTest() {

		Person person = new Person();
		ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

		assertThrows(IllegalStateException.class, () -> {
			responsibleEntity.asCorporateBody();
		});

	}

	@Test
	void addCorporateBodyResponsibleEntityTest() {

		CorporateBody cb = new CorporateBody();

		ResponsibleEntity responsibleEntity = new ResponsibleEntity(cb);

		assertThrows(IllegalStateException.class, () -> {
			responsibleEntity.asPerson();
		});

	}

	/**
	 * Test throws NullPointerException
	 */
	@Test
	void addPersonResponsibleEntityNullTest() {

		Person person = null;

		assertThrows(NullPointerException.class, () -> {
			new ResponsibleEntity(person);
		});
	}

	/**
	 * Test throws NullPointerException
	 */
	@Test
	void addCorporateBodyResponsibleEntityNullTest() {

		CorporateBody cb = null;

		assertThrows(NullPointerException.class, () -> {

			new ResponsibleEntity(cb);
		});
	}

}
