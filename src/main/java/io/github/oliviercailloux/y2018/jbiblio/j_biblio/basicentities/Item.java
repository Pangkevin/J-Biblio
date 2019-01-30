package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities;

/**
 * This class represents the 4th element from group 1 entities of FRBR model
 * Item is a single exemplar of a manifestation We will implement at a first
 * place only the attributes related to publications We can enhance the class
 * later to include attributes related to other types of items (books, music,
 * ...)
 */
public class Item {
	private int idItem;
	private int idManifestation;
	private String itemIdentifier;
	private String fingerprint;
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
	public Item(int idItem, int idManifestation, String itemIdentifier, String fingerprint,
			String provenanceOfTheItem) {
		this.idItem = idItem;
		this.idManifestation = idManifestation;
		this.itemIdentifier = itemIdentifier;
		this.fingerprint = fingerprint;
		this.provenanceOfTheItem = provenanceOfTheItem;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getItemIdentifier() {
		return itemIdentifier;
	}

	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getProvenanceOfTheItem() {
		return provenanceOfTheItem;
	}

	public void setProvenanceOfTheItem(String provenanceOfTheItem) {
		this.provenanceOfTheItem = provenanceOfTheItem;
	}

	public int getIdManifestation() {
		return idManifestation;
	}

	public void setIdManifestation(int idManifestation) {
		this.idManifestation = idManifestation;
	}

}
