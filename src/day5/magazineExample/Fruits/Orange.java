package day5.magazineExample.Fruits;

public class Orange extends Fruits {

	private String taste;
	private OrangeBrand brand;
	
	public Orange() {
	}

	public Orange(String color, boolean freshness,
			boolean formCircle, double price) {
		super(color, freshness, formCircle, price);

		this.taste = taste;

	}

	public String getTaste() {
		return taste;
	}

	public OrangeBrand getBrand() {
		return brand;
	}
	
	

}