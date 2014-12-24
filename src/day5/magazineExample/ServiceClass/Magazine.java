package day5.magazineExample.ServiceClass;

import day5.magazineExample.Fruits.Apple;
import day5.magazineExample.Fruits.Banana;
import day5.magazineExample.Fruits.Mandarin;
import day5.magazineExample.Fruits.Orange;
import day5.magazineExample.Fruits.Pear;
import day5.magazineExample.Fruits.Fruits;
import day5.magazineExample.Customer.Customer;

public class Magazine {

	private Apple[] apples;
	private Banana[] bananas;
	private Mandarin[] mandarins;
	private Orange[] oranges;
	private Pear[] pears;

	Registration registration;

	public Magazine() {
		apples = new Apple[100];
		bananas = new Banana[100];
		mandarins = new Mandarin[100];
		oranges = new Orange[100];
		pears = new Pear[100];

		registration = new Registration();

	}

	public void addFruits(Fruits[] fruits) {

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == null) {
				break;
			}

			addFruit(fruits[i]);
		}
	}

	public void addFruit(Fruits fruits) {

		if (fruits instanceof Apple) {
			addToMagazine(fruits, apples);
		} else if (fruits instanceof Banana) {
			addToMagazine(fruits, bananas);
		} else if (fruits instanceof Mandarin) {
			addToMagazine(fruits, mandarins);
		} else if (fruits instanceof Orange) {
			addToMagazine(fruits, oranges);
		} else if (fruits instanceof Pear) {
			addToMagazine(fruits, pears);
		} else {
			System.out.println("This device isn't for this shop.");
		}
	}

	private void addToMagazine(Fruits fruits, Fruits[] magazineFruits) {

		int nNew;

		fruits.changeFreshnesOn();
		if (fruits.isChanging() == false) {
			System.out.println("This is not accepted");

		} else {
			fruits.changeFreshnesOff();

			if (magazineFruits[magazineFruits.length - 1] != null) {
				Fruits[] t = magazineFruits;

				if (fruits instanceof Apple) {
					magazineFruits = new Apple[t.length + 100];
				} else if (fruits instanceof Banana) {
					magazineFruits = new Banana[t.length + 100];
				} else if (fruits instanceof Mandarin) {
					magazineFruits = new Mandarin[t.length + 100];
				} else if (fruits instanceof Orange) {
					magazineFruits = new Orange[t.length + 100];
				} else {
					magazineFruits = new Pear[t.length + 100];
				}
				System.arraycopy(t, 0, magazineFruits, 0, t.length);
				nNew = t.length;

			} else {
				for (nNew = 0; nNew < magazineFruits.length; nNew++) {
					if (magazineFruits[nNew] == null) {
						break;
					}
				}
			}
		}

	}
	public void fullTotalFruits() {
		
		System.out.println();
		System.out.println("Total of the present fruits:");
		System.out.println();
		
		System.out.println("Apples: " + linkTheFruits(apples));
		System.out.println("Bananas: " + linkTheFruits(bananas));
		System.out.println("Mandarins: " + linkTheFruits(mandarins));
		System.out.println("Oranges: " + linkTheFruits(oranges));
		System.out.println("Pears: " + linkTheFruits(pears));
		
	}
	
	private int linkTheFruits(Fruits[] fruits) {

		if (fruits[0] == null) {
			return 0;
		}

		int i = 0;
		for (i = 0; i < fruits.length; i++) {
			if (fruits[i] == null) {
				return i;
			}
		}
		return i;
	}

	public void catalogFull() {

		System.out.println();
		System.out.println("Apples:");
		System.out.println();
		printFruits(apples);
		System.out.println();

		System.out.println("Bananas:");
		System.out.println();
		printFruits(bananas);
		System.out.println();

		System.out.println("Mandarins:");
		System.out.println();
		printFruits(mandarins);
		System.out.println();

		System.out.println("Oranges:");
		System.out.println();
		printFruits(oranges);
		System.out.println();

		System.out.println("Pears:");
		System.out.println();
		printFruits(pears);
	}

	public Fruits[] catalogByCategory(int type) {

		System.out.println();

		Fruits[] fruits;

		if (type == 0) {
			System.out.println("Apples:");
			System.out.println();
			fruits = apples;
		} else if (type == 1) {
			System.out.println("Bananas:");
			System.out.println();
			fruits = bananas;
		} else if (type == 2) {
			System.out.println("Mandarins:");
			System.out.println();
			fruits = mandarins;
		} else if (type == 3) {
			System.out.println("Oranges:");
			System.out.println();
			fruits = oranges;
		} else if (type == 4) {
			System.out.println("Pears:");
			System.out.println();
			fruits = pears;
		} else {
			System.out.println("Wrong option.");
			return null;
		}

		int total = printFruits(fruits);

		if (total == 0) {
			System.out.println("Empty.");
			return null;
		} else if (total == fruits.length) {
			return fruits;
		}
		// else {
		Fruits[] t = new Fruits[total];
		System.arraycopy(fruits, 0, t, 0, total);
		return t;
		// }
	}

	private int printFruits(Fruits[] fruits) {

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == null) {
				return i;
			}

			System.out.print(i + 1 + ". ");
			printFruit(fruits[i]);
		}
		return fruits.length;
	}

	private void printFruit(Fruits fruits) {

		System.out.print(": " + fruits.getColor() + ", ");

		if (fruits instanceof Apple) {
			Apple a = (Apple) fruits;
			System.out.print(a.getTaste());
		}

		else if (fruits instanceof Banana) {
			Banana b = (Banana) fruits;
			System.out.print(b.getTaste());
		}

		// System.out.println(".");

		else if (fruits instanceof Mandarin) {
			Mandarin m = (Mandarin) fruits;
			System.out.print(m.getTaste());
		}

		else if (fruits instanceof Orange) {
			Orange o = (Orange) fruits;
			System.out.print(o.getTaste());
		}

		else if (fruits instanceof Pear) {
			Pear p = (Pear) fruits;
			System.out.print(p.getTaste());
		}
		// System.out.println(".");

		System.out.println(", " + fruits.getPrice() + " grn.");

	}

	public void buy(Customer customer, Fruits fruits) {
		
		Fruits[] magazineFruits;
		
        if (fruits instanceof Apple) {
			magazineFruits = apples;
		}
		else if (fruits instanceof Banana) {
			magazineFruits = bananas;
		}
		else if (fruits instanceof Mandarin) {
			magazineFruits = mandarins;
		}
		else if (fruits instanceof Orange) {
			magazineFruits = oranges;
		}
		else {
			magazineFruits = pears;
		}
		
		for (int i = 0; i < magazineFruits.length; i++) {
			if (magazineFruits[i] == fruits) {
				int nDelete = 0;
				
				if (i == magazineFruits.length - 1 || magazineFruits[i + 1] == null) {
					nDelete = i;
				}
				else for (int j = i; j < magazineFruits.length - 1; j++) {
					if (magazineFruits[j + 1] == null) {
						nDelete = j;
						break;
					}
					
					magazineFruits[i] = magazineFruits[i+1];
				}
				
				magazineFruits[nDelete] = null;
				
				break;
			}
		}
		
		registration.newPurchase(customer, fruits);
		
		System.out.println();
		System.out.print(customer.getFirstname() + " " + customer.getLastname() + " bought ");
		shortPrintFruits(fruits);


	}

	private void shortPrintFruits(Fruits fruits) {

		System.out.print(fruits.getColor());

		if (fruits != null) {
			System.out.print(": " + fruits.getPrice() + " grn.");
		}

		System.out.println("Sorry.Can't do this.");

	}

	public void purchaseList() {
		registration.transactionList();
	}

	public void resultToday() {
		registration.resultToday();
	}

	public void results7Days() {
		registration.results7Days();
	}

	public void nextDay() {
		registration.nextDay();
	}

	public Apple[] getApples() {
		return apples;
	}

	public Banana[] getBananas() {
		return bananas;
	}

	public Mandarin[] getMandarins() {
		return mandarins;
	}

	public Orange[] getOranges() {
		return oranges;
	}

	public Pear[] getPears() {
		return pears;
	}

	public Registration getRegistration() {
		return registration;
	}
}
