package day5.magazineExample.Purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import day5.magazineExample.Customer.Customer;
import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.namesandtypes.Names;

public class Purchase {

	private int numberOfFruits;
	private String customerName;
	private int timeOfPurchase;
	List <Fruits> purchase = new ArrayList();
	
	public Purchase (String customerName, Names name, int number) {
		this.customerName = customerName;
		Random r = new Random();
		this.timeOfPurchase = r.nextInt(6);
		this.numberOfFruits = number;
	}
	
	public void addFruitToPurchase (Fruits fruit) {
		purchase.add(fruit);
	}
	
	public String getCustomer(){
		return customerName;
	}
	
	public int getPurchaseTime() {
		return timeOfPurchase;
	}
	
	public List getPurchase() {
		return purchase;
	}
	
	public int getNumberOfFruits() {
		return numberOfFruits;
	}
}


