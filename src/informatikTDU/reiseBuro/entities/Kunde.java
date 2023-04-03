package informatikTDU.reiseBuro.entities;

import java.time.LocalDate;

public class Kunde extends Person {

	private String customerNumber;
	private String cardNumber;
	private int creditRating;

	public Kunde(int id, String firstName, String lastName, String identityNumber, String customerNumber,
			String cardNumber, int creditRating) {

		super(id, firstName, lastName, identityNumber);

		this.customerNumber = customerNumber;
		this.cardNumber = cardNumber;
		this.creditRating = creditRating;
	}

	public Kunde(int id, String firstName, String lastName, String identityNumber, LocalDate birthDate, String address,
			String phoneNumber, String customerNumber, String cardNumber, int creditRating) {

		super(id, firstName, lastName, identityNumber, birthDate, address, phoneNumber);

		this.customerNumber = customerNumber;
		this.cardNumber = cardNumber;
		this.creditRating = creditRating;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}

}
