package informatikTDU.reiseBuro;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Kunde k1 = new Kunde(1, "Ahmet", "EGİN", "123123", LocalDate.of(2000, 01, 01), "Istanbul", "123123", "12314141", "812730123", 3000);
		Mitarbeiter m1 = new Mitarbeiter(1, "Kağan", "KURT", "113123", "819240193");
		System.out.println(k1.getCardNumber());
		k1.setCreditRating(2800);
		System.out.println(k1.getFirstName() + " " + k1.getLastName());
		System.out.println(m1.getFirstName() + " " + m1.getLastName());
		m1.setPhoneNumber("01111111");
		System.out.println("Phone nummer von m1: " + m1.getPhoneNumber());
		
	}

}
