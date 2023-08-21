package edu.disease.asn1;

import java.util.UUID;

/**
 * 
 * This is a Javadoc comment for the Disease class. It provides an overview of
 * the class.
 *
 */
public class Disease {

	/**
	 * This is a UUID type field which takes disease ID.
	 */
	private UUID diseaseId;

	/**
	 * This is a String type field which takes name.
	 */
	private String name;

	/**
	 * This is a getter method for getting the disease Id which return UUID.
	 * 
	 * @return UUID diseaseID
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * This is a setter method to set the disease ID.
	 * 
	 * @param diseaseId
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * This is a getter method to get the name which return a String.
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This is a setter method which is used to set the name.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This is a hashcode method overriden which returns a hashcode which is
	 * generated with field diseaseId (UUID).
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}

	/**
	 * This is a equals method overriden which returns a boolean value which is
	 * generated with field diseaseID (UUID) to compare with our own logic.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}

	/**
	 * This is a toString method which is used to convert the respected fields as a
	 * String.
	 * 
	 * @return return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

}
