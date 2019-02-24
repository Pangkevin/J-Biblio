package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentitytest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.time.Instant;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.CorporateBody;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.ResponsibleEntity;

class ResponsibleEntityTest {
	/**
	 * tests throws IllegalStateException
	 * 
	 * @throws ParseException
	 */
	@Test
	void addPersonResponsibleEntityTest() throws ParseException {
		// Init DateStructure
		TimeStampedDescription dateStructureBirth = new TimeStampedDescription("BirthDate",
				Instant.parse("1565-05-05T23:00:00Z"));

		Person person = new Person("Shakespeare, William, 1564-1616", "William", "Shakespeare", dateStructureBirth);
		ResponsibleEntity responsibleEntity = new ResponsibleEntity(person);

		assertThrows(IllegalStateException.class, () -> {
			responsibleEntity.asCorporateBody();
		});

	}

	@Test
	void addCorporateBodyResponsibleEntityTest() {

		CorporateBody cb = new CorporateBody("BNF", "bnf");

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
