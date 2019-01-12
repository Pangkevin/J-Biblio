package responsibleEntityTest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures.DateStructure;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleEntity.Person;

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

			Date dateBirth = formatter.parse(birthdate);
			Date dateDeath = formatter.parse(deathdate);

			/**
			 * Init DateStructure
			 */
			DateStructure dateStructureBirth = new DateStructure("BirthDate", dateBirth);
			DateStructure dateStructureDeath = new DateStructure("DeathDate", dateDeath);

			Person person = new Person("Shakespeare, William, 1564-1616", "William", null, "Shakespeare", null,
					dateStructureBirth, dateStructureDeath);

			assertEquals(person.getNameAuthority(), "Shakespeare, William, 1564-1616");
			assertEquals(person.getFirstName(), "William");
			assertEquals(person.getLastName(), "Shakespeare");

			/**
			 * Convert date to String
			 */
			DateFormat dateFormat = formatter;

			assertEquals(dateFormat.format(person.getBirthdate().getDate()), "1565-04-26");
			assertEquals(dateFormat.format(person.getDeathdate().getDate()), "1616-04-23");
		} catch (ParseException e) {

			assertFalse(true);
		}

	}

}
