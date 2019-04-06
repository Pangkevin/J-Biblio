package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;

/* 
 * Parse MARC 21(cataloging manifestation then item) to java object
 */
public class MarcFileReader {

	public static List<Manifestation> read(String fileName) throws Exception {
		InputStream in = new FileInputStream(fileName);
		MarcReader reader = new MarcStreamReader(in);

		List<Manifestation> manifList = new ArrayList<>();
		while (reader.hasNext()) {
			Manifestation marc4jmanif = (Manifestation) reader.next();
			manifList.add(marc4jmanif);
			System.out.println(marc4jmanif.toString());
		}
		return manifList;
	}
//	public static MarcReader getStreamReader(String fileName) throws Exception {
//		InputStream in = new FileInputStream(fileName);
//		MarcReader reader = new MarcStreamReader(in);
//		return reader;
//	}
//
//	public static MarcReader getXmlReader(String fileName) throws Exception {
//		InputStream in = new FileInputStream(fileName);
//		MarcReader reader = new MarcXmlReader(in);
//		return reader;
//	}
//
//	public static MarcReader getLineSeparatedMarcReader(String fileName) throws Exception {
//		MarcReader reader = new LineSeparatedMarcReader(fileName);
//		return reader;
//	}
//
//	public static MarcReader getMarcStringReader(String content) throws Exception {
//		InputStream is = new ByteArrayInputStream(content.getBytes());
//		MarcReader reader = new MarcStreamReader(is);
//		return reader;
//	}
//
//	public static MarcReader getReader(String fileName, boolean isMarcxml) throws Exception {
//		return getReader(fileName, isMarcxml, false);
//	}
//
//	public static MarcReader getReader(String fileName, boolean isMarcxml, boolean isLineSeaparated) throws Exception {
//		MarcReader reader = null;
//		if (isLineSeaparated)
//			reader = MarcFileReader.getLineSeparatedMarcReader(fileName);
//		else
//			reader = (isMarcxml) ? MarcFileReader.getXmlReader(fileName) : MarcFileReader.getStreamReader(fileName);
//
//		return reader;
//	}
}
