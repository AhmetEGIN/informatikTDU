package informatikTDU.reiseBuro.business.constants.systemMessages;

public class Messages {
	
	public static final String MAIN_MENU = "Welche Operation möchten Sie durchführen?\n"
			+ " 1- Mitarbeiter hinzufügen\n"
			+ " 2- Mitarbeiter auflisten\n"
			+ " 3- Mitarbeiter sucher\n"
			+ " 4- Kunde hinzufügen\n"
			+ " 5- Kunde auflisten\n"
			+ " 6- Kunde suchen\n"
			+ " 100- Programm beenden";
	
	public static final String PERSON_ADDED = "Benutzer wird erfolgreich hinzugefügt";
	public static final String BUERGER_ID_WRONG = "BuergerID ist falsch";
	public static final String PROGRAM_ENDED = "Programm beendet";

	public static final String FIRSTNAME_NOT_CORRECT = "Namen dürfen nur aus Buchstaben, Punkt-Zeichen und Leerzeichen bestehen";

	public static final String LASTNAME_NOT_CORRECT = "Nachnamen dürfen nur aus Buchstaben bestehen";

	public static final String FIRSTNAME_SIZE_ERROR = "Namen müssen eine Länge von mindestens 2 haben" ;

	public static final String LASTNAME_SIZE_ERROR = "Nachname müssen eine Länge von mindestens 2 haben";

	public static final String UNEXPECTED_VALUE = "Bitte wählen Sie eine der oben gelisteten Aktionen aus";

	public static final String KUNDE_NOT_FOUND = "Kunde mit dem gegebenen BuergerId konte nicht gefunden werden.";

	public static final String MITARBEITER_NOT_FOUND = "Mitarbeiter mit dem gegebenen BuergerId konte nicht gefunden werden.";
	
}		
