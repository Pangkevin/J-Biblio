package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.Strings;

@XmlRootElement(name = "place")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Place {

	/**
	 * Not <code>null</code>, may be empty.
	 */
	private String label;

	public Place() {
		this.label = "";
	}

	public Place(String label) {
		this.label = Strings.nullToEmpty(label);
	}

	/**
	 * @return not <code>null</code>.
	 */
	@XmlElement(name = "placeTerm")
	public String getLabel() {
		return label;
	}

	/**
	 * 
	 * @param label if <code>null</code>, will be converted to an empty string.
	 */
	public void setLabel(String label) {
		this.label = Strings.nullToEmpty(label);
	}

	public boolean equals(Place b) {
		if (b.getLabel().equals(this.getLabel()))
			return true;

		return false;

	}
}
