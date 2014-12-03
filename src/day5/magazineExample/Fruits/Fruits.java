package day5.magazineExample.Fruits;

public class Fruits {

	protected double price = 0;
	protected String color;
	protected boolean freshness = true;
	protected boolean formCircle;

	public Fruits() {
		price = 1;
	}

	public Fruits(String color, boolean freshness, boolean formCircle,
			double price) {

		this.color = color;
		this.freshness = freshness;
		this.formCircle = formCircle;
		this.price = price;

	}

	public void changeFreshnesOn() {
		if (freshness == false) {
			freshness = true;
		}
	}

	public void changeFreshnesOff() {
		freshness = false;
	}

	public double getPrice() {
		return price;

	}

	public String getColor() {
		return color;
	}

	public boolean isFreshness() {
		return freshness;
	}

	public boolean isFormCircle() {
		return formCircle;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isChanging() {
		return freshness;
	}

}
