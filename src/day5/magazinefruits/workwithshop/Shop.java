package day5.magazinefruits.workwithshop;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import day5.magazinefruits.customer.Customer;
import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.fruits.Fruit;
import day5.magazinefruits.service.AddingFruitToStorage;
import day5.magazinefruits.service.Purchase;
import day5.magazinefruits.workwithshop.mainclass.Storages;

public class Shop {
	static private Storages storages;
	Purchase purchase;
	Customer customer;
	Fruit fruit;

	public Shop() throws IOException {
		storages = new Storages();
	}

	public void insertFruit(Fruit fruit) {
		storages.insertFruit(fruit);
	}

	public void getPrice(Fruit fruit) {
		System.out.println("Price : " + fruit.getPrice());
	}

	public void makePurchase(String customerName, Denomination fruitName,
			int number) {
		int count = 0;
		System.out.println("We have " + storages.getFruitBalance(fruitName)
				+ " " + fruitName + " in storage.");
		if (number <= storages.getFruitBalance(fruitName)) {
			purchase = new Purchase(customerName, fruitName, number);
			for (int i = 0; i < number; i++) {
				Fruit tmpFruit = storages.getFruit(fruitName);
				if (tmpFruit != null) {
					purchase.addFruitToPurchase(tmpFruit);
					count++;
				}
			}
		} else
			System.out.println("There are only "
					+ storages.getFruitBalance(fruitName) + " " + fruitName
					+ " in storage");

		storages.insertPurchase(purchase);
		customer = new Customer();
		customer.setName(customerName);
		storages.insertCustomer(customer);
		fruit = new Fruit();

		System.out.println(customerName + " bought " + count + " " + fruitName
				+ "(s).");
		System.out.println("Price per 1 : " + fruit.getPrice()
				+ " Full count: " + fruit.getPrice() * count + " $");
		System.out.println("Balance changes. " + fruitName + "(s)"
				+ " left in storage : " + storages.getFruitBalance(fruitName));

	}

	public List<Customer> getCustomers() {
		List customers = new ArrayList();
		customers = storages.getCustomers();
		return customers;
	}

	public Denomination[] getCatalog() {
		int catalogLength = Denomination.values().length;
		Denomination[] catalog = new Denomination[catalogLength];
		for (int i = 0; i < Denomination.values().length; i++) {
			catalog[i] = Denomination.values()[i];
		}

		return catalog;
	}
}
