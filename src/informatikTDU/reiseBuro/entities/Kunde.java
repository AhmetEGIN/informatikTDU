package informatikTDU.reiseBuro.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kunde extends Person {

	private String customerNumber;
	private String cardNumber;
	private int creditRating;
	
	private List<ReisePaket> reisepaketen = new ArrayList<ReisePaket>();
	


	public Kunde(String identityNumber) {
		super(identityNumber);
	}
	
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

	public Kunde(String firstName, String lastName, String identityNumber, LocalDate birthDate, String address,
			String phoneNumber, String customerNumber, String cardNumber, int creditRating) {
		
		super(firstName, lastName, identityNumber, birthDate, address, phoneNumber);
		
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
	
	public List<ReisePaket> getReisepaketen() {
		return reisepaketen;
	}

	public void setReisepaketen(List<ReisePaket> reisepaketen) {
		this.reisepaketen = reisepaketen;
	}
	
	@Override
	public String toString() {
		return "Vor- und Nachname: " + getFirstName() + " " + getLastName() +"\n" +
				"BuergerId: " + getIdentityNumber() + " Kunden Nummer: " + getCustomerNumber();
	}
	



}
