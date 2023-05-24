package informatikTDU.reiseBuro.business.constants.systemMessages;

public class Messages {

	public static final String MAIN_MENU = "Welche Operation möchten Sie durchführen?\n"
			+ "1- Mitarbeiter hinzufügen\n" 
			+ "2- Mitarbeiter löschen\n" 
			+ "3- Alle Mitarbeiter auflisten\n"
			+ "4- Mitarbeiter suchen\n" 
			+ "5- Kunde hinzufügen\n" 
			+ "6- Kunde löschen\n" 
			+ "7- Kunden auflisten\n"
			+ "8- Kunde suchen\n" 
			+ "9- Reisepaket hinzufügen\n" 
			+ "10- Reisepaket löschen\n" 
			+ "11- Reisepaketen auflisten\n"
			+ "12- Reisepaketen auflisten in einem Destination\n" 
			+ "13- Der Preis eines Reisepaket ändern\n"
			+ "14- Reisepaket kaufen\n"
			+ "15- Gekaufte Reisepaketen auflisten\n"
			+ "16- Reisepaket zurückgeben\n"
			
			+ " 100- Programm beenden";

	public static final String PROGRAM_ENDED = "Programm beendet";
	public static final String UNEXPECTED_VALUE = "Bitte wählen Sie eine der oben genannten Optionen";
	

	public static class GeneralPersonMessages {
		public static final String PERSON_ADDED = "Benutzer wird erfolgreich hinzugefügt";
		public static final String PERSON_DELETED = "Benutzer wird erfolgreich gelöscht";

	}

	public static class MitarbeiterMessages {
		public static final String MITARBEITER_NOT_FOUND = "Mitarbeiter mit dem gegebenen BuergerId konnte nicht gefunden werden.";

		public static final String MITARBEITER_ALREADY_EXISTS = "Ein Mitarbeiter mit gleichem BuergerId wurde schon hinzugefügt.";

	}

	public static class KundeMessages {
		public static final String KUNDE_NOT_FOUND = "Kunde mit dem gegebenen BuergerId konnte nicht gefunden werden.";

		public static final String KUNDE_ALREADY_EXISTS = "Ein Kunde mit gleichem BuergerId wurde schon hinzugefügt.";

		public static final String REISEPAKET_RETURNED = "Reisepaket wird zurückgegeben.";

	}

	public static class ReisePaketMessages {
		public static final String REISEPAKET_ADDED = "Reisepaket hinzugefügt";
		
		public static final String REISEPAKET_DELETED = "Reisepaket gelöscht";

		public static final String REISEPAKET_NOT_FOUND = "Reisepaket mit dem gegebenen Id nicht gefunden";

		public static final String PRICE_UPDATED = "Der Preis von Reisepaket aktualisiert";

	}

	public static class FormatExceptionMessages {

		public static final String BUERGER_ID_WRONG = "BuergerID ist falsch";

		public static final String FIRSTNAME_NOT_CORRECT = "Namen dürfen nur aus Buchstaben, Punkt-Zeichen und Leerzeichen bestehen";

		public static final String LASTNAME_NOT_CORRECT = "Nachnamen dürfen nur aus Buchstaben bestehen";

		public static final String FIRSTNAME_SIZE_ERROR = "Namen müssen eine Länge von mindestens 2 haben";

		public static final String LASTNAME_SIZE_ERROR = "Nachname müssen eine Länge von mindestens 2 haben";

		public static final String UNEXPECTED_VALUE = "Bitte wählen Sie eine der oben gelisteten Aktionen aus";

	}

}
