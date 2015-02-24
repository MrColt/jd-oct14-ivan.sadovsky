package day5.magazinefruits.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.fruits.Fruit;

public class Purchase {
	private int quantityOfFruits;
	private String customerName;
	private int purchaseTime;
	List <Fruit> purchase = new ArrayList();

	public Purchase(String customerName, Denomination name, int number) {
		this.customerName = customerName;
		this.quantityOfFruits = number;
	}

	public void addFruitToPurchase(Fruit fruit) {
        purchase.add(fruit);
	}

	public String getCustomer() {
		return customerName;
	}

	public int getPurchaseTime() {
		return purchaseTime;
	}

	public List getPurchase() {
		return purchase;
	}
	
	public int getNumberOfFruits(){
		return quantityOfFruits;
	}
}
