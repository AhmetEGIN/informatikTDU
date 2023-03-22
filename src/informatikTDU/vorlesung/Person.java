package informatikTDU.vorlesung;

public class Person {
	private String name;
	private String nachname;
	private String buergerId;
	private int alter;

	public Person(String buergerId) {
		this.buergerId = buergerId;
	}

	public Person(String name, String nachname, String buergerId) {
		this.name = name;
		this.nachname = nachname;
		this.buergerId = buergerId;
	}

	public Person(String name, String nachname, String buergerId, int alter) {
		this.name = name;
		this.nachname = nachname;
		this.buergerId = buergerId;
		this.alter = alter;
	}

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

}
