package informatikTDU.reiseBuro.business.abstracts;

import informatikTDU.reiseBuro.entities.Kunde;

public interface KundeService {
	
	void kundeHinzufügen(Kunde kunde);
	void printAllKunden();
	Kunde getByIdentityNumber(String identityNumber);
	
}
