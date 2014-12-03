package day5.magazineExample.ServiceClass;

import day5.magazineExample.Customer.Customer;
import day5.magazineExample.Fruits.Apple;
import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.Fruits.Banana;
import day5.magazineExample.Fruits.Mandarin;
import day5.magazineExample.Fruits.Orange;
import day5.magazineExample.Fruits.Pear;

public class Demo {

	public static void main(String [] args) throws Exception {
		
		Magazine magazine = new Magazine();
		addToMagazine(magazine);
//		buy(magazine);
//		magazine.resultToday();

	
		
	}
	
	public static void addToMagazine(Magazine magazine) {
		magazine.addFruit(new Apple("Red", true, true, 5));
		magazine.addFruit(new Banana("Yellow", true, false, 6));
		magazine.addFruit(new Mandarin("Orange", true, true, 10));
		magazine.addFruit(new Orange("Orange", true, true, 4));
		magazine.addFruit(new Pear("Yellow", true, false, 6));
		
	}
	
	public static void buy(Magazine magazine) {
		magazine.fullTotalFruits();
		System.out.println();
		Customer customer = new Customer ("Ivan", "Ivanov");
		Fruits[]fruits = magazine.catalogByCategory(0);
		magazine.buy(customer, fruits[0]);
		fruits = magazine.catalogByCategory(2);
		magazine.buy(customer, fruits[2]);

		
		
	}
	
}
