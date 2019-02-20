package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.*;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.ResponsibleEntity;

import static org.hamcrest.MatcherAssert.assertThat;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class ManifestationTest {
	@Test
	void createManifestation() {
		// Testing Manifestation Constructor

		// Create items' ids list
		Collection<Integer> idItems = new ArrayList<>();
		idItems.add(34);
		idItems.add(77);

		// Create manifestation title
		Collection<String> titleOfTheManifestation = new ArrayList<>();
		titleOfTheManifestation.add("Hamlet");

		// Create Person william

		TimeStampedDescription dateStructureBirth = new TimeStampedDescription("BirthDate", Instant.now());

		Person william = new Person("Shakespeare, William, 1564-1616", "William", "Shakespeare", dateStructureBirth);

		Collection<ResponsibleEntity> statementOfResponsibility = new ArrayList<>();
		statementOfResponsibility.add(new ResponsibleEntity(william));

		// Create manifestation edition
		String editionDesignation = "Forth edition";

		// Create publication place
		Collection<Integer> placeOfPublicationDistribution = new ArrayList<>();
		placeOfPublicationDistribution.add(3);

		// Create publisher
		Collection<ResponsibleEntity> publisherDistributer = new ArrayList<>();
		statementOfResponsibility.add(new ResponsibleEntity(william));

		// Create publication date
		Collection<TimeStampedDescription> dateOfPublicationDistribution = new ArrayList<>();
		TimeStampedDescription dateStructurePublish = new TimeStampedDescription("Publication Date", Instant.now());
		dateOfPublicationDistribution.add(dateStructurePublish);

		// Create manifestation Identifier
		String manifestationIdentifier = "A23B42";

		// Create manifestation
		Manifestation manifestation = new Manifestation(512, idItems, titleOfTheManifestation,
				statementOfResponsibility, editionDesignation, placeOfPublicationDistribution, publisherDistributer,
				dateOfPublicationDistribution, manifestationIdentifier);

		assertEquals(manifestation.getIdManifestation(), 512);
		assertThat(manifestation.getIdItems(), contains(34, 77));
		assertThat(manifestation.getTitleOfTheManifestation(), contains("Hamlet"));

	}

	@Test
	void testThrowsNullPointeurManifestationConstructor() {

		assertThrows(NullPointerException.class, () -> {

			// Create manifestation
			@SuppressWarnings("unused")
			Manifestation manifestation = new Manifestation(512, null, null, null, null, null, null, null, null);
			;
		});
	}
}