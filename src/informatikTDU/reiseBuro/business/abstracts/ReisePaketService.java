package informatikTDU.reiseBuro.business.abstracts;

import informatikTDU.reiseBuro.entities.ReisePaket;

public interface ReisePaketService {
	
	void reisepaketHinzufügen(ReisePaket reisePaket);
	void deleteById(String id);
	ReisePaket getById(String id);
	void printAllReisepaketen();
	void printAllReisePaketenFilterByDestination(String destination);
	void updatePrice(String id, int price);

}
