package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class Latte extends Ingredients {

	public Latte() {

	}

	public Latte(boolean sugar) {
		coffeeGr = 15;
		milkMl = 140;
		waterMl = bulk - coffeeGr - milkMl;
		if (sugar) {
			price = coffeePrice * coffeeGr + milkPrice * milkMl + sugarPrice;
		} else {
			price = coffeePrice * coffeeGr + milkPrice * milkMl;
		}
	}

	@Override
	public void printComposition() {
		System.out.print(" coffee -- " + coffeeGr + " gr. " + "water -- "
				+ waterMl + " ml. " + "milk --" + milkMl + " ml.");
		if (this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" = Sugar NOT added");
		}

	}

	@Override
	public void printNameOfDrink() {
		System.out.println("Latte ");

	}
}
