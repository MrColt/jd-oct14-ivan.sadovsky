package day6.magazinecoffe;

import day6.magazinecoffe.service.Menu;
import day6.magazinecoffe.service.Prices;

public class Demo {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Prices prices = new Prices();
		
//		menu.recipeAmericano();
		menu.showMenu();
	}

}
