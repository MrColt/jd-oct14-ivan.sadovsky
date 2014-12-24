package day6.magazinecoffe.service;

import day6.magazinecoffe.products.Americano;
import day6.magazinecoffe.products.Capuchino;
import day6.magazinecoffe.products.Espresso;
import day6.magazinecoffe.products.Latte;
import day6.magazinecoffe.products.Mokachino;
import day6.magazinecoffe.products.TeaBlack;
import day6.magazinecoffe.products.TeaGreen;
import day6.magazinecoffe.products.TeaWithBergamot;


public class Menu {
	Americano americano = new Americano();
	Espresso espresso = new Espresso();
	Capuchino capuchino = new Capuchino();
	Mokachino mokachino = new Mokachino();
	TeaBlack teaBlack = new TeaBlack();
	TeaGreen teaGreen = new TeaGreen();
	TeaWithBergamot teaBergamot = new TeaWithBergamot();
	Latte latte = new Latte();
	Prices prices = new Prices();

	public Menu() {

	}

	public void recipeAmericano() {
		americano.setCoffee("coffee 7 gr -- ");
		americano.setSugar("sugar 1 steak -- ");
		americano.setWater("water 120 ml ------------------- ");
		prices.setAmericanoPrice(14);
		System.out.println("Americano: " + americano.getCoffee()
				+ americano.getSugar() + americano.getWater()
				+ prices.getAmericanoPrice() + " grn.");
	}

	public void recipeCapuchino() {
		capuchino.setCoffee("espresso 30 ml -- ");
		capuchino.setMilk("milk 70 ml -- ");
		capuchino.setSugar("sugar 1 steak -- ");
		capuchino.setWater("water 150 ml -- ");
		prices.setCapuchinoPrice(13.5);
		System.out.println("Capuchino: " + capuchino.getCoffee()
				+ capuchino.getMilk() + capuchino.getSugar()
				+ capuchino.getWater() + prices.getCapuchinoPrice() + " grn.");
	}

	public void recipeEspresso() {
		espresso.setCoffee(" coffee 7 gr -- ");
		espresso.setWater("water 30 ml -------------------- ");
		espresso.setSugar("sugar 1 steak -- ");
		prices.setEspressoPrice(11.5);
		System.out.println("Espresso: " + espresso.getCoffee()
				+ espresso.getSugar() + espresso.getWater()
				+ prices.getEspressoPrice() + " grn.");
	}

	public void recipeLatte() {
		latte.setCoffee("    espresso 50 ml -- ");
		latte.setWater("water 180 ml -- ");
		latte.setSugar("2 steak -- ");
		latte.setMilk("milk 140 ml ------- ");
		prices.setLattePrice(15);
		System.out.println("Latte: " + latte.getCoffee() + latte.getSugar()
				+ latte.getWater() + latte.getMilk() + prices.getLattePrice()
				+ " grn.");
	}

	public void recipeMokachino() {
		mokachino.setCoffee("espresso 30 ml -- ");
		mokachino.setMilk("milk 15 gr -------- ");
		mokachino.setSugar("2 steak -- ");
		mokachino.setWater("water 200 ml -- ");
		prices.setMokachinoPrice(12.5);
		System.out.println("Mokachino: " + mokachino.getCoffee()
				+ mokachino.getSugar() + mokachino.getWater()
				+ mokachino.getMilk() + prices.getMokachinoPrice() + " grn.");
	}

	public void recipeTeaBlack() {
		teaBlack.setWater("water 200 ml -- ");
		teaBlack.setTeaBlack("tea black 10 gr -- ");
		teaBlack.setSugar("sugar 2 steak --------------- ");
		prices.setTeaBlackPrice(10);
		System.out.println("Tea Black: " + teaBlack.getWater()
				+ teaBlack.getTeaBlack() + teaBlack.getSugar()
				+ prices.getTeaBlackPrice() + " grn.");
	}

	public void recipeTeaGreen() {
		teaGreen.setWater("water 200 ml --");
		teaGreen.setTeaGreen("tea green 10 gr -- ");
		teaGreen.setSugar("sugar 2 steak ---------------- ");
		prices.setTeaGreenPrice(11);
		System.out.println("Tea Green: " + teaGreen.getWater()
				+ teaGreen.getTeaGreen() + teaGreen.getSugar()
				+ prices.getTeaGreenPrice() + " grn.");
	}

	public void recipeTeaWithBergamot() {
		teaBergamot.setWater("water 200 ml -- ");
		teaBergamot.setSugar("sugar 2 steak -- ");
		teaBergamot.setTeaBergamot("tea bergamot 15 gr ---- ");
		prices.setTeaWithBergamotPrice(14.5);
		System.out.println("Tea With Bergamot: " + teaBergamot.getWater()
				+ teaBergamot.getSugar() + teaBergamot.getTeaBergamot()
				+ prices.getTeaWithBergamotPrice() + " grn.");
	}

	public void showMenu() {
		
		System.out.println("---PRODUCT----------------------INGREDIENTS----------------------------------PRICE---");
		System.out.println();
		recipeAmericano();
		recipeCapuchino();
		recipeEspresso();
		recipeLatte();
		recipeMokachino();
		recipeTeaBlack();
		recipeTeaGreen();
		recipeTeaWithBergamot();
		
	}
}
