package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;

public class WorkTest {

	@Test
	void testThrowsNullPointeurWorkConstructor() {
		Collection<String> titleOfWork = new ArrayList<>();
		titleOfWork.add("game");
		String formOfWork = null;

		assertThrows(NullPointerException.class, () -> {

			// Create manifestation
			new Work(123, titleOfWork, formOfWork);

		});
	}
}
