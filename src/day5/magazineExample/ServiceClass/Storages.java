package day5.magazineExample.ServiceClass;

import java.util.ArrayList;
import java.util.List;

import day5.magazineExample.Customer.Customer;
import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.Purchase.Purchase;
import day5.magazineExample.namesandtypes.Names;

public class Storages {
	
	private CustomerStorage customerStorage;
	private PurchaseStorage purchaseStorage;
	private FruitsStorage fruitsStorage;
	
	public Storages() {
		customerStorage = new CustomerStorage();
		purchaseStorage = new PurchaseStorage();
		fruitsStorage = new FruitsStorage();
	}
	
	public List <Customer> getCustomers() {
		return customerStorage.getItems();
	}
	
	public void insertCustomer(Customer customer) {
		customerStorage.add(customer);
	}
	
	public Fruits getFruit (Names name) {
		return fruitsStorage.getFruit(name);
	}
	
	public int getFruitBalance(Names name) {
		return fruitsStorage.getFruitBalance(name);
	}
	
	public void insertPurchase (Purchase purchase) {
		purchaseStorage.add(purchase);
	}
	
	public List<Customer> getAllCustomers() {
		return customerStorage.getItems();
	}
	
	public void insertFruit (Fruits fruit) {
		fruitsStorage.add(fruit);
	}

	class SimpleStorage<I> {
		List<I> items = new ArrayList<>();

		public void SimpleStorage() {

		}

		public void add(I item) {
			items.add(item);
		}

		public List<I> getItems() {
			return new ArrayList<>(items);
		}

		public I get(int index) {
			return items.get(index);
		}
	}

	class PurchaseStorage<I extends Purchase> extends SimpleStorage {

	}

	class CustomerStorage<I extends Customer> extends SimpleStorage {
		@Override
		public void add(Object item) {
			int point = 0;
			for (Object customer : items) {
				if (item.equals(customer)) {
					point ++;
				}
			}
			if (point == 0) {
				super.add(item);
			}
		}
	}

	class FruitsStorage<I extends Fruits> extends SimpleStorage {
		Fruits fruits = null;

		public int getFruitBalance(Names name) {
			int balance = 0;
			for (Object fruit : items) {
				if (((Fruits) fruit).getName().getId() == name.getId()) {
					balance ++;
				}
			}
			return balance;
		}

		public Fruits getFruit(Names name) {
			if (getFruitBalance(name) <= 0) {
				System.out.println("Sorry, dont have this fruit");
				fruits = null;
			} else
				for (int i = 0; i < items.size(); i++) {
					fruits = (Fruits) items.get(i);
					if (fruits.getName().getId() == name.getId()) {
						items.remove(i);
						break;
					}
				}
			return fruits;
		}
	}

}
