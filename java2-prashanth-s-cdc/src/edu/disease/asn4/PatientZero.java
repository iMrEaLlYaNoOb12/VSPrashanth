package edu.disease.asn4;

import java.time.LocalDateTime;

import edu.disease.asn6.Patient;

/**
 * 
 * This is a Javadoc comment for the PatientZero class. It provides an overview
 * of the class.
 *
 */
public class PatientZero {

	/**
	 * This is a Patient type field to store Patient
	 */
	private Patient patient;

	/**
	 * This is a LocalDateTime type field to store the exposure date and time.
	 */
	private LocalDateTime exposureDateTime;

	/**
	 * This is a boolean type field to store whether exposed or not (True or False).
	 */
	private boolean exposed;

	/**
	 * This is a getter method for getting the Patient
	 * 
	 * @return Patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * This is a setter method for setting the patient
	 * 
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * This is a getter method for getting the Exposure date and time.
	 * 
	 * @return LocalDateTime
	 */
	public LocalDateTime getExposureDateTime() {
		return exposureDateTime;
	}

	/**
	 * This is a setter method for setting the Exposure date and time.
	 * 
	 * @param exposureDateTime
	 */
	public void setExposureDateTime(LocalDateTime exposureDateTime) {
		this.exposureDateTime = exposureDateTime;
	}

	/**
	 * This is a getter method for getting the expose whether it is true or not.
	 * 
	 * @return
	 */
	public boolean isExposed() {
		return exposed;
	}

	/**
	 * This is a setter method for setting the expose whether it is true or not.
	 * 
	 * @param exposed
	 */
	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

}
