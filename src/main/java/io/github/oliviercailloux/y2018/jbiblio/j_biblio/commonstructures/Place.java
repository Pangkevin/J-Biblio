package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "place")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Place {

	private String label;

	public Place() {

	}

	public Place(String label) {
		this.label = label;
	}

	@XmlElement(name = "placeTerm")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean equals(Place b) {
		if (b.getLabel().equals(this.getLabel()))
			return true;

		return false;

	}
}
