package informatikTDU.reiseBuro.entities;

import java.time.LocalDate;
import java.util.Objects;

public class ReisePaket {

	private String id;

	private String destination;

	private LocalDate startDate;

	private LocalDate endDate;

	private int price;

	public ReisePaket() {
	}

	public ReisePaket(String id, String destination, LocalDate startDate, LocalDate endDate, int price) {
		this.id = id;
		this.destination = destination;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id + "\ndestination=" + destination + ", startDate=" + startDate + ", endDate=" + endDate
				+ "\nprice=" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReisePaket other = (ReisePaket) obj;
		return Objects.equals(id, other.id);
	}

}
