package informatikTDU.reiseBuro.business.concretes;

import java.util.Arrays;

import informatikTDU.reiseBuro.business.abstracts.KundeService;
import informatikTDU.reiseBuro.entities.Kunde;

public class KundeManager implements KundeService {
	private Kunde[] kunden;
	private int n = 0;

	public KundeManager() {
		kunden = new Kunde[100];
	}

	
	@Override
	public void kundeHinzufügen(Kunde kunde) {
		kunden[n] = kunde;
		n++;
	}

	@Override
	public void printAllKunden() {

//		for (int i = 0; i < n; i++) {
//			System.out.println("Vor- und Nachname: " + kunden[i].getFirstName() + " " + kunden[i].getLastName());
//			System.out.println("BürgerID: " + kunden[i].getIdentityNumber());
//			System.out.println("Kundennummer: " + kunden[i].getCustomerNumber());
//
//		}
		
		Arrays.stream(kunden, 0, n).forEach(item -> System.out.println(item.getAddress()));
		
		
	}

}
