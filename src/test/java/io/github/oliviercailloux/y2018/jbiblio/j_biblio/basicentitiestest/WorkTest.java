package basicEntitiesTest;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.Work;

public class WorkTest {

	
	@Test
	public void createWork() {

		Collection<String> titleOfWork = new ArrayList<String>();
		titleOfWork.add("Romeo and Juliet");
		String formOfWork = "play";
		Work work = new Work(123,titleOfWork, formOfWork);
		
		assertEquals(work.getIdWork(), 123);
		assertTrue(work.getTitleOfWork().contains("Romeo and Juliet"));

	}

}
