package informatikTDU.vorlesung;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Kunde[] kunden = new Kunde[100];
		Mitarbeiter[] mitarbeiter = new Mitarbeiter[100];
		int index = 10;

		Scanner scan = new Scanner(System.in);
		System.out.println("Wählen Sie eine Option aus: ");
		System.out.println("1- Neuer Kunde ");
		System.out.println("2- Neuer Mitarbeiter ");

		int wahl = scan.nextInt();
		scan.nextLine();
		if (wahl == 1) {
			System.out.println("Geben Sie die 7-stellige BuergerId ein:");
			String buergerId = scan.nextLine();

			for (int i = 0; i < buergerId.length(); i++) {
				if (Character.isDigit(buergerId.charAt(i))) {

				}

			}

			System.out.println("Geben Sie den Namen ein: ");
			String name = scan.nextLine();

			System.out.println("Geben Sie den Nachnamen ein: ");
			String nachname = scan.nextLine();

			Kunde kunde = new Kunde(buergerId, name, nachname);

			kunden[0] = kunde;
		}

//		System.out.println(kunden[30]);
		scan.close();

	}

}
