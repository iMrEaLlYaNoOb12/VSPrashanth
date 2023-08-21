package edu.disease.asn2;

import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn1.Exposure;

public class Patient implements Comparable<Patient> {

	private UUID patientId;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;

	int i = 0;
	int j = 0;

	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases > 0 && maxExposures > 0) {
			this.exposures = new Exposure[maxExposures];
			this.diseaseIds = new UUID[maxDiseases];
		} else {
			throw new IllegalArgumentException("Please enter a valid size..");
		}
	}

	public void addDiseaseID(UUID Id) {
		if (i >= diseaseIds.length) {
			throw new ArrayIndexOutOfBoundsException("Disease array range exceeded..");
		} else {
			diseaseIds[i++] = Id;
		}
	}

	public void addExposure(Exposure exp) {
		if (j >= exposures.length) {
			throw new ArrayIndexOutOfBoundsException("Exposure array range exceeded..");
		} else {
			exposures[j++] = exp;
		}

	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientID(UUID patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

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

	@Override
	public String toString() {
		return "Patient [patientID=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIDs=" + Arrays.toString(diseaseIds) + "]";
	}

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
