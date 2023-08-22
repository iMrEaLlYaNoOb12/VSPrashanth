package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 * This is the implementation class of DiseaseControlManager. It has the method
 * definition of the abstract methods of DiseaseControlManager.
 *
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {

	/**
	 * This is a Disease type of array which stores diseases
	 */
	private Disease[] diseases;
	/**
	 * This is a Patient type of array which stores patients.
	 */
	private Patient[] patients;
	int maxDiseases, maxPatients;
	int i = 0;

	/**
	 * It is a constructor that accepts the maximum diseases and the maximum
	 * patients that can be stored and intialize the arrays using those integer
	 * parameters. The constructor throws an IllegalArgumentException with a message
	 * if the supplied integers cannot be used to intialize the arrays.
	 * 
	 * @param maxDiseases - It is used to intialize the Disease array
	 * @param maxPatients - It is used to intialize the Patient array
	 */
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases > 0 && maxPatients > 0) {
			this.diseases = new Disease[maxDiseases];
			this.patients = new Patient[maxPatients];
		} else {
			throw new IllegalArgumentException("Please enter a valid size..");
		}
	}

	/**
	 * This method creates a new Disease and stores the Disease in the diseases
	 * array. It creates an instance of the appropriate Disease subclass based in
	 * the infectious boolean parameter.
	 * 
	 * It throws an IllegalStateException with an appropriate message if no more
	 * diseases can be added to the array.
	 */
	@Override
	public Disease addDisease(String name, boolean infectious) {
		if (i < maxDiseases) {
			if (infectious) {
				return diseases[i++] = new InfectiousDisease();
			} else {
				return diseases[i++] = new NonInfectiousDisease();
			}
		} else {
			throw new IllegalStateException("No more Disease can be Added !");
		}
	}

	/**
	 * This method returns the Disease from the array that has an ID that matches
	 * the supplied disease ID or null if not found.
	 */
	@Override
	public Disease getDisease(UUID diseaseId) {
		for (Disease disease : diseases) {
			if (disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}

		return null;
	}

	/**
	 * This method creates a new Patient using the supplied arguments and add the
	 * patient to the patients array. It throws and IllegalStateException with a
	 * message if no more patients can be added to the array.
	 */
	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		Patient patient = new Patient(maxDiseases, maxExposures);
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		for (int i = 0; i < patients.length; i++) {
			if (patients[i] == null) {
				patients[i] = patient;
				break;

			}
			if (i == patients.length - 1) {
				throw new IllegalStateException("No more patients can be added to this array");
			}
		}
		return patient;

	}

	/**
	 * This method returns the Patient from the array that has an ID that matches
	 * the supplied patient ID or null if not found.
	 */
	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient patient : patients) {
			if (patient.getPatientId().equals(patientId))
				return patient;
		}
		return null;
	}

	/**
	 * This method retrieves the Patient from the patients array. If it is not
	 * found, it throws an IllegalArgumentException with a message.
	 * 
	 * It also retrieves the Disease from the disease array. If it is not found,
	 * throw an IllegalArgumentException with a message.
	 * 
	 * It gets the disease ID from the retrieved Disease and add it to the patient.
	 */
	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);
		Disease disease = getDisease(diseaseId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		if (disease == null) {
			throw new IllegalArgumentException("Invalid Disease Id !");
		}
		patient.addDiseaseID(disease.getDiseaseId());

	}

	/**
	 * It retrieves the Patient from the patients array. If it is not found, it
	 * throws an IllegalArgumentException with a message. It adds the supplied
	 * Exposure to the retrieved Patient.
	 */
	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		for (Patient patient : patients) {
			if (patient.getPatientId() == patientId) {
				patient.addExposure(exposure);
				return;
			}
			throw new IllegalArgumentException("");
		}

	}

	/**
	 * This method returns the diseases array
	 * 
	 * @return Disease[]
	 */
	@Override
	public Disease[] getDiseases() {

		return this.diseases;
	}

	/**
	 * This method return the patients array
	 * 
	 * @return Patient[]
	 */
	@Override
	public Patient[] getPatients() {

		return this.patients;
	}

}
