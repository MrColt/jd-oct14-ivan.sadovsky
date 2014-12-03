package day5.magazineClient2;

public class Store {

	// APPLE, BANANA, MANDARIN, ORANGE, PEAR

	// Quantity on Store
	private int[] frStorage = { 100, 220, 501, 155, 200 };

	// Price for Fruits
	private double[] frPrice = {5.4, 6, 3.3, 7, 10};

	// Sales Today
	private int[] frSale = { 1, 2, 3, 1, 10 };

	// Sales 7 day
	private int[] frSales7 = { 20, 13, 16, 75, 12, 4, 32 };

	public int getFrStorage(int i) {
		return frStorage[i];
	}

	public double getFrPrice(int i) {
		return frPrice[i];
	}

	public int getFrSale(int i) {
		return frSale[i];
	}

	public int getFrSales7(int i) {
		return frSales7[i];
	}
}
