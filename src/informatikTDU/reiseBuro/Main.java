package informatikTDU.reiseBuro;

import java.time.LocalDate;
import java.util.Scanner;

import informatikTDU.reiseBuro.business.abstracts.KundeService;
import informatikTDU.reiseBuro.business.abstracts.MitarbeiterService;
import informatikTDU.reiseBuro.business.concretes.KundeManager;
import informatikTDU.reiseBuro.business.concretes.MitarbeiterManager;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.business.rules.Rules;
import informatikTDU.reiseBuro.entities.Kunde;
import informatikTDU.reiseBuro.entities.Mitarbeiter;

public class Main {

	public static void main(String[] args) {
		KundeService kundeService = new KundeManager();
		MitarbeiterService mitarbeiterService = new MitarbeiterManager();
		Rules rules = new Rules();

		Scanner scan = new Scanner(System.in);

		int operation = 0;
		while (operation != 100) {
			System.out.println(Messages.MAIN_MENU);
			operation = scan.nextInt();
			scan.nextLine();

			if (operation == 1) {

				try {
					System.out.println("Bitte geben Sie den BuergerId ein: ");
					String identityNumber = scan.nextLine();
					rules.checkBuergerID(identityNumber);
					
					System.out.println("Bitte geben Sie den Vornamen ein: ");
					String name = scan.nextLine();
					rules.checkLengthOfFirstName(name);
					rules.checkFirstName(name);

					System.out.println("Bitte geben Sie den Nachnamen ein: ");
					String nachname = scan.nextLine();
					rules.checkLengthOfLastName(nachname);
					rules.checkLastName(nachname);
					
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

					Mitarbeiter mitarbeiter = new Mitarbeiter(operation, name, nachname, identityNumber, birthDate,
							address, phoneNumber, insuranceNumber, jobPosition);
					
					mitarbeiterService.mitarbeiterHinzufügen(mitarbeiter);
					
					System.out.println(Messages.PERSON_ADDED);

				} catch (Exception e) {
					
					System.out.println(e.getLocalizedMessage());
					
				}

			} else if (operation == 2) {

				mitarbeiterService.printAllMitarbeiter();

			} else if (operation == 3) {
				try {
					System.out.println("Bitte geben Sie den BuergerId ein: ");
					String identityNumber = scan.nextLine();
					rules.checkBuergerID(identityNumber);

					System.out.println("Bitte geben Sie den Vornamen ein: ");
					String name = scan.nextLine();
					rules.checkFirstName(name);

					System.out.println("Bitte geben Sie den Nachnamen ein: ");
					String nachname = scan.nextLine();
					rules.checkLastName(nachname);

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

					Kunde kunde = new Kunde(operation, name, nachname, identityNumber, birthDate, address, phoneNumber,
							customerNumber, phoneNumber, creditRating);
					kundeService.kundeHinzufügen(kunde);
					
					System.out.println(Messages.PERSON_ADDED);

				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}

			} else if (operation == 4) {

				kundeService.printAllKunden();

			} else if (operation == 100) {
				System.out.println(Messages.PROGRAM_ENDED);

			}
		}

		scan.close();
	}

}
