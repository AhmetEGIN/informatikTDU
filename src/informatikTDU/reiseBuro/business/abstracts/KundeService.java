package informatikTDU.reiseBuro.business.abstracts;

import informatikTDU.reiseBuro.entities.Kunde;

public interface KundeService {
	
	void kundeHinzufügen(Kunde kunde);
	void deleteByBuergerId(String buergerId);

	void printAllKunden();
	Kunde getByIdentityNumber(String identityNumber);
	void reisepaketKaufen(String buergerId, String reisepaketId);
	void gekaufteReisepaketenListen(String buergerId);
	void reisepaketZurückgeben(String buergerId, String reisepaketId);
	
}
