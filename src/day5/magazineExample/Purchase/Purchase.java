package day5.magazineExample.Purchase;

import day5.magazineExample.Customer.Customer;
import day5.magazineExample.Fruits.Fruits;

public class Purchase {

	int number;
	String customer;
	String fruits;
	double price;
	
	public Purchase(int number, Customer customer, Fruits fruits) {
		
		this.number = number;
		this.customer = customer.getFirstname() + " " + customer.getLastname();
		this.fruits = fruits.getColor() + " " + fruits.isFreshness();
		this.price = fruits.getPrice();
	}
	
	public int getNumber() {
		return number;
	}

	public String getCustomer() {
		return customer;
	}

	public String getFruits() {
		return fruits;
	}

	public double getPrice() {
		return price;
	}

}


