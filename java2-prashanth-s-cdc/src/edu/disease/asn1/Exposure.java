package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 
 * This is a Javadoc comment for the Exposure class. It provides an overview of
 * the class.
 *
 */
public class Exposure {

	/**
	 * This is a UUID type field to get the patient Id
	 */
	private UUID patientId;

	/**
	 * This is a LocalDateTime type field to get the date and time.
	 */
	private LocalDateTime dateTime;

	/**
	 * This is a String type field to get the exposure type.
	 */
	private String exposureType;

	/**
	 * This is the constructor for Exposure class.
	 *
	 * @param UUID patientId
	 */
	public Exposure(UUID patientId) {
		super();
		this.patientId = patientId;
	}

	/**
	 * This is a getter method for getting the patient Id which returns UUID.
	 * 
	 * @return UUID
	 * @param nothing
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * This is a setter method to set the patient Id
	 * 
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * This is a getter method for getting the date and time which returns
	 * LocalDateTime.
	 * 
	 * @return LocalDateTime
	 * @param nothing
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * This is a setter method for setting the date and time.
	 * 
	 * @param dateTime
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * This is a getter method for getting the exposure type which returns a String
	 * 
	 * @return String exposureType
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * This is a setter method for setting the exposure type which has a condition
	 * to accept the values "D" for direct exposure or "I" for indirect exposure. It
	 * throws an IllegalArgumentException with the appropriate message - "Invalid
	 * Exposure type" within the setExposure Type method if the supplied exposure
	 * type is not "D" and not "I".
	 * 
	 * @param String
	 * 
	 * @throw IllegalArgumentException("Invalid Exposure type")
	 */
	public void setExposureType(String exposureType) {
		if (exposureType.equalsIgnoreCase("D") || exposureType.equalsIgnoreCase("I")) {
			this.exposureType = exposureType;
		} else {
			throw new IllegalArgumentException("Invalid Exposure type");
		}
	}

	/**
	 * This is a hashcode method overriden which returns a (int)hashcode which is
	 * generated with fields dateTime (LocalDateTime) and patientID (UUID).
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * This is a equals method overriden which returns a boolean value which is
	 * generated with fields dateTime (LocalDateTime) and patientID (UUID) to
	 * compare with our own logic.
	 *
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	/**
	 * This is a toString method which is used to convert the respected fields as a
	 * String.
	 * 
	 * @return "Exposure [patientID=" + patientId + ", dateTime=" + dateTime + ",
	 *         exposureType=" + exposureType + "]"
	 */
	@Override
	public String toString() {
		return "Exposure [patientID=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}
