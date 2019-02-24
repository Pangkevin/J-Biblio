package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

public class ItemTest {

	@Test
	void testThrowsNullPointeurItemSetItemIdentifier() {
		Item item = new Item();

		assertThrows(NullPointerException.class, () -> {

			item.setItemIdentifier(null);
		});
	}

}
