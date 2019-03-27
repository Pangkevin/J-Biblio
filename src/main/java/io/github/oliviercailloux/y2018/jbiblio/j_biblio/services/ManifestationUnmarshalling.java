package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;

/**
 * Functionnality to parse MODS to JAVA object
 *
 */
public class ManifestationUnmarshalling {

	public Manifestation unmarshal(String xml) {

		Manifestation stock = null;

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Manifestation.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Manifestation retr = (Manifestation) jaxbUnmarshaller.unmarshal(new StringReader(xml));
			stock = retr;

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return stock;
	}
}
