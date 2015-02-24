package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class Espresso extends Ingredients{
		
	public Espresso() {
		
	}
	
	public Espresso (boolean sugar) {
		coffeeGr = 7;
		waterMl = bulkMini - coffeeGr;
		this.sugar = sugar;
		
		if (sugar) {
			price = coffeePrice * coffeeGr + sugarPrice ;
		}else{
			price = coffeePrice * coffeeGr ;
		}
	}

	@Override
	public void printComposition() {
		System.out.print(" coffee -- " + coffeeGr  + " gr. " + "water -- " + waterMl + " ml.");
		if(this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" = Sugar NOT added");
		}
		
	}

	@Override
	public void printNameOfDrink() {
		System.out.println("Espresso ");
		
	}
}
