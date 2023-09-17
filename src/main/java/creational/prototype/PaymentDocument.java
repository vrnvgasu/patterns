package creational.prototype;

import java.util.Objects;

public class PaymentDocument implements Prototype {

	private String to;

	private String from;

	private Integer count;

	public PaymentDocument() {
	}

	public PaymentDocument(PaymentDocument document) {
		to = document.to;
		from = document.from;
		count = document.count;
	}

	@Override
	public Prototype clone() {
		return new PaymentDocument(this);
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentDocument that = (PaymentDocument) o;
		return Objects.equals(to, that.to) && Objects.equals(from, that.from) && Objects.equals(
				count,
				that.count
		);
	}

	@Override
	public int hashCode() {
		return Objects.hash(to, from, count);
	}

}
