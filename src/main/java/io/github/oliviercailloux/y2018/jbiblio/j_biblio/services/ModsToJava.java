package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.OriginInfo;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.ModsCollectionDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.ModsDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.NameBaseDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.NameDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.TitleInfoBaseDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.TitleInfoTypeAttributeDefinition;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods.XsString;

/**
 * Functionality to parse MODS to JAVA object
 *
 */
public class ModsToJava {


	public  List<Manifestation> unmarshal(String xml) {
		
        String xsdFile = "mods-3-4.xsd";
        
	
	 JAXBContext jaxbContext;
	 
     
     try
     {
    	 List<Manifestation> manifestations = new ArrayList<Manifestation>();
         //Get JAXBContext
         jaxbContext = JAXBContext.newInstance(ModsCollectionDefinition.class);
          
         //Create Unmarshaller
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
          
         //Setup schema validator
         SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
         Schema employeeSchema = sf.newSchema(new File(xsdFile));
         jaxbUnmarshaller.setSchema(employeeSchema);
          
         //Unmarshal xml file
         @SuppressWarnings("unchecked")
		JAXBElement<ModsCollectionDefinition> jaxbElement =  (JAXBElement<ModsCollectionDefinition>) jaxbUnmarshaller.unmarshal(new StringReader(xml));
         ModsCollectionDefinition modsCollection = (ModsCollectionDefinition) jaxbElement.getValue();
         ArrayList<Object> modsDefinitions = (ArrayList<Object>) modsCollection.getMods().get(0).getModsGroup();
         
         Iterator<Object> it = modsDefinitions.iterator();

		List<String> names = new ArrayList<String>();
         
         while(it.hasNext()) {
 		    Object obj = (Object)it.next();

 		 	 if(obj instanceof TitleInfoBaseDefinition ) {
 		 	
 		 		String type = ((TitleInfoBaseDefinition) obj).getType();
 		 		if(type == "simple") {
 		 		 
 		 		 List<JAXBElement<XsString>> name =  ((TitleInfoBaseDefinition) obj).getTitleOrSubTitleOrPartNumber();
         		if(!name.isEmpty()) {
         		
         			XsString displayName = name.get(0).getValue();
         			names.add(displayName.getValue());
             	
         		}
         	 
         	 }
 		 	 }
 			
 		    }
      	//We create the object with the informations we retrieve
			Manifestation m = new Manifestation(names);
			//We add the object to the list
			manifestations.add(m);
         
        	 return manifestations;

     }
     catch (JAXBException | SAXException e)
     {
         e.printStackTrace();
     }
	return null;

 
}
	
}

