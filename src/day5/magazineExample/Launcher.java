package day5.magazineExample;

import java.io.IOException;

import day5.magazineExample.ServiceClass.FillFruitStorage;
import day5.magazineExample.ServiceClass.Shop;

public class Launcher {

	public static void main(String[] args) throws IOException {
		Shop shop = new Shop ();
		
		FillFruitStorage fillFruitStorage = new FillFruitStorage(shop);
		
		UserInterface shopUI = new UserInterface(shop);
		
	}

}
