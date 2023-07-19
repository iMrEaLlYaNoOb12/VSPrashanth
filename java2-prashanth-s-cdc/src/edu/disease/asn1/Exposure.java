package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

public class Exposure {
	private UUID patientID;
	private LocalDateTime dateTime;
	private String exposureType;

	public Exposure(LocalDateTime dateTime, String exposureType) {
		super();
		this.dateTime = dateTime;
		this.exposureType = exposureType;
	}

	public UUID getPatientID() {
		return patientID;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getExposureType() {
		return exposureType;
	}

	public void setExposureType(String exposureType) {
		if (exposureType.equals("D") || exposureType.equals("I")) {
			this.exposureType = exposureType;
		} else {
			throw new IllegalArgumentException("Invalid Exposure type");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientID == null) ? 0 : patientID.hashCode());
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exposure [patientID=" + patientID + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}
	
	

}
