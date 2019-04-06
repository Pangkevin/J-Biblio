package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.marc4j.marc.DataField;
import org.marc4j.marc.IllegalAddException;
import org.marc4j.marc.InvalidMARCException;
import org.marc4j.marc.Subfield;

public class MarcDataField extends MarcVariableField implements DataField {
	private static final long serialVersionUID = -1804044736102463060L;

	private char myFirstInd;

	private char mySecondInd;

	private final List<Subfield> mySFList = new ArrayList<Subfield>();

	/**
	 * Creates a new <code>DataField</code>.
	 */
	MarcDataField() {
	}

	/**
	 * Creates a new <code>DataField</code> and sets the tag name and the first and
	 * second indicator.
	 *
	 * @param tagDF       The tag name
	 * @param aFirstInd  The first indicator
	 * @param aSecondInd The second indicator
	 */
	MarcDataField(final String tagDF, final char aFirstInd, final char aSecondInd) {
		setTag(tagDF);
		setIndicator1(aFirstInd);
		setIndicator2(aSecondInd);
	}

	/**
	 * Sets the tag of a <code>DataField</code>.
	 *
	 * @param tagDF The tag of a <code>DataField</code>
	 */
	@Override
	public void setTag(final String tagDF) {
		super.setTag(tagDF);

		if (tagDF.length() == 3) {
			try {
				if (Integer.parseInt(tagDF) < 10) {
					throw new InvalidMARCException(tagDF + " is not a valid DataField tag");
				}
			} catch (final NumberFormatException details) {
				throw new InvalidMARCException(tagDF + " is not a number");
			}
		} else {
			throw new InvalidMARCException(tagDF + " is not a three digit tag");
		}
	}

	/**
	 * Sets the field's first indicator.
	 *
	 * @param aFirstInd The first indicator
	 */
	@Override
	public void setIndicator1(final char aFirstInd) {
		myFirstInd = aFirstInd;
	}

	/**
	 * Returns the field's first indicator.
	 *
	 * @return The field's first indicator
	 */
	@Override
	public char getIndicator1() {
		return myFirstInd;
	}

	/**
	 * Sets the field's second indicator.
	 *
	 * @param aSecondInd The field's second indicator
	 */
	@Override
	public void setIndicator2(final char aSecondInd) {
		mySecondInd = aSecondInd;
	}

	/**
	 * Returns the field's second indicator
	 *
	 * @return The field's second indicator
	 */
	@Override
	public char getIndicator2() {
		return mySecondInd;
	}

	/**
	 * Adds a <code>Subfield</code>.
	 *
	 * @param subfield The <code>Subfield</code> of a <code>DataField</code>
	 * @throws IllegalAddException when the parameter is not an instance of
	 *                             <code>SubfieldImpl</code>
	 */
	@Override
	public void addSubfield(final Subfield subfield) {
		if (subfield instanceof MarcSubfield) {
			mySFList.add(subfield);
		} else {
			throw new IllegalAddException("Supplied Subfield isn't an instance of SubfieldImpl");
		}
	}

	/**
	 * Inserts a <code>Subfield</code> at the specified position.
	 *
	 * @param sfIndex    The subfield's position within the list
	 * @param subfield The <code>Subfield</code> object
	 * @throws IllegalAddException when supplied Subfield isn't an instance of
	 *                             <code>SubfieldImpl</code>
	 */
	@Override
	public void addSubfield(final int sfIndex, final Subfield subfield) {
		mySFList.add(sfIndex, subfield);
	}

	/**
	 * Removes a <code>Subfield</code> from the field.
	 *
	 * @param subfield The subfield to remove from the field.
	 */
	@Override
	public void removeSubfield(final Subfield subfield) {
		mySFList.remove(subfield);
	}

	/**
	 * Returns the list of <code>Subfield</code> objects.
	 *
	 * @return The list of <code>Subfield</code> objects
	 */
	@Override
	public List<Subfield> getSubfields() {
		// TODO: consistent result/expectation as getSubfields(char)?
		return mySFList;
	}

