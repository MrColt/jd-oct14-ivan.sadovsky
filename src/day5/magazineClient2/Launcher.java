package day5.magazineClient2;

public class Launcher {

	public static void main (String [] args) {
		
		ServiceClass service = new ServiceClass();
		
		service.sellPrices();
		service.leftOnStorage();
		service.oneDay();
		service.sevenDays();
		service.showAllInfo();
		
	}
	
	
}
