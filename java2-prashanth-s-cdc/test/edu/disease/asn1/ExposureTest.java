package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;

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
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testExposure() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPatientID() {
		Exposure exposure = new Exposure(patientId);
		UUID exp = exposure.getPatientId();
		assertNotNull(exp);
	}

	@Test
	void testGetDateTime() {
		Exposure exposure = new Exposure(patientId);
		exposure.setDateTime(LocalDateTime.now());
		LocalDateTime result = exposure.getDateTime();
		assertNotNull(result);
	}

	@Test
	void testSetDateTime() {
		Exposure exposure = new Exposure(patientId);
		exposure.setDateTime(LocalDateTime.now());
	}

	@Test
	void testGetExposureType() {
		fail("Not yet implemented");
	}

	@Test
	void testSetExposureType() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
