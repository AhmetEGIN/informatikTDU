package informatikTDU.reiseBuro.business.concretes;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

import informatikTDU.reiseBuro.business.abstracts.KundeService;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.entities.Kunde;

public class KundeManager implements KundeService {

	private Kunde[] kunden;

	private int n = 0;
	private static int id = 1;

	public KundeManager() {
		kunden = new Kunde[100];
	}

	@Override
	public void kundeHinzufügen(Kunde kunde) {
		kunde.setId(id);
		kunden[n] = kunde;
		id++;
		n++;

	}

	@Override
	public void printAllKunden() {
		Consumer<Kunde> consumer = k -> System.out.println(k);
		Arrays.stream(kunden, 0, n).forEach(consumer);

	}

	@Override
	public Kunde getByIdentityNumber(String identityNumber) {
		Predicate<Kunde> predicate = k -> k.getIdentityNumber().equals(identityNumber);
		return Arrays.stream(kunden, 0, n).filter(predicate).findFirst()
				.orElseThrow(() -> new NullPointerException(Messages.KUNDE_NOT_FOUND));

	}

}
