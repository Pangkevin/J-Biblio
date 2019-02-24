package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentitytest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.time.Instant;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;

class PersonTest {

	/**
	 * Test if Constructor throws NullPointerException when birthDate param is null
	 */
	@Test
	void createPersonWithNullBirthDate() {

		assertThrows(NullPointerException.class, () -> {
			@SuppressWarnings("unused")
			Person person = new Person("Shakespeare, William, 1564-1616", "William", "Shakespeare", null);
		});
	}

	/**
	 * Test Optional attribut deathDate
	 * 
	 * @throws ParseException
	 */
	@Test
	void testOptionalAttribut() throws ParseException {

		// Init DateStructure
		TimeStampedDescription dateStructureBirth = new TimeStampedDescription("BirthDate",
				Instant.parse("1565-05-05T23:00:00Z"));
		TimeStampedDescription dateStructureDeath = new TimeStampedDescription("DeathDate",
				Instant.parse("1616-04-22T23:00:00Z"));

		Person person = new Person("Shakespeare, William, 1564-1616", "William", "Shakespeare", dateStructureBirth);

		assertFalse(person.getDeathDate().isPresent());

		// add deathdate
		person.setDeathDate(dateStructureDeath);
		// IsPresent
		assertTrue(person.getDeathDate().isPresent());

	}

}
