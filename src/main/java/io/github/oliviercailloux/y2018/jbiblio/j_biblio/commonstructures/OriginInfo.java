package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;

@XmlRootElement(name = "originInfo")
public class OriginInfo {
	/**
	 * Not <code>null</code>, may be empty.
	 */
	private List<Person> publisher;
	/**
	 * Not <code>null</code>, may be empty.
	 */
	private List<Place> place;

	public OriginInfo() {
		publisher = new ArrayList<>();
		place = new ArrayList<>();
	}

	/**
	 * @return not <code>null</code>.
	 */
	@XmlElement(name = "publisher", type = Person.class)
	public List<Person> getPublisher() {
		return publisher;
	}

	public void setPublisher(List<Person> publisher) {
		this.publisher = Objects.requireNonNull(publisher);
	}

	/**
	 * @return not <code>null</code>.
	 */
	@XmlElement(name = "place", type = Place.class)
	public List<Place> getPlace() {
		return place;
	}

	public void setPlace(List<Place> place) {
		this.place = Objects.requireNonNull(place);
	}

}
