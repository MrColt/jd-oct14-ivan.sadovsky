package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class Capuchino extends Ingredients {

	public Capuchino() {

	}

	public Capuchino(boolean sugar) {
		coffeeGr = 10;
		milkMl = 70;
		waterMl = bulk - coffeeGr - milkMl;
		this.sugar = sugar;
		if (sugar) {
			price = coffeePrice * coffeeGr + milkMl * milkPrice + sugarPrice;
		} else {
			price = coffeePrice * coffeeGr + milkMl * milkPrice;
		}
	}

	@Override
	public void printComposition() {
		System.out.print(" coffee -- " + coffeeGr + " gr. " + "water -- "
				+ waterMl + " ml. " + "milk --" + milkMl + " ml.");
		if (this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" Sugar NOT added");
		}

	}

	@Override
	public void printNameOfDrink() {
		System.out.println("Capuchino ");

	}

}
