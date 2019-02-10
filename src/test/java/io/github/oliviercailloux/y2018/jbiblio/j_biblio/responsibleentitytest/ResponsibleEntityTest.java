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

		Person person = new Person("Shakespeare, William, 1564-1616", "William", null, "Shakespeare", null, null, null);

		ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

		try {
			responsibleEntity.asCorporateBody();

		} catch (IllegalStateException e) {

			e.printStackTrace();
			assertTrue(true);
		}

	}

	@Test
	void addCorporateBodyResponsibleEntityTest() {

		CorporateBody cb = new CorporateBody("BNF", null);

		ResponsibleEntity responsibleEntity = new ResponsibleEntity(cb);

		try {
			responsibleEntity.asPerson();

		} catch (IllegalStateException e) {
			e.printStackTrace();
			assertTrue(true);
		}

	}

	/**
	 * Tests if a CorporateBody and a Personn is initialize correctly and properly
	 */

	@Test
	void PersonResponsibleEntityTest() {

		Person person = new Person("Shakespeare, William, 1564-1616", "William", null, "Shakespeare", null, null, null);
		ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

		try {

			assertEquals(responsibleEntity.asPerson().getNameAuthority(), "Shakespeare, William, 1564-1616");
			assertEquals(responsibleEntity.asPerson().getFirstName(), "William");
			assertEquals(responsibleEntity.asPerson().getLastName(), "Shakespeare");

		} catch (IllegalStateException e) {

			e.printStackTrace();
			assertTrue(false);
		}

	}

	@Test
	void CorporateBodyResponsibleEntityTest() {

		CorporateBody cb = new CorporateBody("BNF", "bnf");

		ResponsibleEntity responsibleEntity = new ResponsibleEntity(cb);

		try {

			assertEquals(responsibleEntity.asCorporateBody().getNameAuthority(), "BNF");
			assertEquals(responsibleEntity.asCorporateBody().getNameCorporateBody(), "bnf");

		} catch (IllegalStateException e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}

	/**
	 * Test throws NullPointerException
	 */
	@Test
	void addPersonResponsibleEntityNullTest() {

		try {

			Person person = null;

			@SuppressWarnings("unused")
			ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

		} catch (NullPointerException e) {

			e.printStackTrace();
			assertTrue(true);
		}

	}

	@Test
	void addCorporateBodyResponsibleEntityNullTest() {
		try {
			CorporateBody cb = null;

			@SuppressWarnings("unused")
			ResponsibleEntity responsibleEntity = new ResponsibleEntity(cb);

		} catch (NullPointerException e) {
			e.printStackTrace();
			assertTrue(true);
		}

	}

}
