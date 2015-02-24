package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class Americano extends Ingredients{
		
	public Americano() {
		
	}
	
	public Americano(boolean sugar) {
		coffeeGr = 7;
		waterMl = bulk -coffeeGr;
		this.sugar = sugar;
		
		if(sugar) {
			price = coffeePrice * coffeeGr + sugarPrice;
		} else {
			price = coffeePrice * coffeeGr;
		}
		
	}

	@Override
	public void printComposition() {
		System.out.print(" coffee -- " + coffeeGr + " gr." + " water -- " + waterMl + " ml.");
		if(this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" = Sugar NOT added");
		}
		
	}

	@Override
	public void printNameOfDrink() {
		System.out.println("Americano ");
		
	}
}
	
	
