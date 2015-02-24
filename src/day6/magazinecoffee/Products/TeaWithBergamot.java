package day6.magazinecoffee.Products;

import day6.magazinecoffee.Ingredients;

public class TeaWithBergamot extends Ingredients{

	public TeaWithBergamot() {
		
	}
	
	public TeaWithBergamot(boolean sugar) {
		teaBergamotGr = 10;
		waterMl = bulk - teaBergamotGr;
		this.sugar = sugar;
		if (sugar) {
			price = teaBergamotGr * teaBergamotPrice + sugarPrice ;
		}else{
			price = teaBergamotGr * teaBergamotPrice ;
		}
	}
	
	@Override
	public void printComposition() {
		System.out.print(" teaWithBergamot -- " + teaBergamotGr + " gr. "+ "water -- " + waterMl + " ml.");
		if(this.sugar) {
			System.out.println(" + Sugar");
		} else {
			System.out.println(" = Sugar NOT added");
		}
		
	}
		

	@Override
	public void printNameOfDrink() {
		System.out.println("TeaWithBergamot");
		
	}

}
