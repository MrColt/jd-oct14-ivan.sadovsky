package day6.magazinecoffe.service;

public abstract class Ingredients {

	protected String water;
	protected String coffee;
	protected String sugar;
	protected String teaBlack;
	protected String teaGreen;
	protected String milk;
	protected String teaBergamot;

	public Ingredients() {

	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getTeaBlack() {
		return teaBlack;
	}

	public void setTeaBlack(String teaBlack) {
		this.teaBlack = teaBlack;
	}

	public String getTeaGreen() {
		return teaGreen;
	}

	public void setTeaGreen(String teaGreen) {
		this.teaGreen = teaGreen;
	}

	public String getTeaBergamot() {
		return teaBergamot;
	}

	public void setTeaBergamot(String teaBergamot) {
		this.teaBergamot = teaBergamot;
	}
}
