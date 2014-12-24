package day5.magazineExample.Fruits;

public class Mandarin extends Fruits {

	private String taste;
	private MandarinBrand brand;

	public Mandarin() {

	}

	public Mandarin(String color, boolean freshness, boolean formCircle,
			double price) {
		super(color, freshness, formCircle, price);

		this.taste = taste;

	}

	public String getTaste() {
		return taste;
	}

	public MandarinBrand getBrand() {
		return brand;
	}

}