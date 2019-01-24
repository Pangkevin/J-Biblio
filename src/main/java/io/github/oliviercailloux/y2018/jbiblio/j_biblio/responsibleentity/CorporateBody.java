package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

/**
 * data transfer object or DTO of CorporateBody
 */

public class CorporateBody extends AbstractResponsibleEntity {

	private String nameCorporateBody;

	public String getNameCorporateBody() {
		return nameCorporateBody;
	}

	public void setNameCorporateBody(String nameCorporateBody) {
		this.nameCorporateBody = nameCorporateBody;
	}

	public CorporateBody(String nameAuthority, String nameCorporateBody) {

		this.nameAuthority = nameAuthority;
		this.nameCorporateBody = nameCorporateBody;
	}

}
