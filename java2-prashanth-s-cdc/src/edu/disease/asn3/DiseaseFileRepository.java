package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DiseaseFileRepository {
	String folderPath;

	public void save(Disease[] diseases, Patient[] patients) throws IOException {
		FileOutputStream diseaseFile = new FileOutputStream(folderPath + "\\diseases.dat");
		ObjectOutputStream diseaseOutput = new ObjectOutputStream(diseaseFile);
		diseaseOutput.writeObject(diseases);
		FileOutputStream patientFile = new FileOutputStream("D:\\Java workspace\\iopackage\\patients.dat");
		ObjectOutputStream patientOutput = new ObjectOutputStream(patientFile);
		patientOutput.writeObject(patients);
	}

	public DiseaseAndPatient init(String folderPath) throws IOException, ClassNotFoundException {
		if (folderPath == null) {
			throw new IllegalArgumentException("The folder is Empty...");

		} else {
			DiseaseAndPatient diseasePatient = new DiseaseAndPatient();
			this.folderPath = folderPath;
			FileInputStream disease = new FileInputStream(folderPath + "\\diseases.dat");
			ObjectInputStream diseaseInput = new ObjectInputStream(disease);
			diseasePatient.setDiseases((Disease[]) diseaseInput.readObject());
			FileInputStream patient = new FileInputStream(folderPath + "\\patients.dat");
			ObjectInputStream patientInput = new ObjectInputStream(patient);
			diseasePatient.setPatients((Patient[]) patientInput.readObject());
			return diseasePatient;
		}
	}

}
