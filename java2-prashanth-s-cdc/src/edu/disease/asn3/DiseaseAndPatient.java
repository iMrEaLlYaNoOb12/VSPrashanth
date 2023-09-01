package edu.disease.asn3;

/**
 * This is a Javadoc comment for the DiseaseAndPatient class. It provides an overview of
 * the class.
 * 
 *
 */
public class DiseaseAndPatient {
	/**
	 * This is a Disease type of array to store diseases.
	 */
	private Disease[] diseases;

	/**
	 * This is a Patient type of array to store patients
	 */
	private Patient[] patients;

	/**
	 * This is a getter method for the Disease array.
	 * 
	 * @return Disease[]
	 */
	public Disease[] getDiseases() {
		return diseases;
	}

	/**
	 * This is a setter method for the Disease[]
	 * 
	 * @param diseases
	 */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}

	/**
	 * This is a getter method for the Patient array.
	 * 
	 * @return Patient[]
	 */
	public Patient[] getPatients() {
		return patients;
	}

	/**
	 * This is a setter method fot the Patient array
	 * 
	 * @param patients
	 */
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

}
