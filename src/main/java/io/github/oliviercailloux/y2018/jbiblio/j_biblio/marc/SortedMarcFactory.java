package io.github.oliviercailloux.y2018.jbiblio.j_biblio.marc;

import org.marc4j.marc.Leader;
import org.marc4j.marc.Record;

public class SortedMarcFactory extends MarcObjectFactory {
	/**
	 * Returns a new {@link Record} from the supplied {@link Leader}.
	 */
	@Override
	public Record newRecord(final Leader leader) {
		final Record record = new MarcSortedRecord();
		record.setLeader(leader);
		return record;
	}
}
