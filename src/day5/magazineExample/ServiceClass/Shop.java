package day5.magazineExample.ServiceClass;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import day5.magazineExample.Customer.Customer;
import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.Purchase.Purchase;
import day5.magazineExample.namesandtypes.Names;
import day6.fields.Storage;

public class Shop {
	static private Storages storage;
	Purchase purchase;
	Customer customer;
	
	public Shop() throws IOException {
		storage = new Storages();
	}

	public void insertFruit(Fruits fruit) {
		storage.insertFruit(fruit);
	}

	public void makePurchase(String customerName, Names fruitName, int number) {
		int count = 0;
		System.out.println("The balance of " + fruitName + " in storage is: "
				+ storage.getFruitBalance(fruitName));
		if (number <= storage.getFruitBalance(fruitName)) {
			purchase = new Purchase(customerName, fruitName, number);
			for (int i = 0; i < number; i++) {
				Fruits tmpFruit = storage.getFruit(fruitName);
				if (tmpFruit != null) {
					purchase.addFruitToPurchase(tmpFruit);
					count++;
				}
			}

		} else
			System.out.println("There are only "
					+ storage.getFruitBalance(fruitName) + " " + fruitName
					+ " in storage, please, "
					+ "enter new Quantity - less then "
					+ storage.getFruitBalance(fruitName));
		storage.insertPurchase(purchase);
		customer = new Customer();
		customer.setCustomerName(customerName);
		storage.insertCustomer(customer);
		System.out.println(customerName + " bought " + count + " " + fruitName
				+ "s.");
		System.out.println("New balance of " + fruitName + " in storage is: "
				+ storage.getFruitBalance(fruitName));
	}
	
	public List <Customer> getCustomers() {
		List customers = new ArrayList();
		customers = storage.getCustomers();
		return customers;
	}
	
	public Names[] getCatalog() {
		int catalogLength = Names.values().length;
		Names[] catalog = new Names[catalogLength];
		for (int i = 0; i < Names.values().length; i++) {
			catalog[i] = Names.values()[i];
		}
		return catalog;
 	}
}
