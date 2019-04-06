package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
/* 
 * Parse MARC 21 to java object
 */
public class ImportObjectMarcFormat {

	public static List<Manifestation> read(String fileName) throws Exception {
		InputStream in = new FileInputStream(fileName);
		MarcReader reader = new MarcStreamReader(in);

		List<Manifestation> manifList = new ArrayList<>();
		while (reader.hasNext()) {
			Manifestation marc4jmanif = (Manifestation) reader.next();
			manifList.add(marc4jmanif);
		}
		return manifList;
	}
}
