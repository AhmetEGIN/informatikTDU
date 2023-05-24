package informatikTDU.reiseBuro.business.concretes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import informatikTDU.reiseBuro.business.abstracts.ReisePaketService;
import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.entities.ReisePaket;
import informatikTDU.reiseBuro.exceptions.reisePaketExceptions.ReisePaketNotFoundException;

public class ReisePaketManager implements ReisePaketService {

	private List<ReisePaket> reisePaketen;

	public ReisePaketManager() {
		this.reisePaketen = new ArrayList<ReisePaket>() {
			{
				add(new ReisePaket("1283", "Antalya", LocalDate.of(2023, 06, 01), LocalDate.of(2023, 06, 10), 1000));
			}
		};
		
	}

	@Override
	public void reisepaketHinzufügen(ReisePaket reisePaket) {
		reisePaketen.add(reisePaket);
		System.out.println(Messages.ReisePaketMessages.REISEPAKET_ADDED);

	}

	@Override
	public void deleteById(String id) {
		ReisePaket tempReisePaket = getById(id);
		reisePaketen.remove(tempReisePaket);

	}

	@Override
	public void printAllReisepaketen() {
		reisePaketen.stream().forEach(System.out::println);

	}

	@Override
	public ReisePaket getById(String id) {
		
		
		ReisePaket reisepaket = reisePaketen.stream().filter(reisePaket -> reisePaket.getId().equals(id)).findFirst()
				.orElseThrow(() -> new ReisePaketNotFoundException(Messages.ReisePaketMessages.REISEPAKET_NOT_FOUND));
		
		return reisepaket;
	}

	@Override
	public void printAllReisePaketenFilterByDestination(String destination) {
		getAllReisePaketByDestination(destination).stream().forEach(System.out::println);

	}

	@Override
	public void updatePrice(String id, int price) {
		ReisePaket tempReisePaket = getById(id);
		tempReisePaket.setPrice(price);

		System.out.println(Messages.ReisePaketMessages.PRICE_UPDATED);

	}

	private List<ReisePaket> getAllReisePaketByDestination(String destination) {
		Predicate<ReisePaket> condition = reisePaket -> reisePaket.getDestination().equalsIgnoreCase(destination);

		return reisePaketen.stream().filter(condition).collect(Collectors.toList());
	}

}
