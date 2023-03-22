package informatikTDU.vorlesung;

public class Kunde extends Person {

	private String kundenNummer;

	public Kunde(String buergerId, String name, String nachname, String kundenNummer) {
		super(buergerId, name, nachname);
		this.kundenNummer = kundenNummer;
	}

	public Kunde(String buergerId, String name, String nachname) {
		super(buergerId, name, nachname);
	}

	public Kunde(String burgerId) {
		super(burgerId);
	}

	public String getKundenNummer() {
		return kundenNummer;
	}

	public void setKundenNummer(String kundenNummer) {
		this.kundenNummer = kundenNummer;
	}

}
