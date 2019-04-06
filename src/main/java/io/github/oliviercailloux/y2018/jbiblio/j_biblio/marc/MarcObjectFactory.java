package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import org.marc4j.MarcException;
import org.marc4j.marc.ControlField;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Leader;
import org.marc4j.marc.MarcFactory;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;

public abstract class MarcObjectFactory extends MarcFactory {

	/**
	 * Default constructor.
	 */
	public MarcObjectFactory() {
	}

	/**
	 * Returns a new control field instance.
	 * 
	 * @return ControlField
	 */
	@Override
	public ControlField newControlField() {
		return new MarcControlField();
	}

	/**
	 * Creates a new control field with the given tag and returns the instance.
	 * 
	 * @return ControlField
	 */
	@Override
	public ControlField newControlField(final String tag) {
		return new MarcControlField(tag);
	}

	/**
	 * Creates a new control field with the given tag and data and returns the
	 * instance.
	 * 
	 * @return ControlField
	 */
	@Override
	public ControlField newControlField(final String tag, final String data) {
		return new MarcControlField(tag, data);
	}

	/**
	 * Returns a new data field instance.
	 * 
	 * @return DataField
	 */
	@Override
	public DataField newDataField() {
		return new MarcDataField();
	}

	/**
	 * Creates a new data field with the given tag and indicators and returns the
	 * instance.
	 * 
	 * @return DataField
	 */
	@Override
	public DataField newDataField(final String tag, final char ind1, final char ind2) {
		return new MarcDataField(tag, ind1, ind2);
	}

	/**
	 * Creates a new data field with the given tag and indicators and subfields and
	 * returns the instance.
	 * 
	 * @return DataField
	 */
	@Override
	public DataField newDataField(final String tag, final char ind1, final char ind2,
			final String... subfieldCodesAndData) {
		final DataField df = new MarcDataField(tag, ind1, ind2);
		if (subfieldCodesAndData.length % 2 == 1) {
			throw new MarcException(
					"Error: must provide even number of parameters for subfields: code, data, code, data, ...");
		}
		for (int i = 0; i < subfieldCodesAndData.length; i += 2) {
			if (subfieldCodesAndData[i].length() != 1) {
				throw new MarcException("Error: subfieldCode must be a single character");
			}
			final Subfield sf = newSubfield(subfieldCodesAndData[i].charAt(0), subfieldCodesAndData[i + 1]);
			df.addSubfield(sf);
		}
		return (df);
	}

	/**
	 * Returns a new leader instance.
	 * 
	 * @return Leader
	 */
	@Override
	public Leader newLeader() {
		return new MarcLeaderImplementation();
	}

	/**
	 * Creates a new leader with the given <code>String</code> object.
	 * 
	 * @return Leader
	 */
	@Override
	public Leader newLeader(final String ldr) {
		return new MarcLeaderImplementation(ldr);
	}

	/**
	 * Returns a new record instance with a default leader.
	 * 
	 * @return Record
	 */
	@Override
	public Record newRecord() {
		return newRecord(new MarcLeaderImplementation("00000nam a2200000 a 4500"));
	}

	/**
	 * Returns a new subfield instance.
	 * 
	 * @return Leader
	 */
	@Override
	public Subfield newSubfield() {
		return new MarcSubfield();
	}

	/**
	 * Creates a new subfield with the given identifier.
	 * 
	 * @return Subfield
	 */
	@Override
	public Subfield newSubfield(final char code) {
		return new MarcSubfield(code);
	}

	/**
	 * Creates a new subfield with the given identifier and data.
	 * 
	 * @return Subfield
	 */
	@Override
	public Subfield newSubfield(final char code, final String data) {
		return new MarcSubfield(code, data);
	}

	/**
	 * Returns a new {@link Record} with the supplied {@link Leader}.
	 */
	@Override
	public Record newRecord(final Leader leader) {
		final Record record = new MarcRecordImplementation();
		record.setLeader(leader);
		return record;
	}

	/**
	 * Returns a new {@link Record} with a {@link Leader} from the supplied string.
	 */
	@Override
	public Record newRecord(final String leader) {
		return newRecord(new MarcLeaderImplementation(leader));
	}

}