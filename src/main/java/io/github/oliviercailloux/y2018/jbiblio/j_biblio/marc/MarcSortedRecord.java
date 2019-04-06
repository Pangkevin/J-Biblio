package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import java.util.Collections;

import org.marc4j.marc.VariableField;

public class MarcSortedRecord extends MarcRecordImplementation {

	/**
	 * The class' <code>serialVersionUID</code>.
	 */
	private static final long serialVersionUID = 21647558104914722L;

	/**
	 * Adds a {@link VariableField} to the record.
	 */
	@Override
	public void addVariableField(final VariableField field) {
		final int cfSize = controlFieldList.size();

		// Let the class we extend do the work...
		super.addVariableField(field);

		// If a control field was added, sort them; else, sort the data fields
		if (cfSize != controlFieldList.size()) {
			Collections.sort(controlFieldList);
		} else {
			Collections.sort(dataFieldList);
		}
	}

}
