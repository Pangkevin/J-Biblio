package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;

@XmlRootElement(name = "originInfo")
public class OriginInfo {

	private Collection<Person> publisher;
	private Collection<Place> place;

	public OriginInfo() {

	}

	@XmlElement(name = "publisher", type = Person.class)
	public Collection<Person> getPublisher() {
		return publisher;
	}

	public void setPublisher(Collection<Person> publisher) {
		this.publisher = publisher;
	}

	@XmlElement(name = "place", type = Place.class)
	public Collection<Place> getPlace() {
		return place;
	}

	public void setPlace(Collection<Place> place) {
		this.place = place;
	}

}
