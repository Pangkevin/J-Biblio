package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.marc4j.Constants;
import org.marc4j.marc.ControlField;
import org.marc4j.marc.InvalidMARCException;


@SuppressWarnings("serial")
public class MarcControlField extends MarcVariableField implements ControlField{

	private String myCFData;

	/**
	 * Creates a new <code>ControlField</code>.
	 */
	MarcControlField() {
	}

	/**
	 * Creates a new <code>ControlField</code> and sets the tag name.
	 * 
	 * @param tagCF The field tag for the <code>ControlField</code>
	 */
	MarcControlField(final String tagCF) {
		setTag(tagCF);
	}

	/**
	 * Creates a new <code>ControlField</code> and sets the tag name and the data
	 * element.
	 * 
	 * @param tagCF  The tag for the <code>ControlField</code>
	 * @param dataCF The data for the <code>ControlField</code>
	 */
	MarcControlField(final String tagCF, final String dataCF) {
		setTag(tagCF);
		setData(dataCF);
	}

	/**
	 * Sets the tag of a <code>ControlField</code>.
	 * 
	 * @param tagCF The tag of a <code>ControlField</code>
	 */
	@Override
	public void setTag(final String tagCF) {
		super.setTag(tagCF);

		if (!Constants.CF_TAG_PATTERN.matcher(tagCF).find()) {
			throw new InvalidMARCException(tagCF + " is not a valid ControlField tag");
		}
	}

	/**
	 * Sets the {@link ControlField} data.
	 * 
	 * @param dataCF The data for the <code>ControlField</code>
	 */
	@Override
	public void setData(final String dataCF) {
		myCFData = dataCF;
	}

	/**
	 * Gets the {@link ControlField} data.
	 * 
	 * @return The <code>ControlField</code>'s data
	 */
	@Override
	public String getData() {
		return myCFData;
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
	 * @param patternCF The regular expression pattern to compare against the
	 *                 <code>ControlField</code>'s data
	 */
	@Override
	public boolean find(final String patternCF) {
		final Pattern pattern = Pattern.compile(patternCF);
		final Matcher matcher = pattern.matcher(getData());

		return matcher.find();
	}


}
