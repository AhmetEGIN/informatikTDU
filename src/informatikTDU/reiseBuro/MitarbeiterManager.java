package informatikTDU.reiseBuro;

public class MitarbeiterManager {
	private Mitarbeiter[] mitarbeiter;
	private int n = 0;

	public MitarbeiterManager() {
		mitarbeiter = new Mitarbeiter[100];
	}

	public void mitarbeiterHinzufügen(Mitarbeiter m) {
		mitarbeiter[n] = m;
		n++;
	}

	public void printAllMitarbeiter() {

		for (int i = 0; i < n; i++) {
			System.out.println("Vor- und Nachname: " + mitarbeiter[i].getFirstName() + " " + mitarbeiter[i].getLastName());
			System.out.println("BürgerID: " + mitarbeiter[i].getIdentityNumber());
			System.out.println("Kundennummer: " + mitarbeiter[i].getInsuranceNumber());
			
		}
	}

}
