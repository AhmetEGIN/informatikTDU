package informatikTDU.reiseBuro;

import java.time.LocalDate;

public class Mitarbeiter {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private LocalDate birthDate;
	private String address;
	private String phoneNumber;
	private String insuranceNumber;
	private String jobPosition;

	public Mitarbeiter() {

	}

	public Mitarbeiter(int id, String firstName, String lastName, String identityNumber, LocalDate birthDate,
			String address, String phoneNumber, String insuranceNumber, String jobPosition) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.insuranceNumber = insuranceNumber;
		this.jobPosition = jobPosition;
	}

	public Mitarbeiter(int id, String firstName, String lastName, String identityNumber, String insuranceNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.insuranceNumber = insuranceNumber;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
