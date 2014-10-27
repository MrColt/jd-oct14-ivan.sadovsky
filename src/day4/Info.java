package day4;

public class Info {

	public static void main(String[] args) {

		PrintTankInfo();

	}

	static void PrintTankInfo() {
		Tank t = new Tank("green", 5, 150);

		System.out.println("Tank [color: " + t.color + ", crew: " + t.crew
				+ ", maxSpeed: " + t.maxSpeed + "]");

	}

}
