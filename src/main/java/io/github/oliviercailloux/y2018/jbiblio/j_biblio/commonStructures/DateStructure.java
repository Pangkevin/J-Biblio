package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures;

import java.util.Date;

public class DateStructure {

	private String description;
	private Date date;

	public DateStructure(String description, Date date) {
		super();
		this.description = description;
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
