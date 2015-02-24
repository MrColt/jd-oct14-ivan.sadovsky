package day5.magazinefruits.workwithshop.mainclass;

import java.util.ArrayList;
import java.util.List;

import day5.magazinefruits.customer.Customer;
import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.fruits.Fruit;
import day5.magazinefruits.service.Purchase;

public class Storages {

	private CustomerStorage customerStorage;
	private PurchaseStorage purchaseStorage;
	private FruitsStorage fruitStorage;
	Fruit fruit;

	public Storages() {
		fruitStorage = new FruitsStorage();
		customerStorage = new CustomerStorage();
		purchaseStorage = new PurchaseStorage();
		fruit = new Fruit();
	}

	public List<Customer> getCustomers() {
		return customerStorage.getItems();
	}

	public void insertCustomer(Customer customer) {
		customerStorage.add(customer);
	}

	public Fruit getFruit(Denomination name) {

		return fruitStorage.getFruit(name);
	}

	public int getFruitBalance(Denomination name) {
		return fruitStorage.getFruitBalance(name);
	}

	public void insertPurchase(Purchase prchs) {

		purchaseStorage.add(prchs);
	}

	public List<Customer> getAllCustomers() {

		return customerStorage.getItems();
	}

	public void insertFruit(Fruit fruit) {

		fruitStorage.add(fruit);
	}

	class SimpleStorage<T> {
		List<T> items = new ArrayList<>();

		public void SimpleStorage() {

		}

		public void add(T item) {
			items.add(item);
		}

		public List<T> getItems() {
			return new ArrayList<>(items);
		}

		public T get(int index) {
			return items.get(index);
		}
	}

	class PurchaseStorage<T extends Purchase> extends SimpleStorage {

	}

	class CustomerStorage<T extends Customer> extends SimpleStorage {
		@Override
		public void add(Object item) {
			int marker = 0;
			for (Object customer : items) {
				if (item.equals(customer)) {
					marker++;
				}
			}
			if (marker == 0) {
				super.add(item);
			}
		}
	}

	class FruitsStorage<T extends Fruit> extends SimpleStorage {
		Fruit fruit = null;

		public Fruit getFruit(Denomination name) {

			if (getFruitBalance(name) <= 0) {
				System.out
						.println("This type of fruit is absent on on our storage.");
				fruit = null;
			} else

				for (int i = 0; i < items.size(); i++) {
					fruit = (Fruit) items.get(i);
					if (fruit.getName().getId() == name.getId()) {
						items.remove(i);
						break;
					}
				}
			return fruit;
		}

		public int getFruitBalance(Denomination name) {
			int balance = 0;

			for (Object fruit : items) {
				if (((Fruit) fruit).getName().getId() == name.getId()) {
					balance++;
				}

			}

			return balance;
		}

	}
}
