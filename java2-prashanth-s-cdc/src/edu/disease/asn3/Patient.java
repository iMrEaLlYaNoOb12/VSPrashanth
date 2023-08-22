package edu.disease.asn3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 * This is a Javadoc comment for the Patient class. It provides an overview of
 * the class. It implements Comparable to sort according to the requirement and 
 * it implements Serializable so that the class can be serialized
 *
 */
public class Patient implements Comparable<Patient>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This is a UUID type field to store the patient Id.
	 */
	private UUID patientId;

	/**
	 * This is a String type field to store the first name.
	 */
	private String firstName;

	/**
	 * This is a String type field to store the last name.
	 */
	private String lastName;

	/**
	 * This is an Exposure array type field to store multiple exposures
	 */
	private Exposure[] exposures;

	/**
	 * This is an UUID aray type field to store multiple disease Id
	 */
	private UUID[] diseaseIds;

	int i = 0;
	int j = 0;

	/**
	 * This is a constructor of Patient class which accepts two parameters
	 * 
	 * @param maxDiseases  This is used to intialize the size of Disease ID array.
	 * @param maxExposures This is used to intialize the size of Exposure array.
	 * @throw {@link IllegalArgumentException("Please enter a valid size..")}
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases > 0 && maxExposures > 0) {
			this.exposures = new Exposure[maxExposures];
			this.diseaseIds = new UUID[maxDiseases];
		} else {
			throw new IllegalArgumentException("Please enter a valid size..");
		}
	}

	/**
	 * This is a method to add Disease ID in the Disease ID array.If the array size
	 * exceeds the array, it throws an ArrayIndexOutOfBoundsException with a
	 * message.
	 * 
	 * @param Id
	 * @throw ArrayIndexOutOfBoundsException("Disease array range exceeded..")
	 */
	public void addDiseaseID(UUID Id) {
		if (i >= diseaseIds.length) {
			throw new ArrayIndexOutOfBoundsException("Disease array range exceeded..");
		} else {
			diseaseIds[i++] = Id;
		}
	}

	/**
	 * This is a method to add exposure in the Exposure array. If the array size
	 * exceed the array, it throws an ArrayIndexOutOfBoundsException with a message.
	 * 
	 * @throw ArrayIndexOutOfBoundsException("Exposure array range exceeded..")
	 * @param exp
	 */
	public void addExposure(Exposure exp) {
		if (j >= exposures.length) {
			throw new ArrayIndexOutOfBoundsException("Exposure array range exceeded..");
		} else {
			exposures[j++] = exp;
		}

	}

	/**
	 * This is a getter method to get the patient Id which return UUID.
	 * 
	 * @return UUID patientId
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * This is a setter method to set the patient Id.
	 * 
	 * @param patientId
	 */
	public void setPatientID(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * This is a getter method to get the first name which return a String.
	 * 
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This is a setter method to set the first name .
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This is a getter method to get the last name which return a String
	 * 
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This is a setter method to set the last name.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This is a hashcode method overriden which returns a hashcode which is
	 * generated with field patientID (UUID).
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * This is a equals method overriden which returns a boolean value which is
	 * generated with field patientID (UUID) to compare with our own logic.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
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
	 * @return "Patient [patientID=" + patientId + ", firstName=" + firstName + ",
	 *         lastName=" + lastName + ", exposures=" + Arrays.toString(exposures) +
	 *         ", diseaseIDs=" + Arrays.toString(diseaseIds) + "]"
	 */
	@Override
	public String toString() {
		return "Patient [patientID=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIDs=" + Arrays.toString(diseaseIds) + "]";
	}

	/**
	 * This is a compare method which has been overriden from the Comparable
	 * interface to sort the patients last name first then the first name,and it
	 * should be case insensitive
	 * 
	 * @return int
	 * @param Patient
	 */
	@Override
	public int compareTo(Patient patient) {
		// First, compare last names
		int lastNameComparison = this.lastName.compareToIgnoreCase(patient.lastName);

		if (lastNameComparison != 0) {
			return lastNameComparison;
		}

		// If last names are the same, compare first names
		return this.firstName.compareToIgnoreCase(patient.firstName);
	}

}
