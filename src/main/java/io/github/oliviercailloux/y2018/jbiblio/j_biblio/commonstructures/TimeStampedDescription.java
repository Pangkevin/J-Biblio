package io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TimeStampedDescription")
@Embeddable
public class TimeStampedDescription {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	/**
	 * Not <code>null</code>, empty if unknown.
	 */
	@Column(name = "description")
	private String description;

	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "date")
	private Instant date;

	public TimeStampedDescription(String description, Instant date) {

		this.description = Objects.requireNonNull(description);

		this.date = Objects.requireNonNull(date);

	}

	public TimeStampedDescription() {

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
	 * @param description not <code>null</code>
	 */
	public void setDescription(String description) {
		this.description = Objects.requireNonNull(description);
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
		this.date = Objects.requireNonNull(date);
	}

}
