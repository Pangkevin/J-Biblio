package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleEntity;

public class AbstractResponsibleEntity implements IResponsibleEntity {

	/**
	 * nameAuthory allows to uniquely identify a responsibleEntity
	 */
	protected String nameAuthority;

	public String getNameAuthority() {
		return nameAuthority;
	}

	public void setNameAuthority(String nameAuthority) {
		this.nameAuthority = nameAuthority;
	}

}
