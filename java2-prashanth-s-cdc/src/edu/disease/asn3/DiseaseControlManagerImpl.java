package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;
	int maxDiseases, maxPatients;
	int i = 0;

	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases > 0 && maxPatients > 0) {
			this.diseases = new Disease[maxDiseases];
			this.patients = new Patient[maxPatients];
		} else {
			throw new IllegalArgumentException("Please enter a valid size..");
		}
	}

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

	@Override
	public Disease getDisease(UUID diseaseId) {
		for (Disease disease : diseases) {
			if (disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}

		return null;
	}

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

	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient patient : patients) {
			if (patient.getPatientId().equals(patientId))
				return patient;
		}
		return null;
	}

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

	@Override
	public Disease[] getDiseases() {

		return this.diseases;
	}

	@Override
	public Patient[] getPatients() {

		return this.patients;
	}

}
