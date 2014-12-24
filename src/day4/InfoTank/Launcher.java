package day4.InfoTank;

public class Launcher {

	public static void main(String[] args) {

		printTankInfo();

	}

	static void printTankInfo() {
		Tank t = new Tank("green", 5, 150);
		System.out.println("Tank [color: " + t.color + ", crew: " + t.crew
				+ ", maxSpeed: " + t.maxSpeed + "]");
		Tank t2 = new Tank("blue");
		System.out.println("Tank [color: " + t2.color + ", crew: " + t2.crew
				+ ", maxSpeed: " + t2.maxSpeed + "]");
		Tank t3 = new Tank();
		System.out.println("Tank [color: " + t3.color + ", crew: " + t3.crew
				+ ", maxSpeed: " + t3.maxSpeed + "]");
		
	}
}
