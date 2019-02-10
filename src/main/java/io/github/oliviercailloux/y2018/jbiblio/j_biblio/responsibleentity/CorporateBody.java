package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import com.google.common.base.Strings;

/**
 * data transfer object or DTO of CorporateBody
 */

public class CorporateBody extends AbstractResponsibleEntity {

	/**
	 * Not <code>null</code>.
	 */
	private String nameCorporateBody;

	public CorporateBody(String nameAuthority, String nameCorporateBody) {

		this.nameAuthority = Strings.nullToEmpty(nameAuthority);
		this.nameCorporateBody = Strings.nullToEmpty(nameCorporateBody);
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
	 * @param nameCorporateBody if <code>null</code>, will be converted to an empty
	 *                          string.
	 */
	public void setNameCorporateBody(String nameCorporateBody) {
		this.nameCorporateBody = nameCorporateBody;
	}

}
