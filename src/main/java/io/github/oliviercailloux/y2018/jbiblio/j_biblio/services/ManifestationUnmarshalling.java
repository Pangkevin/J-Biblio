package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.File;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.ModsCollectionDefinition;

/**
 * Functionality to parse MODS to JAVA object
 *
 */
public class ManifestationUnmarshalling {

	

	public Object unmarshal(String xml) {
		
        String xsdFile = "mods-3-4.xsd";
        
	
	 JAXBContext jaxbContext;
     
     try
     {
         //Get JAXBContext
         jaxbContext = JAXBContext.newInstance(ModsCollectionDefinition.class);
          
         //Create Unmarshaller
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
          
         //Setup schema validator
         SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
         Schema employeeSchema = sf.newSchema(new File(xsdFile));
         jaxbUnmarshaller.setSchema(employeeSchema);
          
         //Unmarshal xml file
         Object manifestation = jaxbUnmarshaller.unmarshal(new StringReader(xml));
          
         System.out.println(manifestation);

     	return manifestation;
     }
     catch (JAXBException | SAXException e)
     {
         e.printStackTrace();
     }
	return null;
 }
 
}
	
	
	/*public Manifestation unmarshal(String xml) {

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
	}*/

