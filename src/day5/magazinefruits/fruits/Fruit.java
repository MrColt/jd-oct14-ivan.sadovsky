package day5.magazinefruits.fruits;

public class Fruit {
	
	private Denomination name;

	private double price;

	public Fruit() {

	}

	public Fruit(Denomination name, double price) {
		this.name = name;
		if (name.getId() == 0) {
			this.name = Denomination.APPLE;
		} else if (name.getId() == 1) {
			this.name = Denomination.ORANGE;
		} else if (name.getId() == 2) {
			this.name = Denomination.PEAR;
		} else if (name.getId() == 3) {
			this.name = Denomination.MANDARIN;
		} else
			System.out.println("This fruit doesn't exist in store");

		this.price = price;
	}

	public Denomination getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
