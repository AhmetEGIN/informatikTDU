package informatikTDU.reiseBuro;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import informatikTDU.reiseBuro.business.abstracts.KundeService;
import informatikTDU.reiseBuro.business.abstracts.MitarbeiterService;
import informatikTDU.reiseBuro.business.abstracts.ReisePaketService;
import informatikTDU.reiseBuro.business.concretes.KundeManager;
import informatikTDU.reiseBuro.business.concretes.MitarbeiterManager;
import informatikTDU.reiseBuro.business.concretes.ReisePaketManager;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.business.rules.PersonRules;
import informatikTDU.reiseBuro.entities.Kunde;
import informatikTDU.reiseBuro.entities.Mitarbeiter;
import informatikTDU.reiseBuro.entities.ReisePaket;
import informatikTDU.reiseBuro.exceptions.KundeNotFoundException;
import informatikTDU.reiseBuro.exceptions.reisePaketExceptions.ReisePaketNotFoundException;
import informatikTDU.vorlesung.Person;

public class Main {
	public void seek(List<Person> list) {

	}

	public static void main(String[] args) {
		Operations operations = new Operations();

		Scanner scan = new Scanner(System.in);


		int operation = 0;
		while (operation != 100) {

			System.out.println(Messages.MAIN_MENU);
			try {

				operation = scan.nextInt();
				scan.nextLine();

			} catch (Exception e) {

				scan.nextLine();
				System.out.println(e.getMessage());
			}

			switch (operation) {
			case 1 -> operations.mitarbeiterHinzufügen();
			case 2 -> operations.mitarbeiterLoschenMitBuergerId();
			case 3 -> operations.mitarbeiterAuflisten();
			case 4 -> operations.sucheNachMitarbeiterMitBuergerId();

			case 5 -> operations.kundeHinzufügen();
			case 6 -> operations.kundeLoschenMitBuergerId();
			case 7 -> operations.kundenAuflisten();
			case 8 -> operations.sucheNachKundeMitBuergerId();

			case 9 -> operations.reisepaketHinzufügen();
			case 10 -> operations.reisepaketLoschenMitId();
			case 11 -> operations.reisepaketenAuflisten();
			case 12 -> operations.reisepaketenAuflistenByDestination();
			case 13 -> operations.reisepaketPreisAndern();

			case 14 -> operations.reisepaketKaufen();
			case 15 -> operations.gekaufteReisepaketenListen();
			case 16 -> operations.reisepaketZurückgeben();

			case 100 -> System.out.println(Messages.PROGRAM_ENDED);

			default -> System.out.println(Messages.UNEXPECTED_VALUE);

			}
		}

		scan.close();
	}

}

class Operations {
	ReisePaketService reisePaketService = new ReisePaketManager();
	MitarbeiterService mitarbeiterService = new MitarbeiterManager();
	KundeService kundeService = new KundeManager(reisePaketService);

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

		} catch (RuntimeException e) {

			System.out.println(e.getLocalizedMessage());

		}
	}

	public void mitarbeiterLoschenMitBuergerId() {

		System.out.println("Bitte geben Sie BuergerId ein: ");
		String buergerId = scan.nextLine();

		mitarbeiterService.deleteByBuergerId(buergerId);

	}

	public void mitarbeiterAuflisten() {
		mitarbeiterService.printAllMitarbeiter();

	}

	public void sucheNachMitarbeiterMitBuergerId() {
		System.out.println("Bitte geben Sie Buerger Id ein");
		String buergerId = scan.nextLine();
		try {
			System.out.println(mitarbeiterService.getByIdentityNumber(buergerId));

		} catch (RuntimeException e) {
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
			scan.nextLine();

			Kunde kunde = new Kunde(name, nachname, identityNumber, birthDate, address, phoneNumber, customerNumber,
					phoneNumber, creditRating);
			kundeService.kundeHinzufügen(kunde);

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	public void kundeLoschenMitBuergerId() {

		System.out.println("Bitte geben Sie BuergerId ein: ");
		String buergerId = scan.nextLine();

		kundeService.deleteByBuergerId(buergerId);

	}

	public void kundenAuflisten() {
		kundeService.printAllKunden();
	}

	public void sucheNachKundeMitBuergerId() {
		System.out.println("Bitte geben Sie Buerger Id ein");

		String buergerId = scan.nextLine();
		try {
			System.out.println(kundeService.getByIdentityNumber(buergerId));

		} catch (KundeNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	// ## Reisepaket operationen##

	public void reisepaketHinzufügen() {
		try {
			System.out.println("Bitte geben Sie paket Id ein: ");
			String id = scan.nextLine();

			System.out.println("Bitte geben Sie Destination ein: ");
			String destination = scan.nextLine();

			System.out.println("Bitte geben Sie Anfangsdatum in Form YYYY-MM-DD");
			String tempStartDate = scan.nextLine();

			LocalDate startDate = LocalDate.of(Integer.parseInt(tempStartDate.split("-")[0]),
					Integer.parseInt(tempStartDate.split("-")[1]), Integer.parseInt(tempStartDate.split("-")[2]));

			System.out.println("Bitte geben Sie Endedatum in Form YYYY-MM-DD");
			String tempEndDate = scan.nextLine();

			LocalDate endDate = LocalDate.of(Integer.parseInt(tempEndDate.split("-")[0]),
					Integer.parseInt(tempEndDate.split("-")[1]), Integer.parseInt(tempEndDate.split("-")[2]));

			System.out.println("Bittge geben Sie Preis ein: ");
			int price = scan.nextInt();
			scan.nextLine();

			reisePaketService.reisepaketHinzufügen(new ReisePaket(id, destination, startDate, endDate, price));

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());

		}

	}

	public void reisepaketLoschenMitId() {
		System.out.println("Bitte geben Sie Id ein: ");
		String id = scan.nextLine();
		reisePaketService.deleteById(id);

	}

	public void reisepaketenAuflisten() {
		reisePaketService.printAllReisepaketen();

	}

	public void reisepaketenAuflistenByDestination() {
		System.out.println("Bitte geben Sie Destination ein: ");
		String destination = scan.nextLine();

		reisePaketService.printAllReisePaketenFilterByDestination(destination);

	}

	public void reisepaketPreisAndern() {
		System.out.println("Geben Sie id ein: ");
		String id = scan.nextLine();
		System.out.println("Geben Sie neue Preis ein: ");
		int price = scan.nextInt();
		scan.nextLine();
		reisePaketService.updatePrice(id, price);

	}

	public void reisepaketKaufen() {
		try {

			System.out.println("Bitte geben Sie Buerger Id ein: ");
			String buergerId = scan.nextLine();

			System.out.println("Geben Sie Reisepaket id ein:");
			String id = scan.nextLine();
			kundeService.reisepaketKaufen(buergerId, id);
			
			

		} catch (KundeNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void reisepaketZurückgeben() {
		try {
			System.out.println("Bitte geben Sie Buerger Id ein");
			String buergerId = scan.nextLine();

			System.out.println("Geben Sie Reisepaket id ein: ");
			String id = scan.nextLine();
			kundeService.reisepaketZurückgeben(buergerId, id);

		} catch (ReisePaketNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void gekaufteReisepaketenListen() {
		try {
			System.out.println("Bitte geben Sie Buerger Id ein");
			String buergerId = scan.nextLine();

			kundeService.gekaufteReisepaketenListen(buergerId);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
