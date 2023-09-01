package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * This is a Javadoc comment for the DiseaseFileRepository class. It provides an
 * overview of the class.
 *
 */
public class DiseaseFileRepository {
	/**
	 * It is to initialize the folder path
	 */
	String folderPath;

	/**
	 * This method serializes and saves the supplied disease and patient array data
	 * to two separate files on the file system using the folder path provided from
	 * the init method. It serializes the disease array data to a file named,
	 * diseases.dat and the patient array data to a file named patients.dat.
	 * 
	 * @param diseases
	 * @param patients
	 * @throws IOException
	 */
	public void save(Disease[] diseases, Patient[] patients) throws IOException {
		FileOutputStream diseaseFile = new FileOutputStream(folderPath + "\\diseases.dat");
		ObjectOutputStream diseaseOutput = new ObjectOutputStream(diseaseFile);
		diseaseOutput.writeObject(diseases);
		FileOutputStream patientFile = new FileOutputStream("D:\\Java workspace\\iopackage\\patients.dat");
		ObjectOutputStream patientOutput = new ObjectOutputStream(patientFile);
		patientOutput.writeObject(patients);
	}

	/**
	 * This method accepts a file path to the folder where the data was serialized
	 * and set the folder path to a property on the class. It Deserializes the
	 * disease data from the file named diseases.dat, and deserializes the patient
	 * data from the file named patients.dat. It sets both the deserialized disease
	 * and patient arrays to an instance of the DiseaseAndPatient class and return
	 * that instance. It also throw an IllegalArgumentException with an appropriate
	 * message if the supplied folder path is null.
	 * 
	 * @param folderPath
	 * @return DiseaseAndPatient
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throw IllegalArgumentException("The folder is Empty...")
	 */
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
