package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities;

import java.util.Objects;

import com.google.common.base.Strings;

/**
 * This class represents the 4th element from group 1 entities of FRBR model
 * Item is a single exemplar of a manifestation We will implement at a first
 * place only the attributes related to publications We can enhance the class
 * later to include attributes related to other types of items (books, music,
 * ...)
 */
public class Item {
	/**
	 * Not <code>null</code>.
	 */
	private int idItem;
	
	/**
	 * Not <code>null</code>.
	 */
	private int idManifestation;
	
	/**
	 * Not <code>null</code>.
	 */
	private String itemIdentifier;
	
	/**
	 * Not <code>null</code>.
	 */
	private String fingerprint;
	
	/**
	 * Not <code>null</code>.
	 */
	private String provenanceOfTheItem;

	/**
	 * This function is the constructor of manifestation entity
	 * 
	 * @param idItem              A systematic identifier of an item
	 * @param idManifestation     Id of the manifestation embodied by this item
	 * @param itemIdentifier      Number or code uniquely associated with the item
	 *                            to identify it
	 * @param fingerprint         An identifier constructed by combining groups of
	 *                            characters transcribed from specified pages of a
	 *                            printed item
	 * @param provenanceOfTheItem A record of previous ownership or custodianship of
	 *                            the item
	 */
	public Item(int idItem, int idManifestation, String itemIdentifier) {
		this.idItem = Objects.requireNonNull(idItem);
		this.idManifestation = Objects.requireNonNull(idManifestation);
		this.itemIdentifier = Objects.requireNonNull(itemIdentifier);
		this.fingerprint = "";
		this.provenanceOfTheItem = "";
	}

	/**
	 * @return not <code>null</code>.
	 */
	public int getIdItem() {
		return idItem;
	}

	/**
	 * 
	 * @param idItem not <code>null</code>
	 */
	public void setIdItem(int idItem) {
		this.idItem = Objects.requireNonNull(idItem);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getItemIdentifier() {
		return itemIdentifier;
	}

	/**
	 * 
	 * @param itemIdentifier not <code>null</code>
	 */
	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = Objects.requireNonNull(itemIdentifier);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getFingerprint() {
		return fingerprint;
	}

	/**
	 * 
	 * @param fingerprint if <code>null</code>, will be converted to an empty
	 *                    string.
	 */
	public void setFingerprint(String fingerprint) {
		this.fingerprint = Strings.nullToEmpty(fingerprint);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getProvenanceOfTheItem() {
		return provenanceOfTheItem;
	}

	/**
	 * 
	 * @param provenanceOfTheItem if <code>null</code>, will be converted to an empty
	 *                    string.
	 */
	public void setProvenanceOfTheItem(String provenanceOfTheItem) {
		this.provenanceOfTheItem = Strings.nullToEmpty(provenanceOfTheItem);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public int getIdManifestation() {
		return idManifestation;
	}

	public void setIdManifestation(int idManifestation) {
		this.idManifestation = idManifestation;
	}

}
