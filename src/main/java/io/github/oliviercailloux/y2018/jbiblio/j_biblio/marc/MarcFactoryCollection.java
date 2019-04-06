package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.util.ArrayList;
import java.util.List;

public class MarcFactoryCollection {
	protected List<MarcObjectFactory> marcFactList;

	/**
	 * Gets the value of the marcsFactoryList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the marcFactoryList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMarc().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MarcObjectFactory }
	 * 
	 * 
	 */

	public List<MarcObjectFactory> getMarc() {
		if (marcFactList == null) {
			marcFactList = new ArrayList<MarcObjectFactory>();
		}
		return marcFactList;
	}

}
