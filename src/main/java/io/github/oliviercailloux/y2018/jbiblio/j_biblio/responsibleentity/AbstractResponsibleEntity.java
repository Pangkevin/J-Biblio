package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;

public class AbstractResponsibleEntity {

	/**
	 * nameAuthory allows to uniquely identify a responsibleEntity Not
	 * <code>null</code>, empty if unknown.
	 */
	protected String nameAuthority;

	/**
	 * Return name authority of the Responsible entitie
	 * 
	 * @return not <code>null</code>.
	 */
	public String getNameAuthority() {
		return nameAuthority;
	}

	/**
	 * 
	 * @param nameAuthority
	 */
	public void setNameAuthority(String nameAuthority) {
		this.nameAuthority = Objects.requireNonNull(nameAuthority);
	}

}
