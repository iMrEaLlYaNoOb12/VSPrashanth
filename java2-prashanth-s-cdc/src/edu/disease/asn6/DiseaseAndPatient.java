package edu.disease.asn6;

import java.util.List;

import edu.disease.asn3.Disease;

/**
 * This is a Javadoc comment for the DiseaseAndPatient class. It provides an
 * overview of the class.
 * 
 *
 */
public class DiseaseAndPatient {
	/**
	 * This is a Disease type of array to store diseases.
	 */
	private List<Disease> diseases;

	/**
	 * This is a Patient type of array to store patients
	 */
	private List<Patient> patients;

	/**
	 * This is a getter method for the Disease array.
	 * 
	 * @return Disease[]
	 */
	public List<Disease> getDiseases() {
		return diseases;
	}

	/**
	 * This is a setter method for the Disease[]
	 * 
	 * @param diseases
	 */
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	/**
	 * This is a getter method for the Patient array.
	 * 
	 * @return Patient[]
	 */
	public List<Patient> getPatients() {
		return patients;
	}

	/**
	 * This is a setter method fot the Patient array
	 * 
	 * @param patients
	 */
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

}
