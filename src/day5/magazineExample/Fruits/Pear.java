package day5.magazineExample.Fruits;

public class Pear extends Fruits {

	private String taste;
	private PearBrand brand;
	
	public Pear() {
		
	}

	public Pear(String color, boolean freshness, boolean formCircle, double price) {
		super(color, freshness, formCircle, price);

		this.taste = taste;

	}

	public String getTaste() {
		return taste;
	}

	public PearBrand getBrand() {
		return brand;
	}
	
	
}