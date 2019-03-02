package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;

/**
 * data transfer object or DTO of CorporateBody
 */

public class CorporateBody extends AbstractResponsibleEntity {

	/**
	 * Not <code>null</code>.
	 */
	private String nameCorporateBody;

	public CorporateBody(String nameAuthority, String nameCorporateBody) {

		this.nameAuthority = Objects.requireNonNull(nameAuthority);
		this.nameCorporateBody = Objects.requireNonNull(nameCorporateBody);
	}

	/**
	 * Return name of corporateBody
	 * 
	 * @return not <code>null</code>.
	 */
	public String getNameCorporateBody() {
		return nameCorporateBody;
	}

	/**
	 * Set this nameCorporateBody
	 * 
	 * @param nameCorporateBody not <code>null</code>.
	 */
	public void setNameCorporateBody(String nameCorporateBody) {
		this.nameCorporateBody = Objects.requireNonNull(nameCorporateBody);
	}

}
