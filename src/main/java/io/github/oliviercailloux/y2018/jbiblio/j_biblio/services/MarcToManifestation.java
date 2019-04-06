package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;



import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc.MarcLeaderImplementation;

public class MarcToManifestation {
	public List<Manifestation> unmarshal(String xml) {
		String mrcFile = "file.marc";
		JAXBContext jaxbContext;
		try {
			List<Manifestation> manifestationList = new ArrayList<Manifestation>();
			// Get JAXBContext
			jaxbContext = JAXBContext.newInstance(MarcLeaderImplementation.class);
		}catch (JAXBException e) {
			e.printStackTrace();
		}
			return null;
		}
}
