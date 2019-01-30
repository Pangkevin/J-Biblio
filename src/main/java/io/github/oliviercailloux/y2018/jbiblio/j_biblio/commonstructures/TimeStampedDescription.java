package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import java.time.Instant;

public class TimeStampedDescription {

	private String description;
	private Instant date;

	public TimeStampedDescription(String description, Instant date) {

		this.description = description;
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

}
