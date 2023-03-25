package informatikTDU.reiseBuro;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		KundeManager kundeManager = new KundeManager();
		MitarbeiterManager mitarbeiterManager = new MitarbeiterManager();

		Scanner scan = new Scanner(System.in);

		int operation = 0;
		while (operation != 100) {
			System.out.println(Messages.MAIN_MENU);
			operation = scan.nextInt();
			scan.nextLine();
			
			if (operation == 1) {
				System.out.println("Bitte Geben Sie den Vornamen ein: ");
				String name = scan.nextLine();

				System.out.println("Bitte Geben Sie den Nachnamen ein: ");
				String nachname = scan.nextLine();

				System.out.println("Bitte Geben Sie den BuergerId ein: ");
				String identityNumber = scan.nextLine();

				System.out.println("Bitte schreiben Sie ihr Geburtsdatum in Form YYYY-MM-DD ein:");
				String tempDate = scan.nextLine();

				LocalDate birthDate = LocalDate.of(Integer.parseInt(tempDate.split("-")[0]),
						Integer.parseInt(tempDate.split("-")[1]), Integer.parseInt(tempDate.split("-")[2]));

				System.out.println("Bitte Geben Sie ihre Address ein: ");
				String address = scan.nextLine();

				System.out.println("Bitte Geben Sie ihre Telefonnummer ein: ");
				String phoneNumber = scan.nextLine();

				System.out.println("Bitte Geben Sie den Versicherungsnummer ein: ");
				String insuranceNumber = scan.nextLine();

				System.out.println("Bitte Geben Sie den Erwerbsposition ein: ");
				String jobPosition = scan.nextLine();

				Mitarbeiter mitarbeiter = new Mitarbeiter(operation, name, nachname, identityNumber, birthDate, address,
						phoneNumber, insuranceNumber, jobPosition);
				mitarbeiterManager.mitarbeiterHinzufügen(mitarbeiter);
				System.out.println(Messages.PERSON_ADDED);

			} else if (operation == 2) {
				mitarbeiterManager.printAllMitarbeiter();
			} else if (operation == 3) {
				System.out.println("Bitte Geben Sie den Vornamen ein: ");
				String name = scan.nextLine();

				System.out.println("Bitte Geben Sie den Nachnamen ein: ");
				String nachname = scan.nextLine();

				System.out.println("Bitte Geben Sie den BuergerId ein: ");
				String identityNumber = scan.nextLine();

				System.out.println("Bitte schreiben Sie ihr Geburtsdatum in Form YYYY-MM-DD ein:");
				String tempDate = scan.nextLine();

				LocalDate birthDate = LocalDate.of(Integer.parseInt(tempDate.split("-")[0]),
						Integer.parseInt(tempDate.split("-")[1]), Integer.parseInt(tempDate.split("-")[2]));
				System.out.println("Bitte Geben Sie ihre Address ein: ");
				String address = scan.nextLine();

				System.out.println("Bitte Geben Sie ihre Telefonnummer ein: ");
				String phoneNumber = scan.nextLine();

				System.out.println("Bitte Geben Sie den Kundennummer ein: ");
				String customerNumber = scan.nextLine();

				System.out.println("Bitte Geben Sie den Kreditwürdigkeit ein: ");
				int creditRating = scan.nextInt();

				Kunde kunde = new Kunde(operation, name, nachname, identityNumber, birthDate, address, phoneNumber,
						customerNumber, phoneNumber, creditRating);
				kundeManager.kundeHinzufügen(kunde);
				System.out.println(Messages.PERSON_ADDED);

			} else if (operation == 4) {
				kundeManager.printAllKunden();
			}
			else if(operation == 100) {
				System.out.println(Messages.PROGRAM_ENDED);
				break;
			}

		}
		
		
		scan.close();
	}

}
