package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

public class ItemTest {
	@Test
	void createItem() {
		// Testing Item Constructor
		String itemIdentifier = "A12S3";
		String fingerprint = "";
		String provenanceOfTheItem = "";

		Item item = new Item();
		item.setIdItem(412);
		item.setIdManifestation(15);
		item.setItemIdentifier(itemIdentifier);
		item.setFingerprint(fingerprint);
		item.setProvenanceOfTheItem(provenanceOfTheItem);
		assertEquals(item.getIdItem(), 412);
		assertEquals(item.getIdManifestation(), 15);
		assertEquals(item.getItemIdentifier(), itemIdentifier);
		assertEquals(item.getFingerprint(), fingerprint);
		assertEquals(item.getProvenanceOfTheItem(), provenanceOfTheItem);
	}

}
