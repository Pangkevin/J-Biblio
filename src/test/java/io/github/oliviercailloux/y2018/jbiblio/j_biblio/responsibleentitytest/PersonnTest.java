package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentitytest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;

class PersonnTest {

	@Test
	void createPersonn() {
		/**
		 * Init date
		 */

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String birthdate = "1565-04-26";
		String deathdate = "1616-04-23";

		try {

			// Init Instant Date
			Instant dateBirth = formatter.parse(birthdate).toInstant();
			Instant dateDeath = formatter.parse(deathdate).toInstant();

			// Init DateStructure
			TimeStampedDescription dateStructureBirth = new TimeStampedDescription("BirthDate", dateBirth);
			TimeStampedDescription dateStructureDeath = new TimeStampedDescription("DeathDate", dateDeath);

			Person person = new Person("Shakespeare, William, 1564-1616", "William", null, "Shakespeare", null,
					dateStructureBirth, dateStructureDeath);

			// test String attributs
			assertEquals(person.getNameAuthority(), "Shakespeare, William, 1564-1616");
			assertEquals(person.getFirstName(), "William");
			assertEquals(person.getLastName(), "Shakespeare");
			// Test instant date
			assertEquals(person.getBirthdate().getDate().toString(), "1565-05-05T23:00:00Z");
			assertEquals(person.getDeathdate().getDate().toString(), "1616-04-22T23:00:00Z");
		} catch (ParseException e) {

			e.printStackTrace();
			assertFalse(true);
		}

	}

}
