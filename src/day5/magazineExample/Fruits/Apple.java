package day5.magazineExample.Fruits;

public class Apple extends Fruits {

	private String taste;
	private AppleBrand brand;
	
	public Apple() {

	}

	public Apple(String color, boolean freshness, boolean formCircle,
			double price) {

		super(color, freshness, formCircle, price);

		this.taste = taste;

	}

	public String getTaste() {
		return taste;
	}

	public AppleBrand getBrand() {
		return brand;
	}

}