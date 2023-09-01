package edu.disease.asn6;

//import java.util.Arrays;
import java.util.List;

import edu.disease.asn6.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn4.PatientZero;

public class ContactTrace {
	List<Patient> patients;

	Exposure earlyExposure;
	PatientZero pZero;

	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.patients = diseaseControlManager.getPatients();
	}

	public PatientZero findPatientZero(Patient patient) {
		for (Exposure e : patient.getExposures()) {
			if (e.getExposureType().equalsIgnoreCase("D")) {
				if (earlyExposure == null || e.getDateTime().isBefore(earlyExposure.getDateTime())) {
					earlyExposure = e;
				}
			}
		}
		if (earlyExposure != null) {
			for (Patient p1 : this.patients) {
				for (Exposure e : p1.getExposures()) {
					if (e.getExposureType().equalsIgnoreCase("D")) {
						if (e.getDateTime().isBefore(earlyExposure.getDateTime())) {
							earlyExposure = e;
							pZero.setPatient(p1);
							pZero.setExposureDateTime(e.getDateTime());
							pZero.setExposed(true);
							return findPatientZero(p1);
						}
					}
				}
			}
		}
		return pZero;
	}

}
