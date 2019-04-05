package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.common.collect.Iterables;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.ModsCollectionDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.ModsDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.OriginInfoDefinition;


class ModsToJavaTest {

	// https://www.loc.gov/standards/mods/userguide/examples.html
	// https://www.loc.gov/standards/mods/v3/mods-userguide-examples.html Archive website

	@Test
	void testModsToJava() {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"\n" + 
				"<modsCollection xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.loc.gov/mods/v3\" xsi:schemaLocation=\"http://www.loc.gov/mods/v3 http://www.loc.gov/standards/mods/v3/mods-3-4.xsd\">\n" + 
				"\n" + 
				"<mods version=\"3.4\">\n" + 
				"\n" + 
				"<titleInfo>\n" + 
				"<title>FranUlmer.com -- Home Page</title>\n" + 
				"</titleInfo>\n" + 
				"<titleInfo type=\"alternative\">\n" + 
				"<title>Fran Ulmer, Democratic candidate for Governor, Alaska, 2002</title>\n" + 
				"</titleInfo>\n" + 
				"<name type=\"personal\">\n" + 
				"<namePart>Ulmer, Fran</namePart>\n" + 
				"</name>\n" + 
				"<genre>Website</genre>\n" + 
				"<originInfo>\n" + 
				"<dateCaptured point=\"start\" encoding=\"iso8601\">20020702 </dateCaptured>\n" + 
				"<dateCaptured point=\"end\" encoding=\"iso8601\"> 20021203</dateCaptured>\n" + 
				"</originInfo>\n" + 
				"<language>\n" + 
				"<languageTerm authority=\"iso639-2b\">eng</languageTerm>\n" + 
				"</language>\n" + 
				"<physicalDescription>\n" + 
				"<internetMediaType>text/html</internetMediaType>\n" + 
				"<internetMediaType>image/jpg</internetMediaType>\n" + 
				"</physicalDescription>\n" + 
				"<abstract>Website promoting the candidacy of Fran Ulmer, Democratic candidate for Governor, Alaska, 2002. Includes candidate biography, issue position statements, campaign contact information, privacy policy and campaign news press releases. Site features enable visitors to sign up for campaign email list, volunteer, make campaign contributions and follow links to other internet locations. </abstract>\n" + 
				"<subject>\n" + 
				"<topic>Elections</topic>\n" + 
				"<geographic>Alaska</geographic>\n" + 
				"</subject>\n" + 
				"<subject>\n" + 
				"<topic>Governors</topic>\n" + 
				"<geographic>Alaska</geographic>\n" + 
				"<topic>Election</topic>\n" + 
				"</subject>\n" + 
				"<subject>\n" + 
				"<topic>Democratic Party (AK)</topic>\n" + 
				"</subject>\n" + 
				"<relatedItem type=\"host\">\n" + 
				"<titleInfo>\n" + 
				"<title>Election 2002 Web Archive</title>\n" + 
				"</titleInfo>\n" + 
				"<location>\n" + 
				"<url>http://www.loc.gov/minerva/collect/elec2002/</url>\n" + 
				"</location>\n" + 
				"</relatedItem>\n" + 
				"<location>\n" + 
				"<url displayLabel=\"Active site (if available)\">http://www.franulmer.com/</url>\n" + 
				"</location>\n" + 
				"<location>\n" + 
				"<url displayLabel=\"Archived site\">http://wayback-cgi1.alexa.com/e2002/*/http://www.franulmer.com/</url>\n" + 
				"</location>\n" + 
				"</mods>\n" + 
				"\n" + 
				"</modsCollection>";
				

		ModsToJava marsh = new ModsToJava();

		 List<Manifestation> manifestationCollection = marsh.unmarshal(xml);
		
		assertEquals(manifestationCollection.get(0).getTitleOfTheManifestation().get(0),"FranUlmer.com -- Home Page");	
		assertEquals(manifestationCollection.get(0).getTitleOfTheManifestation().get(1),"Fran Ulmer, Democratic candidate for Governor, Alaska, 2002");	

		
		}
}
