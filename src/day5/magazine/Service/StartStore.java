package day5.magazine.Service;

import java.util.Date;
import day5.magazine.Guitar.GuitarBrand;
import day5.magazine.Guitar.GuitarType;
import day5.magazine.Purchase.Purchase;

public class StartStore {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Store store = new Store();	
		StoreGUI storeGUI = new StoreGUI(store);

//		store.printStore();
		store.printNumberOfGuitarType();
		store.printPrices();
//		store.printGuitarType(GuitarType.ACOUSTIC);	
		
//	    System.out.println(store.getGuitarNumberByModel(GuitarType.ELECTRIC.ordinal(), GuitarBrand.IBANEZ.ordinal(), "JFX500"));
//	    System.out.println(store.getGuitarIndexByModel(GuitarType.ELECTRIC.ordinal(), GuitarBrand.IBANEZ.ordinal(), "JFX500"));
		
//		new Purchase(store, GuitarType.BASS, GuitarBrand.GIBSON, "TE321", 1);					
//
//		new Purchase(store , GuitarType.ACOUSTIC, GuitarBrand.IBANEZ,
//				"JFX500", 1, "Igor Nagornov", new Date(114, 10, 23, 9, 10, 0)); //year-1900, month, day, hour, minute, second
//
//	    new Purchase(store, GuitarType.ACOUSTIC, GuitarBrand.JACKSON,
//				"PR981", 1, "Ivan Petrov", new Date(114, 10, 22, 16, 55, 0));		  	
	    
//	    new Purchase(store, GuitarType.ELECTRIC, GuitarBrand.IBANEZ, "JFX500", 3);		    	
	    
		store.printPurchases();		
//	    store.printPurchasesByDate(new Date(114, 10, 22));
	    store.printNumberOfPurchasesByWeek();
	    
		

	}
}