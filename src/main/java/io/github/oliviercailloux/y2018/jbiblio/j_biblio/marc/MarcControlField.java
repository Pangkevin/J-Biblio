package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.marc4j.Constants;
import org.marc4j.marc.ControlField;
import org.marc4j.marc.InvalidMARCException;
import org.marc4j.marc.VariableField;

@SuppressWarnings("serial")
public class MarcControlField extends MarcVariableField implements ControlField {

	private String myData;

	/**
	 * Creates a new <code>ControlField</code>.
	 */
	MarcControlField() {
	}

	/**
	 * Creates a new <code>ControlField</code> and sets the tag name.
	 * 
	 * @param aTag The field tag for the <code>ControlField</code>
	 */
	MarcControlField(final String aTag) {
		setTag(aTag);
	}

	/**
	 * Creates a new <code>ControlField</code> and sets the tag name and the data
	 * element.
	 * 
	 * @param aTag  The tag for the <code>ControlField</code>
	 * @param aData The data for the <code>ControlField</code>
	 */
	MarcControlField(final String aTag, final String aData) {
		setTag(aTag);
		setData(aData);
	}

	/**
	 * Sets the tag of a <code>ControlField</code>.
	 * 
	 * @param aTag The tag of a <code>ControlField</code>
	 */
	@Override
	public void setTag(final String aTag) {
		super.setTag(aTag);

		if (!Constants.CF_TAG_PATTERN.matcher(aTag).find()) {
			throw new InvalidMARCException(aTag + " is not a valid ControlField tag");
		}
	}

	/**
	 * Sets the {@link ControlField} data.
	 * 
	 * @param aData The data for the <code>ControlField</code>
	 */
	@Override
	public void setData(final String aData) {
		myData = aData;
	}

	/**
	 * Gets the {@link ControlField} data.
	 * 
	 * @return The <code>ControlField</code>'s data
	 */
	@Override
	public String getData() {
		return myData;
	}

	/**
	 * Returns a string representation of this control field.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 *     001 12883376
	 * </pre>
	 * </p>
	 * 
	 * @return A string representation of this control field
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getData();
	}

	/**
	 * Finds a match to a regular expression pattern in the {@link ControlField} 's
	 * data.
	 * 
	 * @param aPattern The regular expression pattern to compare against the
	 *                 <code>ControlField</code>'s data
	 */
	@Override
	public boolean find(final String aPattern) {
		final Pattern pattern = Pattern.compile(aPattern);
		final Matcher matcher = pattern.matcher(getData());

		return matcher.find();
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(VariableField o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
