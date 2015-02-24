package day5.magazinefruits.service;

import java.io.IOException;

import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.fruits.Fruit;
import day5.magazinefruits.workwithshop.Shop;

public class AddingFruitToStorage {
	Shop shop;

	public AddingFruitToStorage(Shop shop) throws IOException {

		this.shop = shop;

		Fruit fruit = new Fruit();

		addMoreThanOne(Denomination.APPLE, 10);

		shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
		shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
		shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
		shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
		shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));

		shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
		shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
		shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
		shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
		shop.insertFruit(new Fruit(Denomination.ORANGE, 7));

		shop.insertFruit(new Fruit(Denomination.PEAR, 3));
		shop.insertFruit(new Fruit(Denomination.PEAR, 3));
		shop.insertFruit(new Fruit(Denomination.PEAR, 3));
		shop.insertFruit(new Fruit(Denomination.PEAR, 3));
		shop.insertFruit(new Fruit(Denomination.PEAR, 3));

	}

	public void addMoreThanOne(Denomination name, int quantity)
			throws IOException {
		Shop shop = new Shop();
		while (quantity > 0) {
			if (name == Denomination.APPLE) {
				shop.insertFruit(new Fruit(Denomination.APPLE, 5));
			}
			if (name == Denomination.MANDARIN) {
				shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
			}
			if (name == Denomination.ORANGE) {
				shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
			}
			if (name == Denomination.PEAR) {
				shop.insertFruit(new Fruit(Denomination.PEAR, 3));
			}
			quantity--;
			continue;
		}
	}
}
