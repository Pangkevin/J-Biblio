package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.*;

public class ManifestationTest {

	@Test
	void testThrowsNullPointeurManifestationConstructor() {

		assertThrows(NullPointerException.class, () -> {

			// Create manifestation

			new Manifestation(512, null, null, null, null, null, null, null, null);

		});
	}
}