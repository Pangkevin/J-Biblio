package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;

@XmlRootElement(name = "originInfo")
public class OriginInfo {

	private List<Person> publisher;
	private List<Place> place;

	public OriginInfo() {

	}

	@XmlElement(name = "publisher", type = Person.class)
	public List<Person> getPublisher() {
		return publisher;
	}

	public void setPublisher(List<Person> publisher) {
		this.publisher = publisher;
	}

	@XmlElement(name = "place", type = Place.class)
	public List<Place> getPlace() {
		return place;
	}

	public void setPlace(List<Place> place) {
		this.place = place;
	}

}
