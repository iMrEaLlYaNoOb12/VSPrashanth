package edu.disease.asn3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@SuppressWarnings("serial")
public class Exposure implements Serializable {
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;

	public Exposure(UUID patientId) {
		super();
		this.patientId = patientId;
	}

	public UUID getPatientId() {
		return patientId;
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exposure [patientID=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}