	/**
	 * Returns the {@link Subfield}s with the supplied <code>char</code> code.
	 *
	 * @param code A subfield code
	 * @return A {@link List} of {@link Subfield}s
	 */
	@Override
	public List<Subfield> getSubfields(final char code) {
		final List<Subfield> subfields = new ArrayList<Subfield>();

		for (final Subfield subfield : mySFList) {
			if (subfield.getCode() == code) {
				subfields.add(subfield);
			}
		}

		return subfields;
	}

	/**
	 * Returns the number of subfields in this <code>DataField</code>.
	 *
	 * @return The number of subfields in this <code>DataField</code>
	 */
	@Override
	public int countSubfields() {
		return mySFList != null ? mySFList.size() : 0;
	}

	/**
	 * Returns a list of subfields from a supplied pattern. The pattern can either
	 * be a string of subfield codes or a regular expression to compare subfield
	 * codes against. The inclusion of brackets indicates the pattern should be
	 * parsed as a regular expression.
	 */
	@Override
	public List<Subfield> getSubfields(final String aPattern) {
		final List<Subfield> sfData = new ArrayList<Subfield>();

		if (aPattern == null || aPattern.length() == 0) {
			for (final Subfield sf : this.getSubfields()) {
				sfData.add(sf);
			}
		} else if (aPattern.contains("[")) {
			// Brackets indicate a pattern
			try {
				final Pattern sfPattern = Pattern.compile(aPattern);

				for (final Subfield sf : this.getSubfields()) {
					final Matcher m = sfPattern.matcher("" + sf.getCode());

					if (m.matches()) {
						sfData.add(sf);
					}
				}
			} catch (final PatternSyntaxException details) {
				throw new PatternSyntaxException(details.getDescription() + " in subfield pattern " + aPattern,
						details.getPattern(), details.getIndex());
			}
		} else {
			// Otherwise string is a list of values
			for (final Subfield sf : this.getSubfields()) {
				if (aPattern.contains(String.valueOf(sf.getCode()))) {
					sfData.add(sf);
				}
			}
		}

		return sfData;
	}

	@Override
	public String getSubfieldsAsString(final String sPattern) {
		return getSubfieldsAsString(sPattern, '\u0000');
	}

	@Override
	public String getSubfieldsAsString(final String sPattern, final char paddingChar) {
		final List<Subfield> sfList = this.getSubfields(sPattern);

		if (sfList.isEmpty()) {
			return null;
		}

		final StringBuilder buf = new StringBuilder();

		for (final Subfield sf : sfList) {
			buf.append(sf.getData());

			if (paddingChar != '\u0000') {
				buf.append(sf.getData());
			}
		}

		return buf.toString();
	}

	/**
	 * Returns the first {@link Subfield} matching the supplied <code>char</code>
	 * code.
	 *
	 * @param code A code for the subfield to be returned
	 */
	@Override
	public Subfield getSubfield(final char code) {
		for (final Subfield subfield : mySFList) {
			if (subfield.getCode() == code) {
				return subfield;
			}
		}

		return null;
	}

	/**
	 * Returns <code>true</code> if a match is found for the supplied regular
	 * expression pattern; else, <code>false</code>.
	 *
	 * @param sfPattern A regular expression pattern to find in the subfields
	 */
	@Override
	public boolean find(final String sfPattern) {
		for (final Subfield subfield : mySFList) {
			if (subfield.find(sfPattern)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Returns a string representation of this data field.
	 * <p>
	 * Example:
	 *
	 * <pre>
	 *    245 10$aSummerland /$cMichael Chabon.
	 * </pre>
	 *
	 * @return A string representation of this data field
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(' ');
		sb.append(getIndicator1());
		sb.append(getIndicator2());

		for (final Subfield subfield : mySFList) {
			sb.append(subfield.toString());
		}

		return sb.toString();
	}

}
