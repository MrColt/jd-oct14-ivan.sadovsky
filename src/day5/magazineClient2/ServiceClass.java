package day5.magazineClient2;

public class ServiceClass {

	static Store store = new Store();

	static Customer cus1 = new Customer("Client1");
	static Customer cus2 = new Customer("Client2");
	static Customer cus3 = new Customer("Client3");
	
	public static void sellPrices() {
		System.out.println("Prices on fruits");
		System.out.println("________________________________________");
		System.out.println(FruitsEnum.APPLE + " cost " + store.getFrPrice(0) +" grn");
		System.out.println(FruitsEnum.BANANA + " cost " + store.getFrPrice(1)+ " grn");
		System.out.println(FruitsEnum.MANDARIN + " cost " + store.getFrPrice(2)+ " grn");
		System.out.println(FruitsEnum.ORANGE + " cost " + store.getFrPrice(3)+ " grn");
		System.out.println(FruitsEnum.PEAR + " cost " + store.getFrPrice(4)+ " grn");
		System.out.println();
		
	}

	public void leftOnStorage() {
		System.out.println("We have");
		System.out.println("________________________________________");
		System.out.println(store.getFrStorage(0) + " " + FruitsEnum.APPLE);
		System.out.println(store.getFrStorage(1) + " " + FruitsEnum.BANANA);
		System.out.println(store.getFrStorage(2) + " " + FruitsEnum.MANDARIN);
		System.out.println(store.getFrStorage(3) + " " + FruitsEnum.ORANGE);
		System.out.println(store.getFrStorage(4) + " " + FruitsEnum.PEAR);
		System.out.println();
	}

	public void oneDay() {
		System.out.println("Last sales per 1 day");
		System.out.println("________________________________________");
		System.out.println(FruitsEnum.APPLE + " " + store.getFrSale(0));
		System.out.println(FruitsEnum.BANANA + " " + store.getFrSale(1));
		System.out.println(FruitsEnum.MANDARIN + " " + store.getFrSale(2));
		System.out.println(FruitsEnum.ORANGE + " " + store.getFrSale(3));
		System.out.println(FruitsEnum.PEAR + " " + store.getFrSale(4));
		System.out.println();

	}

	public void sevenDays() {
		System.out.println("Last sales per 7 days");
		System.out.println("________________________________________");
		System.out.println(DaysOfWeek.MONDAY + " " + store.getFrSales7(0));
		System.out.println(DaysOfWeek.TUESDAY + " " + store.getFrSales7(1));
		System.out.println(DaysOfWeek.WEDNESDAY + " " + store.getFrSales7(2));
		System.out.println(DaysOfWeek.THURSDAY + " " + store.getFrSales7(3));
		System.out.println(DaysOfWeek.FRIDAY + " " + store.getFrSales7(4));
		System.out.println(DaysOfWeek.SATURDAY + " " + store.getFrSales7(5));
		System.out.println(DaysOfWeek.SUNDAY + " " + store.getFrSales7(6));
		System.out.println();
	}

	public void showAllInfo() {
		System.out.println("Info about Transaction");
		System.out.println("________________________________________");
		System.out.println("#1 " + cus1.getName()+ " " + FruitsEnum.APPLE + " "
				+ store.getFrPrice(0) + " " + (store.getFrStorage(0)));
		System.out.println("#2 " + cus2.getName() + " " + FruitsEnum.BANANA + " "
				+ store.getFrPrice(1) + " " + (store.getFrStorage(1)));
		System.out.println("#3 " + cus3.getName() + " " + FruitsEnum.MANDARIN + " "
				+ store.getFrPrice(2) + " " + (store.getFrStorage(2)));

	}

}
