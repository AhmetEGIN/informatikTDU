package informatikTDU.reiseBuro.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import informatikTDU.reiseBuro.business.abstracts.MitarbeiterService;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.entities.Mitarbeiter;

public class MitarbeiterManager implements MitarbeiterService {

	private List<Mitarbeiter> mitarbeiter;
	private static int id = 1;


	public MitarbeiterManager() {
		mitarbeiter = new ArrayList<>();
	}

	@Override
	public void mitarbeiterHinzufügen(Mitarbeiter m) {
		existsMitarbeiterByIdentityNumber(m.getIdentityNumber());
		m.setId(id);
		id ++;
		mitarbeiter.add(m);
		
		
		System.out.println(Messages.GeneralPersonMessages.PERSON_ADDED);

	}
	@Override
	public void deleteByBuergerId(String buergerId) {
		
		Mitarbeiter tempMitarbeiter = getByIdentityNumber(buergerId);	
		mitarbeiter.remove(tempMitarbeiter);
		System.out.println(Messages.GeneralPersonMessages.PERSON_DELETED);
		
	}

	@Override
	public void printAllMitarbeiter() {

		mitarbeiter.stream().forEach(System.out::println);

	}

	@Override
	public Mitarbeiter getByIdentityNumber(String identityNumber) {

		return mitarbeiter.stream().filter(m -> m.getIdentityNumber().equals(identityNumber)).findFirst()
				.orElseThrow(() -> new RuntimeException(Messages.MitarbeiterMessages.MITARBEITER_NOT_FOUND));

	}

	private void existsMitarbeiterByIdentityNumber(String identityNumber) {
		Mitarbeiter tempMitarbeiter = new Mitarbeiter(identityNumber);
		Predicate<Mitarbeiter> condition = m -> m.equals(tempMitarbeiter);
 

		if (!mitarbeiter.stream().filter(condition).findFirst().isEmpty()) {
			throw new RuntimeException(Messages.MitarbeiterMessages.MITARBEITER_ALREADY_EXISTS);
		}

	}

		

}
