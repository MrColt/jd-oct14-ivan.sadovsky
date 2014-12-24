package day5.magazineExample.Fruits;

public class Banana extends Fruits {

	private String taste;
	private BananaBrand brand;

	public Banana() {

	}

	public Banana(String color, boolean freshness, boolean formCircle,
			double price) {
		super(color, freshness, formCircle, price);

		this.taste = taste;

	}

	public String getTaste() {
		return taste;
	}

	public BananaBrand getBrand() {
		return brand;
	}

}