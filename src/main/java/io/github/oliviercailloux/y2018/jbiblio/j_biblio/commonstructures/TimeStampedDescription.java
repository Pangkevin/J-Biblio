package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import java.time.Instant;
import java.util.Objects;

import com.google.common.base.Strings;

public class TimeStampedDescription {

	/**
	 * Not <code>null</code>, empty if unknown.
	 */
	private String description;

	/**
	 * Not <code>null</code>.
	 */
	private Instant date;

	public TimeStampedDescription(String description, Instant date) {

		this.description = Strings.nullToEmpty(description);

		this.date = Objects.requireNonNull(date);

	}

	/**
	 * Returns this description of the date, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set this description
	 * 
	 * @param description if <code>null</code>, will be converted to an empty
	 *                    string.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Return date of the TimeStampedDescription
	 * 
	 * @return not <code>null</code>.
	 */
	public Instant getDate() {
		return date;
	}

	/**
	 * Set date of the TimeStampedDescription
	 * 
	 * @param date not <code>null</code>.
	 */
	public void setDate(Instant date) {
		this.date = date;
	}

}
