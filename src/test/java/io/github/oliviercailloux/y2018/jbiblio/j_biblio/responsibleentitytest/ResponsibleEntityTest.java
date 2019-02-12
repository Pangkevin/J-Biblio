package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentitytest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.CorporateBody;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.ResponsibleEntity;

class ResponsibleEntityTest {
	/**
	 * tests throws IllegalStateException
	 */
	@Test
	void addPersonResponsibleEntityTest() {
		/**
		 * Init date
		 */

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String birthdate = "1565-04-26";

		try {
			// Init Instant Date
			Instant dateBirth = formatter.parse(birthdate).toInstant();
			// Init DateStructure
			TimeStampedDescription dateStructureBirth = new TimeStampedDescription("BirthDate", dateBirth);
			Person person = new Person("Shakespeare, William, 1564-1616", "William", null, "Shakespeare", null,
					dateStructureBirth);

			ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

			responsibleEntity.asCorporateBody();

		} catch (IllegalStateException | ParseException e) {

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
		/**
		 * Init date
		 */

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String birthdate = "1565-04-26";

		try {
			// Init Instant Date
			Instant dateBirth = formatter.parse(birthdate).toInstant();
			// Init DateStructure
			TimeStampedDescription dateStructureBirth = new TimeStampedDescription("BirthDate", dateBirth);
			Person person = new Person("Shakespeare, William, 1564-1616", "William", null, "Shakespeare", null,
					dateStructureBirth);
			ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

			assertEquals(responsibleEntity.asPerson().getNameAuthority(), "Shakespeare, William, 1564-1616");
			assertEquals(responsibleEntity.asPerson().getFirstName(), "William");
			assertEquals(responsibleEntity.asPerson().getLastName(), "Shakespeare");
			assertEquals(responsibleEntity.asPerson().getPersonTitle(), "");

		} catch (IllegalStateException | ParseException e) {

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
