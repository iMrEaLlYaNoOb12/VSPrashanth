package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class PatientTest {

	final UUID patientId = UUID.randomUUID();


	@Test
	void testAddExposure() {
		Patient patient = new Patient(2, 2);
		Exposure exp = new Exposure(patientId);
		patient.addExposure(exp);

	}

	@Test
	void InvalidSizeAddExposure() {
		// assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		// exposure.setExposureType("X"));
	}

	@Test
	void testGetPatientID() {
		Patient patient = new Patient(2, 2);
		patient.setPatientId(patientId);
		UUID pat = patient.getPatientId();
		assertEquals(patientId, pat);
	}

	@Test
	void testSetPatientID() {
		Patient patient = new Patient(2, 2);
		patient.setPatientId(patientId);
		UUID pat = patient.getPatientId();
		assertEquals(patientId, pat);
	}

	@Test
	void testSetAndGetExposures() {
		Patient patient = new Patient(2, 2);
		Exposure exposure = new Exposure(UUID.randomUUID());
		Exposure exposure2 = new Exposure(UUID.randomUUID());
		Exposure[] exposures = { exposure, exposure2 };
		patient.setExposures(exposures);
		Exposure[] resExp = patient.getExposures();
		assertEquals(exposures, resExp);

	}

	@Test
	void testSetAndGetDiseaseIds() {
		Patient patient = new Patient(2, 2);
		UUID diseaseId1 = (UUID.randomUUID());
		UUID diseaseId2 = (UUID.randomUUID());
		UUID[] diseaseIds = { diseaseId1, diseaseId2 };
		patient.setDiseaseIds(diseaseIds);
		UUID[] resDisID = patient.getDiseaseIds();
		assertEquals(diseaseIds, resDisID);

	}

	@Test
	void testSetAndGetFirstName() {
		Patient patient = new Patient(2, 2);
		patient.setFirstName("Prashanth");
		String getFname = patient.getFirstName();
		assertEquals("Prashanth", getFname);
	}

	@Test
	void testSetAndGetLastName() {
		Patient patient = new Patient(2, 2);
		patient.setLastName("Kumar");
		String getLname = patient.getLastName();
		assertEquals("Kumar", getLname);
	}

	@Test
	void testHashCode() {
		Patient pat1 = new Patient(2, 2);
		Patient pat2 = new Patient(2, 4);
		pat1.setPatientId(patientId);
		pat2.setPatientId(patientId);
		assertEquals(pat1.hashCode(), pat2.hashCode());

	}

	@Test
	void testHashCode1() {
		Patient pat1 = new Patient(2, 2);
		Patient pat2 = new Patient(2, 4);
		pat1.setPatientId(null);
		pat2.setPatientId(patientId);
		assertNotEquals(pat1.hashCode(), pat2.hashCode());

	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		Patient patient = new Patient(2, 2);
		patient.setPatientId(patientId);
		patient.setFirstName("Barry");
		patient.setLastName("Allen");
		Exposure exposure = new Exposure(UUID.randomUUID());
		Exposure exposure2 = new Exposure(UUID.randomUUID());
		Exposure[] exposures = { exposure, exposure2 };
		patient.setExposures(exposures);
		UUID diseaseId1 = (UUID.randomUUID());
		UUID diseaseId2 = (UUID.randomUUID());
		UUID[] diseaseIds = { diseaseId1, diseaseId2 };
		patient.setDiseaseIds(diseaseIds);

		String expectedToString = "Patient [patientID=" + patientId + ", firstName=" + "Barry" + ", lastName=" + "Allen"
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIDs=" + Arrays.toString(diseaseIds) + "]";
		String actualToString = patient.toString();

		assertEquals(expectedToString, actualToString);

	}

}
