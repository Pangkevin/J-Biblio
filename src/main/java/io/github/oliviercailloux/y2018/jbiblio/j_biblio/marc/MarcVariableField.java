package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import org.marc4j.marc.VariableField;

/**
 * Represents a variable field in a MARC record.
 */
public class MarcVariableField implements VariableField {
	/**
	 * A <code>serialVersionUID</code> for the class.
	 */
	private static final long serialVersionUID = -8396090810780390995L;

	private String myTag;

	private Long myID;

	/**
	 * Sets this field's tag.
	 * 
	 * @param aTag This field's tag
	 */
	@Override
	public void setTag(final String aTag) {
		if (aTag == null) {
			final String className = getClass().getSimpleName();
			throw new NullPointerException(className + "'s tag can't be null");
		}

		myTag = aTag;
	}

	/**
	 * Returns this field's tag.
	 * 
	 * @return This field's tag
	 */
	@Override
	public String getTag() {
		return myTag;
	}

	/**
	 * Compare's this {@link VariableField} to the supplied one.
	 * 
	 * @param aObject A {@link VariableField} to compare to this one
	 * @return 0 for a match, -1 if this one sorts first, or 1 if it sorts last
	 */
	@Override
	public int compareTo(final VariableField aObject) {
		if (!(aObject instanceof MarcVariableField)) {
			throw new ClassCastException("A VariableField object expected");
		}

		return myTag.compareTo(aObject.getTag());
	}

	/**
	 * Sets an ID.
	 * 
	 * @param aID A unique ID for this field
	 */
	@Override
	public void setId(final Long aID) {
		// TODO: understand the point of this ID
		myID = aID;
	}

	/**
	 * Return the field's ID.
	 * 
	 * @return The field's unique ID
	 */
	@Override
	public Long getId() {
		return myID;
	}

	/**
	 * Returns a string representation of this variable field.
	 * 
	 * @return A string representation of this variable field
	 */
	@Override
	public String toString() {
		return myTag;
	}

	@Override
	public boolean find(String pattern) {
		// TODO Auto-generated method stub
		return false;
	}

}
