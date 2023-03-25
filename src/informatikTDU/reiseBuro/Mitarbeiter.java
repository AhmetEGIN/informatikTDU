package informatikTDU.reiseBuro;

import java.time.LocalDate;

public class Mitarbeiter extends Person {

	private String insuranceNumber;
	private String jobPosition;

	public Mitarbeiter(int id, String firstName, String lastName, String identityNumber, String insuranceNumber,
			String jobPosition) {

		super(id, firstName, lastName, identityNumber);
		this.insuranceNumber = insuranceNumber;
		this.jobPosition = jobPosition;
	}

	public Mitarbeiter(int id, String firstName, String lastName, String identityNumber, LocalDate birthDate,
			String address, String phoneNumber, String insuranceNumber, String jobPosition) {

		super(id, firstName, lastName, identityNumber, birthDate, address, phoneNumber);
		this.insuranceNumber = insuranceNumber;
		this.jobPosition = jobPosition;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

}
