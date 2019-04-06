package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.io.Serializable;

public interface MarcLeader extends Serializable {

	/**
	 * Sets the identifier. The purpose of this identifier is to provide an
	 * identifier for persistency.
	 *
	 * @param id the identifier
	 */
	public void setId(Long id);

	/**
	 * Returns the identifier.
	 *
	 * @return Long - the identifier
	 */
	public Long getId();

	/**
	 * Sets the logical record length (positions 00-04).
	 *
	 * @param recordLength integer representing the record length
	 */
	public void setRecordLength(int recordLength);

	/**
	 * Sets the record status (position 05).
	 *
	 * @param recordStatus character representing the record status
	 */
	public void setRecordStatus(char recordStatus);

	/**
	 * Sets the type of record (position 06).
	 *
	 * @param typeOfRecord character representing the type of record
	 */
	public void setTypeOfRecord(char typeOfRecord);

	/**
	 * Sets implementation defined values (position 07-08).
	 *
	 * @param implDefined1 character array representing the implementation defined
	 *                     data
	 */
	public void setImplDefined1(char[] implDefined1);

	/**
	 * Sets the character encoding scheme (position 09).
	 *
	 * @param charCodingScheme character representing the character encoding
	 */
	public void setCharCodingScheme(char charCodingScheme);

	/**
	 * Sets the indicator count (position 10).
	 *
	 * @param indicatorCount integer representing the number of indicators present
	 *                       in a data field
	 */
	public void setIndicatorCount(int indicatorCount);

	/**
	 * Sets the subfield code length (position 11).
	 *
	 * @param subfieldCodeLength integer representing the subfield code length
	 */
	public void setSubfieldCodeLength(int subfieldCodeLength);

	/**
	 * Sets the base address of data (positions 12-16).
	 *
	 * @param baseAddressOfData integer representing the base address of data
	 */
	public void setBaseAddressOfData(int baseAddressOfData);

	/**
	 * Sets implementation defined values (positions 17-19).
	 *
	 * @param implDefined2 character array representing the implementation defined
	 *                     data
	 */
	public void setImplDefined2(char[] implDefined2);

	/**
	 * Sets the entry map (positions 20-23).
	 *
	 * @param entryMap character array representing the entry map
	 */
	public void setEntryMap(char[] entryMap);

	/**
	 * Returns the logical record length (positions 00-04).
	 *
	 * @return <code>int</code>- the record length
	 */
	public int getRecordLength();

	/**
	 * Returns the record status (positions 05).
	 *
	 * @return <code>char</code>- the record status
	 */
	public char getRecordStatus();

	/**
	 * Returns the record type (position 06).
	 *
	 * @return <code>char</code>- the record type
	 */
	public char getTypeOfRecord();

	/**
	 * Returns implementation defined values (positions 07-08).
	 *
	 * @return <code>char[]</code>- implementation defined values
	 */
	public char[] getImplDefined1();

	/**
	 * Returns the character coding scheme (position 09).
	 *
	 * @return <code>char</code>- the character coding scheme
	 */
	public char getCharCodingScheme();

	/**
	 * Returns the indicator count (positions 10).
	 *
	 * @return <code>int</code>- the indicator count
	 */
	public int getIndicatorCount();

	/**
	 * Returns the subfield code length (position 11).
	 *
	 * @return <code>int</code>- the subfield code length
	 */
	public int getSubfieldCodeLength();

	/**
	 * Returns the base address of data (positions 12-16).
	 *
	 * @return <code>int</code>- the base address of data
	 */
	public int getBaseAddressOfData();

	/**
	 * Returns implementation defined values (positions 17-19).
	 *
	 * @return <code>char[]</code>- implementation defined values
	 */
	public char[] getImplDefined2();

	/**
	 * Returns the entry map (positions 20-23).
	 *
	 * @return <code>char[]</code>- the entry map
	 */
	public char[] getEntryMap();

	/**
	 * <p>
	 * Creates a leader object from a string object.
	 * </p>
	 * <p>
	 * Indicator count and subfield code length are defaulted to 2 if they are not
	 * integer values.
	 * </p>
	 *
	 * @param ldr the leader string value
	 */
	public void unmarshal(String ldr);

	/**
	 * Creates a string object from this leader object.
	 *
	 * @return String - the string object from this leader object
	 */
	public String marshal();

}
