package informatikTDU.vorlesung;

public class Mitarbeiter extends Person {

	private String personalNummer;

	public Mitarbeiter(String buergerId, String name, String nachname, String personalNummer) {
		super(buergerId, name, nachname);
		this.personalNummer = personalNummer;
	}
	public Mitarbeiter(String buergerId, String name, String nachname) {
		super(buergerId, name, nachname);
	}


	public Mitarbeiter(String burgerId) {
		super(burgerId);
	}

	public String getPersonalNummer() {
		return personalNummer;
	}

	public void setPersonalNummer(String personalNummer) {
		this.personalNummer = personalNummer;
	}

}
