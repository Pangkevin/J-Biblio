package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentitiestest;

import java.io.StringWriter;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;

class WorkJsonTest {

	@Test
	void test() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Work.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		Work work = new Work();
		work.setContextForTheWork("toto");
		
		// Print JSON String to Console
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(work, sw);
		System.out.println(sw.toString());
		Work catalog = JAXB.unmarshal(sw.toString(), Work.class);
		
		
		System.out.println(catalog.toString());
		
	}

}
