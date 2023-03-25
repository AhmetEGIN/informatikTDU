package informatikTDU.reiseBuro;

public class KundeManager {
	private Kunde[] kunden;
	private int n = 0;

	public KundeManager() {
		kunden = new Kunde[100];
	}

	public void kundeHinzufügen(Kunde kunde) {
		kunden[n] = kunde;
		n++;
	}

	public void printAllKunden() {

		for (int i = 0; i < n; i++) {
			System.out.println("Vor- und Nachname: " + kunden[i].getFirstName() + " " + kunden[i].getLastName());
			System.out.println("BürgerID: " + kunden[i].getIdentityNumber());
			System.out.println("Kundennummer: " + kunden[i].getCustomerNumber());
			
		}
	}

}
