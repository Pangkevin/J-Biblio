package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentitytest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.time.Instant;
import java.time.format.DateTimeParseException;

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

			new Person().setBirthDate(null);
		});
	}

	/**
	 * Test Optional attribut deathDate
	 * 
	 * @throws ParseException
	 */
	@Test
	void testOptionalAttribut() throws DateTimeParseException {

		// Init DateStructure

		TimeStampedDescription dateStructureDeath = new TimeStampedDescription("DeathDate",
				Instant.parse("1616-04-22T23:00:00Z"));

		Person person = new Person();

		assertFalse(person.getDeathDate().isPresent());

		// add deathdate
		person.setDeathDate(dateStructureDeath);
		// IsPresent
		assertTrue(person.getDeathDate().isPresent());

	}

}
