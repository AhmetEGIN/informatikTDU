package informatikTDU.reiseBuro.business.abstracts;

import informatikTDU.reiseBuro.entities.Mitarbeiter;

public interface MitarbeiterService {

	void mitarbeiterHinzufügen(Mitarbeiter mitarbeiter);

	void printAllMitarbeiter();
	Mitarbeiter getByIdentityNumber(String identityNumber);

}
