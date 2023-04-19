package informatikTDU.reiseBuro;

import java.time.LocalDate;
import java.util.Scanner;

import informatikTDU.reiseBuro.business.abstracts.KundeService;
import informatikTDU.reiseBuro.business.abstracts.MitarbeiterService;
import informatikTDU.reiseBuro.business.concretes.KundeManager;
import informatikTDU.reiseBuro.business.concretes.MitarbeiterManager;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.business.rules.PersonRules;
import informatikTDU.reiseBuro.entities.Kunde;
import informatikTDU.reiseBuro.entities.Mitarbeiter;

public class Main {

	public static void main(String[] args) {
		Operations operations = new Operations();

		Scanner scan = new Scanner(System.in);
		
		int operation = 0;
		while (operation != 100) {
			
			System.out.println(Messages.MAIN_MENU);
			operation = scan.nextInt();
			scan.nextLine();

			switch (operation) {
			case 1 -> operations.mitarbeiterHinzufügen();
			case 2 -> operations.mitarbeiterAuflisten();
			case 3 -> operations.sucheNachMitarbeiterMitBuergerId();
			case 4 -> operations.kundeHinzufügen();
			case 5 -> operations.kundenAuflisten();
			case 6 -> operations.sucheNachKundeMitBuergerId();

			case 100 -> System.out.println(Messages.PROGRAM_ENDED);

			default -> System.out.println(Messages.UNEXPECTED_VALUE);

			}
		}

		scan.close();
	}

}

class Operations {
	KundeService kundeService = new KundeManager();
	MitarbeiterService mitarbeiterService = new MitarbeiterManager();

	Scanner scan = new Scanner(System.in);
	
	// Operationen für Mitarbeiter
	
	public void mitarbeiterHinzufügen() {
		try {
			System.out.println("Bitte geben Sie den BuergerId ein: ");
			String identityNumber = scan.nextLine();
			PersonRules.checkBuergerID(identityNumber);

			System.out.println("Bitte geben Sie den Vornamen ein: ");
			String name = scan.nextLine();
			PersonRules.checkLengthOfFirstName(name);
			PersonRules.checkFirstName(name);

			System.out.println("Bitte geben Sie den Nachnamen ein: ");
			String nachname = scan.nextLine();
			PersonRules.checkLengthOfLastName(nachname);
			PersonRules.checkLastName(nachname);

			System.out.println("Bitte schreiben Sie ihr Geburtsdatum in Form YYYY-MM-DD: ");
			String tempDate = scan.nextLine();
			LocalDate birthDate = LocalDate.of(Integer.parseInt(tempDate.split("-")[0]),
					Integer.parseInt(tempDate.split("-")[1]), Integer.parseInt(tempDate.split("-")[2]));

			System.out.println("Bitte geben Sie ihre Address ein: ");
			String address = scan.nextLine();

			System.out.println("Bitte geben Sie ihre Telefonnummer ein: ");
			String phoneNumber = scan.nextLine();

			System.out.println("Bitte geben Sie den Versicherungsnummer ein: ");
			String insuranceNumber = scan.nextLine();

			System.out.println("Bitte geben Sie den Erwerbsposition ein: ");
			String jobPosition = scan.nextLine();

			Mitarbeiter mitarbeiter = new Mitarbeiter(name, nachname, identityNumber, birthDate, address, phoneNumber,
					insuranceNumber, jobPosition);

			mitarbeiterService.mitarbeiterHinzufügen(mitarbeiter);

			System.out.println(Messages.PERSON_ADDED);

		} catch (Exception e) {

			System.out.println(e.getLocalizedMessage());

		}
	}

	public void mitarbeiterAuflisten() {
		mitarbeiterService.printAllMitarbeiter();

	}
	
	public void sucheNachMitarbeiterMitBuergerId() {
		String buergerId = scan.nextLine();
		try {
			System.out.println(mitarbeiterService.getByIdentityNumber(buergerId));
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// Operationen für Kunde

	public void kundeHinzufügen() {
		try {
			System.out.println("Bitte geben Sie den BuergerId ein: ");
			String identityNumber = scan.nextLine();
			PersonRules.checkBuergerID(identityNumber);

			System.out.println("Bitte geben Sie den Vornamen ein: ");
			String name = scan.nextLine();
			PersonRules.checkFirstName(name);

			System.out.println("Bitte geben Sie den Nachnamen ein: ");
			String nachname = scan.nextLine();
			PersonRules.checkLastName(nachname);

			System.out.println("Bitte schreiben Sie ihr Geburtsdatum in Form YYYY-MM-DD ein:");
			String tempDate = scan.nextLine();

			LocalDate birthDate = LocalDate.of(Integer.parseInt(tempDate.split("-")[0]),
					Integer.parseInt(tempDate.split("-")[1]), Integer.parseInt(tempDate.split("-")[2]));

			System.out.println("Bitte geben Sie ihre Address ein: ");
			String address = scan.nextLine();

			System.out.println("Bitte geben Sie ihre Telefonnummer ein: ");
			String phoneNumber = scan.nextLine();

			System.out.println("Bitte geben Sie den Kundennummer ein: ");
			String customerNumber = scan.nextLine();

			System.out.println("Bitte geben Sie den Kreditwürdigkeit ein: ");
			int creditRating = scan.nextInt();

			Kunde kunde = new Kunde(name, nachname, identityNumber, birthDate, address, phoneNumber, customerNumber,
					phoneNumber, creditRating);
			kundeService.kundeHinzufügen(kunde);

			System.out.println(Messages.PERSON_ADDED);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void kundenAuflisten() {
		kundeService.printAllKunden();
	}
	
	public void sucheNachKundeMitBuergerId() {
		String buergerId = scan.nextLine();
		try {
			kundeService.getByIdentityNumber(buergerId);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}


