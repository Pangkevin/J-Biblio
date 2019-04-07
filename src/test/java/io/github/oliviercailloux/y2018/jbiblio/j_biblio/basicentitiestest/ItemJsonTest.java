package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

public class ItemJsonTest {

	@Test
	public void testConvertJsonToItemObject() throws Exception {

		try (Jsonb jsonb = JsonbBuilder.create();) {
			try (BufferedReader reader = new BufferedReader(new StringReader(
					"{\"fingerprint\":\"DS21T47DT\",\"idItem\":412,\"itemIdentifier\":\"A12S3\",\"provenanceOfTheItem\":\"RES\"}"));) {
				/**
				 * we used fromJson(BufferedReader, Class) in doPost method to convert a Json
				 * format to an Item Object
				 */
				Item item = jsonb.fromJson(reader, Item.class);
				assertEquals(item.getIdItem(), 412);
				assertEquals(item.getItemIdentifier(), "A12S3");
				assertEquals(item.getFingerprint(), "DS21T47DT");
				assertEquals(item.getProvenanceOfTheItem(), "RES");
			}
		}

	}

	@Test
	void testConvertItemToJson() throws Exception {

		List<Item> itemList = new ArrayList<>();
		String listJsonItem = "[{\"idItem\":0,\"fingerprint\":\"mozart\"},{\"idItem\":0,\"fingerprint\":\"beethoven\"}]";
		Item item = new Item();
		item.setFingerprint("mozart");
		Item item1 = new Item();
		item1.setFingerprint("beethoven");

		itemList.add(item);
		itemList.add(item1);

		try (Jsonb jsonb = JsonbBuilder.create();) {

			String jsonItem = jsonb.toJson(itemList);

			assertEquals(jsonItem, listJsonItem);
		}
	}
}
