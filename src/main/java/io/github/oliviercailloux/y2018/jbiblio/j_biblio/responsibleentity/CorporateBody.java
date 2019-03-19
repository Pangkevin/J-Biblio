package io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * data transfer object or DTO of CorporateBody
 */

@Entity
@Table(name = "CorporateBody")
public class CorporateBody {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	/**
	 * nameAuthory It should not be allowed to be unknown. This is an essential
	 * information. Not <code>null</code>, empty if unknown.
	 */
	@Column(name = "nameAuthority")
	protected String nameAuthority;

	/**
	 * Not <code>null</code>.
	 */
	@Column(name = "nameCorporateBody")
	private String nameCorporateBody;

	public CorporateBody() {

		this.nameAuthority = "";
		this.nameCorporateBody = "";
	}

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
