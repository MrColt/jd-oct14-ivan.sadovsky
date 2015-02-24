package day5.magazineExample.ServiceClass;

import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.namesandtypes.Names;

public class FillFruitStorage {
	
	Shop shop;
	public FillFruitStorage(Shop shop) {
		this.shop = shop;
		
		shop.insertFruit(new Fruits(Names.APPLE, 7));
		shop.insertFruit(new Fruits(Names.BANANA, 5));
		shop.insertFruit(new Fruits(Names.MANDARIN, 3));
		shop.insertFruit(new Fruits(Names.ORANGE, 5));
		shop.insertFruit(new Fruits(Names.PEAR, 4));
		
		
		
		
		
		
	}

}
