package informatikTDU.reiseBuro.business.concretes;

import informatikTDU.reiseBuro.business.abstracts.MitarbeiterService;
import informatikTDU.reiseBuro.entities.Mitarbeiter;

public class MitarbeiterManager implements MitarbeiterService {
	private Mitarbeiter[] mitarbeiter;
	private int n = 0;

	public MitarbeiterManager() {
		mitarbeiter = new Mitarbeiter[100];
	}

	@Override
	public void mitarbeiterHinzufügen(Mitarbeiter m) {
		mitarbeiter[n] = m;
		n++;
	}

	@Override
	public void printAllMitarbeiter() {

		for (int i = 0; i < n; i++) {
			System.out.println("Vor- und Nachname: " + mitarbeiter[i].getFirstName() + " " + mitarbeiter[i].getLastName());
			System.out.println("BürgerID: " + mitarbeiter[i].getIdentityNumber());
			System.out.println("Kundennummer: " + mitarbeiter[i].getInsuranceNumber());
			
		}
	}

}
