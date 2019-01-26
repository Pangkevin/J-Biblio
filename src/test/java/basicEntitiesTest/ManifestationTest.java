package basicEntitiesTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.Manifestation;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class ManifestationTest {
	@Test
	void createManifestation() {
		// Testing Manifestation Constructor
		Collection<Integer> idItems = new ArrayList<>();
		idItems.add(34);
		idItems.add(77);

		Collection<String> titleOfTheManifestation = new ArrayList<>();
		titleOfTheManifestation.add("Harry Potter");

		Manifestation manifestation = new Manifestation(512, idItems, titleOfTheManifestation);

		assertEquals(manifestation.getIdManifestation(), 512);
		assertThat(manifestation.getIdItems(), contains(34, 77));
		assertThat(manifestation.getTitleOfTheManifestation(), contains("Harry Potter"));

	}
}