package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;
import java.util.UUID;
import org.junit.Before;

class ExposureTest {
	final UUID patientId = UUID.randomUUID();

	@Test
	public void TestExposures() {
		Exposure exposure = new Exposure(patientId);
		exposure.setDateTime(LocalDateTime.now());
		exposure.setExposureType("D");
	}


	@Test
	void testGetPatientID() {
		Exposure exposure = new Exposure(patientId);
		UUID exp = exposure.getPatientId();
		// assertNotNull(exp);
		assertEquals(patientId, exp);
	}

	@Test
	void testSetPatientId() {
		Exposure exposure = new Exposure(patientId);
		exposure.setPatientId(patientId);
		UUID exp = exposure.getPatientId();
		// assertNotNull(exp);
		assertEquals(patientId, exp);
	}

	@Test
	void testGetSetDateTime() {
		Exposure exposure = new Exposure(patientId);
		LocalDateTime time = LocalDateTime.now();
		exposure.setDateTime(time);
		LocalDateTime result = exposure.getDateTime();
		// assertNotNull(result);
		assertEquals(time, result);
	}

	@Test
	void testGetExposureType() {
		Exposure exposure = new Exposure(patientId);
		exposure.setExposureType("D");
		assertEquals("D", exposure.getExposureType());

	}

	@Test
	void testGetExposureType1() {
		Exposure exposure = new Exposure(patientId);
		exposure.setExposureType("I");
		assertEquals("I", exposure.getExposureType());

	}

	@Test
	void validExposureType() {
		Exposure exposure = new Exposure(patientId);
		exposure.setExposureType("D");
		assertEquals("D", exposure.getExposureType());
	}

	@Test
	void validExposureTypeIgnoreCase() {
		Exposure exposure = new Exposure(patientId);
		exposure.setExposureType("I");
		assertEquals("I", exposure.getExposureType());
	}

	@Test
	void invalidExposureType() {
		Exposure exposure = new Exposure(patientId);
		assertThrows(IllegalArgumentException.class, () -> exposure.setExposureType("X"));
	}

	@Test
	void testHashCode() {
		Exposure exp = new Exposure(patientId);
		Exposure expo = new Exposure(patientId);
		assertEquals(exp.hashCode(), expo.hashCode());

	}

	@Test
	void testHashCode1() {
		Exposure exp = new Exposure(null);
		Exposure expo = new Exposure(patientId);
		assertNotEquals(exp.hashCode(), expo.hashCode());

	}

	@Test
	void testHashCode2() {
		Exposure exp = new Exposure(null);
		exp.setDateTime(LocalDateTime.now());
		Exposure expo = new Exposure(patientId);
		assertNotEquals(exp.hashCode(), expo.hashCode());

	}

	@Test
	void testEqualsObject() {

	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
