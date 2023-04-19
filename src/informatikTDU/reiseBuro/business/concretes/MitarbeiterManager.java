package informatikTDU.reiseBuro.business.concretes;

import java.util.Arrays;

import informatikTDU.reiseBuro.business.abstracts.MitarbeiterService;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.entities.Mitarbeiter;

public class MitarbeiterManager implements MitarbeiterService {

	private Mitarbeiter[] mitarbeiter;

	private int n = 0;

	public MitarbeiterManager() {
		mitarbeiter = new Mitarbeiter[100];
	}

	@Override
	public void mitarbeiterHinzufügen(Mitarbeiter m) {
		mitarbeiter[n] = m;
		n++;

	}

	@Override
	public void printAllMitarbeiter() {
		Arrays.stream(mitarbeiter, 0, n).forEach(m -> System.out.println(m));

	}

	@Override
	public Mitarbeiter getByIdentityNumber(String identityNumber) {

		return Arrays.stream(mitarbeiter, 0, n).filter(m -> m.getIdentityNumber().equals(identityNumber)).findFirst()
				.orElseThrow(() -> new NullPointerException(Messages.MITARBEITER_NOT_FOUND));
		
	}
	


}
