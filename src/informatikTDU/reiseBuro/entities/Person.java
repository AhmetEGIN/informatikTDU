package informatikTDU.reiseBuro.entities;

import java.time.LocalDate;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private LocalDate birthDate;
	private String address;
	private String phoneNumber;

	// columnDefinition = default value LocalDate.now();
	private LocalDate createdDate = LocalDate.now();

	// columnDefinition = default value true
	private boolean isActive = true;

	// columnDefinition = default value false
	private boolean isDeleted = false;

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public Person(int id, String firstName, String lastName, String identityNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
	}

	public Person(int id, String firstName, String lastName, String identityNumber, LocalDate birthDate, String address,
			String phoneNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
