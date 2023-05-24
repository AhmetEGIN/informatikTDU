package informatikTDU.vorlesung;

public abstract class Person  extends Object{
	private String name;
	private String nachname;
	private String buergerId;
	private int alter;
	private String happyTravelsID;  
	// ID von Kunde soll mit k anfangen und dann eine Nummer
	// ID von Mitarbeiter soll mit m anfangen und dann eine Nummer

	public Person(String buergerId) {
		this.buergerId = buergerId;
	}

	public Person(String name, String nachname, String buergerId) {
		this(buergerId);  // Aufruf einer internen Konstrukturfunktion
		this.name = name;
		this.nachname = nachname;
	}

	public Person(String name, String nachname, String buergerId, int alter) {
		this(name, nachname, buergerId);
		this.alter = alter;
	}
	
	abstract public void setHappyTravelsID(String id);
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getBuergerId() {
		return buergerId;
	}

	public void setBurgerId(String buergerId) {
		this.buergerId = buergerId;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public void irgendwas() {
		System.out.println("Person");
	}
	
	
}
