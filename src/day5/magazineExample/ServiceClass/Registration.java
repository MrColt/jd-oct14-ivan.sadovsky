package day5.magazineExample.ServiceClass;

import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.Purchase.Purchase;
import day5.magazineExample.Customer.Customer;
import day5.magazineExample.ServiceClass.Result;

public class Registration {

	private Purchase[] purchase;
	private Result result;
	private Result[] results7Days;

	private int fruitsCounter;

	public Registration() {

		purchase = new Purchase[100];
		result = new Result();
		results7Days = new Result[7];
		
		fruitsCounter = 0;

	}

	public void newPurchase(Customer customer, Fruits fruits) {

		if ((purchase.length - 10) < fruitsCounter) {
			Purchase[] t = purchase;
			purchase = new Purchase[t.length + 100];
			System.arraycopy(t, 0, purchase, 0, t.length);

		} else {

			Purchase t = new Purchase(fruitsCounter, customer, fruits);
			purchase[fruitsCounter++] = t;
		}
		result.addTotal(1);
		result.addCost(fruits.getPrice());
	}
		

	public void transactionList() {

		System.out.println();
		if (purchase[0] == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Transaction today:");
			System.out.println();

			for (int i = 0; i < purchase.length; i++) {
				if (purchase[i] == null) {
					break;
				}
				System.out.println(purchase[i].getNumber() + ". "
						+ purchase[i].getCustomer() + " "
						+ purchase[i].getFruits() + " "
						+ purchase[i].getPrice() + " grn.");
			}
		}
	}

	public void resultToday() {

		System.out.println();
		System.out.println("Result of transaction today:");
		System.out.println();

		System.out.println("Fruits: " + result.getTotal() + ": "
				+ result.getCost() + " grn.");
	}

	public void results7Days() {

		System.out.println();
		System.out.println("Transactions for 7 days:");
		System.out.println();

		for (int i = 6; i >= 0; i--) {
			if (results7Days[i] == null) {
				break;
			}
			System.out.println(7 - i + ". " + results7Days[i].getTotal() + ": "
					+ results7Days[i].getCost() + " grn.");
		}
	}

	public void nextDay() {

		for (int i = 6; i > 0; i--) {
			results7Days[i] = results7Days[i - 1];
		}
		results7Days[0] = result;

		result = new Result();
		purchase = new Purchase[100];
		fruitsCounter = 0;

		System.out.println();
		System.out.println("Next day:");
		System.out.println();
	}

	public Purchase[] getTransactions() {
		return purchase;
	}

	public int getFruitsCounter() {
		return fruitsCounter;

	}
}
