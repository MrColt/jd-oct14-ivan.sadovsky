package day6.magazinecoffee;

public abstract class Ingredients {
	
	protected int bulk = 250;
	protected int bulkMini = 100;
	protected int waterMl;
	protected int coffeeGr;
	protected int milkMl;
	protected int teaGr;
	protected int teaGreenGr;
	protected int teaBergamotGr;
	protected boolean sugar;
	protected double coffeePrice = 2d;
	protected double teaBlackPrice = 1d;
	protected double teaGreenPrice = 1d;
	protected double sugarPrice = 2d;
	protected double milkPrice = 0.05d;
	protected double teaBergamotPrice = 2d;
	protected double price;

	public Ingredients() {

	}

	public double getPrice() {
		return price;
	}
	
	public abstract void printComposition();
	public abstract void printNameOfDrink();
}