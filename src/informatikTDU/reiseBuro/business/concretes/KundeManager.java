package informatikTDU.reiseBuro.business.concretes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import informatikTDU.reiseBuro.business.abstracts.KundeService;
import informatikTDU.reiseBuro.business.abstracts.ReisePaketService;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.entities.Kunde;
import informatikTDU.reiseBuro.entities.ReisePaket;
import informatikTDU.reiseBuro.exceptions.KundeAlreadyExistsException;
import informatikTDU.reiseBuro.exceptions.KundeNotFoundException;
import informatikTDU.reiseBuro.exceptions.reisePaketExceptions.ReisePaketNotFoundException;

public class KundeManager implements KundeService {

	private ReisePaketService reisePaketService;
	private List<Kunde> kunden;

	private static int id = 1;

	public KundeManager(ReisePaketService reisePaketService) {
		kunden = new ArrayList<>() {
			{
				add(new Kunde("Ahmet", "EGIN", "1231231", LocalDate.of(2000, 01, 01),"Istanbul" , "123123", "abcdefg", "980098", 1283));
				add(new Kunde("Kaan", "KURT", "9879879", LocalDate.of(2000, 01, 01),"Istanbul" , "123123", "hışjklmn", "980098", 1283));
			}
		};
		
				
		this.reisePaketService = reisePaketService;
	}

	@Override
	public void kundeHinzufügen(Kunde kunde) {
		kunde.setId(id);

		existsKundeByIdentityNumber(kunde.getIdentityNumber());

		kunden.add(kunde);
		id++;
		System.out.println(Messages.GeneralPersonMessages.PERSON_ADDED);

	}

	@Override
	public void deleteByBuergerId(String buergerId) {
		Kunde tempKunde = getByIdentityNumber(buergerId);
		kunden.remove(tempKunde);
		System.out.println(Messages.GeneralPersonMessages.PERSON_DELETED);

	}

	@Override
	public void printAllKunden() {
		Consumer<Kunde> consumer = k -> System.out.println(k);
		kunden.stream().forEach(consumer);

	}

	@Override
	public Kunde getByIdentityNumber(String identityNumber) {
		Predicate<Kunde> predicate = k -> k.getIdentityNumber().equals(identityNumber);
//		Optional<Kunde> kunde = Arrays.stream(kunden, 0, n).filter(predicate).findFirst();

		return kunden.stream().filter(predicate).findFirst()
				.orElseThrow(() -> new KundeNotFoundException(Messages.KundeMessages.KUNDE_NOT_FOUND));

	}

	@Override
	public void reisepaketKaufen(String buergerId, String reisepaketId) {
		Kunde kunde = getByIdentityNumber(buergerId);
		ReisePaket reisePaket = reisePaketService.getById(reisepaketId);
		kunde.getReisepaketen().add(reisePaket);
		

	}

	@Override
	public void gekaufteReisepaketenListen(String buergerId) {
		Kunde kunde = getByIdentityNumber(buergerId);
		kunde.getReisepaketen().stream().forEach(System.out::println);

	}

	public void reisepaketZurückgeben(String buergerId, String reisepaketId) {
		Kunde kunde = getByIdentityNumber(buergerId);
		ReisePaket tempReisepaket = kunde.getReisepaketen().stream()
											.filter(item -> item.getId().equals(reisepaketId))
											.findFirst().orElseThrow(() -> new ReisePaketNotFoundException(Messages.ReisePaketMessages.REISEPAKET_NOT_FOUND));
			
		kunde.getReisepaketen().remove(tempReisepaket);
		System.out.println(Messages.KundeMessages.REISEPAKET_RETURNED);
		
	}

	private void existsKundeByIdentityNumber(String identityNumber) {
		Kunde tempKunde = new Kunde(identityNumber);
		Predicate<Kunde> condition = k -> k.equals(tempKunde);

		if (!kunden.stream().filter(condition).findFirst().isEmpty()) {
			throw new KundeAlreadyExistsException(Messages.KundeMessages.KUNDE_ALREADY_EXISTS);
		}

	}
}
