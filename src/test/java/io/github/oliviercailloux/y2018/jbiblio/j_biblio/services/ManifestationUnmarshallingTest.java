package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.google.common.collect.Iterables;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.Place;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.ManifestationUnmarshalling;;

class ManifestationUnmarshallingTest {

	//https://www.loc.gov/standards/mods/userguide/examples.html
	
	@Test
	void marshalling() {
		String xml ="<Manifestation>" + 
				" 	<titleInfo>" + 
				"     <title>At Gettysburg, or, What a Girl Saw and Heard of the Battle: A True Narrative</title>" + 
				" 	</titleInfo>" + 
				" 	<name type=\"personal\">\n" + 
				" 	 	<namePart>Alleman, Tillie Pierce [1848-1914]</namePart>\n" + 
				" 	 	<role>\n" + 
				" 	 	 	<roleTerm type=\"code\" authority=\"marcrelator\">aut</roleTerm>\n" + 
				" 	 	 	<roleTerm type=\"text\" authority=\"marcrelator\">Author</roleTerm>\n" + 
				" 	 	</role>\n" + 
				" 	</name>\n" + 
				" 	<typeOfResource>text</typeOfResource>\n" + 
				" 	<originInfo>\n" + 
				" 	 	<place>\n" + 
				" 	 	 	<placeTerm type=\"text\">New York</placeTerm>\n" + 
				" 	 	</place>\n" + 
				" 	 <publisher> W. Lake Borland</publisher>\n" + 
				" 	 	<dateIssued keyDate=\"yes\" encoding=\"w3cdtf\">1889</dateIssued>\n" + 
				" 	</originInfo>\n" + 
				" 	<language>\n" + 
				" 	 	<languageTerm authority=\"iso639-2b\">eng</languageTerm>\n" + 
				" 	 	<languageTerm type=\"text\">English</languageTerm>\n" + 
				" 	</language>\n" + 
				"\n" + 
				"</Manifestation>" ;
		
		ManifestationUnmarshalling marsh = new ManifestationUnmarshalling();
		
		Manifestation manifestation = marsh.unmarshal(xml);
		
		assertTrue(manifestation.getTitleOfTheManifestation().contains("At Gettysburg, or, What a Girl Saw and Heard of the Battle: A True Narrative"));
		
		Place place = new Place("New York"); 
		
		Collection<Place> places = new ArrayList<Place>();
		places.add(place);
		
		Place placeInColl = Iterables.get(manifestation.getPlaceOfPublication(), 0);
	
		assertTrue(placeInColl.equals(place));
		assertTrue(manifestation.getTitleOfTheManifestation().contains("At Gettysburg, or, What a Girl Saw and Heard of the Battle: A True Narrative"));
		
		
		//assertTrue(manifestation.getPublisherDistributer().contains("W. Lake Borland"));
	}
}
