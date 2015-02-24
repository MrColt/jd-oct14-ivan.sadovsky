package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class TeaBlack extends Ingredients{

	public TeaBlack() {
		
	}
	
	public TeaBlack(boolean sugar) {
		teaGr = 10;
		waterMl = bulk - teaGr;
		this.sugar = sugar;
		if (sugar) {
			price = teaGr * teaBlackPrice + sugarPrice ;
		}else{
			price = teaGr * teaBlackPrice ;
		}
	}

	@Override
	public void printComposition() {
		System.out.print(" teaBlack -- " + teaGr + " gr. " + "water -- " + waterMl + " ml.");
		if(this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" = Sugar NOT added");
		}
		
	}

	@Override
	public void printNameOfDrink() {
		System.out.println("TeaBlack ");
		
	}
}
