package day6.magazinecoffee;

import day6.magazinecoffee.Products.Americano;
import day6.magazinecoffee.Products.Capuchino;
import day6.magazinecoffee.Products.Espresso;
import day6.magazinecoffee.Products.Latte;
import day6.magazinecoffee.Products.TeaBlack;
import day6.magazinecoffee.Products.TeaGreen;
import day6.magazinecoffee.Products.TeaWithBergamot;

public class Demo {
	
	public static void main(String[] args) {

		Americano americano = new Americano(true);
		Capuchino capuchino = new Capuchino(true);
		Espresso espresso = new Espresso(false);
		Latte latte = new Latte(false);
		TeaBlack teaBlack = new TeaBlack(true);
		TeaGreen teaGreen = new TeaGreen(true);
		TeaWithBergamot teaBergamot = new TeaWithBergamot(false);
		
		printInfo(americano);
		printInfo(capuchino);
		printInfo(espresso);
		printInfo(latte);
		printInfo(teaBlack);
		printInfo(teaGreen);
		printInfo(teaBergamot);
		
	}
	
	public static void printInfo(Ingredients i) {
		i.printNameOfDrink();
		System.out.print("Ingredients: ");
		i.printComposition();
		System.out.println("Price - " + i.getPrice() + " grn.");
		System.out.println();
	}

}
