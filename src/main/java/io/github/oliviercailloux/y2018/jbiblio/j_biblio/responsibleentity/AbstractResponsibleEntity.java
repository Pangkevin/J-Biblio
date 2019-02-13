package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import com.google.common.base.Strings;

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
		this.nameAuthority = Strings.nullToEmpty(nameAuthority);
	}

}
