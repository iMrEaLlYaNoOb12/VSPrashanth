package edu.disease.asn6;

import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;

/**
 * This is an interface called DiseaseControlManager, which has different
 * methods that have been declared.
 * 
 *
 */
public interface DiseaseControlManager {

	/**
	 * This method adds a new Disease to the application
	 * 
	 * @param name
	 * @param infectious
	 * @return Disease
	 */
	public abstract List<Disease> addDisease(String name, boolean infectious);

	/**
	 * This method return the Disease or null if not found
	 * 
	 * @param diseaseId
	 * @return Disease
	 */
	public abstract Disease getDisease(UUID diseaseId);

	/**
	 * This methods adds a new patient to the application. It supplies max
	 * parameters to the patient constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param maxDiseases
	 * @param maxExposures
	 * @return Patient
	 */
	public abstract Patient addPatient(String firstName, String lastName);

	/**
	 * This method returns the patient or null if not found.
	 * 
	 * @param patientId
	 * @return Patient
	 */
	public abstract Patient getPatient(UUID patientId);

	/**
	 * This method adds a disease to a patient
	 * 
	 * @param patientId
	 * @param diseaseId
	 */
	public abstract void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	/**
	 * This method adds an Exposure instance to the patient.
	 * 
	 * @param patientId
	 * @param exposure
	 */
	public abstract void addExposureToPatient(UUID patientId, Exposure exposure);

	/**
	 * This method returns the diseases array
	 * 
	 * @return Disease[]
	 */
	public abstract List<Disease> getDiseases();

	/**
	 * This method return the patients array
	 * 
	 * @return Patient[]
	 */
	public abstract List<Patient> getPatients();
}
