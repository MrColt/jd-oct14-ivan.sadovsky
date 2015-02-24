package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class TeaGreen extends Ingredients{

	public TeaGreen() {
		
	}
	
	public TeaGreen(boolean sugar) {
		teaGreenGr = 10;
		waterMl = bulk - teaGreenGr;
		this.sugar = sugar;
		if (sugar) {
			price = teaGreenGr * teaGreenPrice + sugarPrice ;
		}else{
			price = teaGreenGr * teaGreenPrice ;
		}
	}
	
	@Override
	public void printComposition() {
		System.out.print(" teaGreen -- " + teaGreenGr + " gr. "+ "water -- " + waterMl + " ml.");
		if(this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" = Sugar NOT added");
		}
		
	}

	@Override
	public void printNameOfDrink() {
		System.out.println("TeaGreen");
		
	}

}
