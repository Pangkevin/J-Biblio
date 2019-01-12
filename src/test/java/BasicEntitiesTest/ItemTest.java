package BasicEntitiesTest;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.BasicEntities.Item;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ItemTest {
	@Test
	void createItem() {
		// Testing Item Constructor
		Item item = new Item(412, "A12S3", "DS21T47DT");

		assertEquals(item.getIdItem(), 412);
		assertEquals(item.getItemIdentifier(), "A12S3");
		assertEquals(item.getFingerprint(), "DS21T47DT");
	}

}
