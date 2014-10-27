package day4.Objects.InfoCar;

public class InfoCarPrint {

	public static void main(String[] args) {

		wheels();
		doors();
		color();
		condition();
		repaired();
		windows();

	}

	static void wheels() {
		Car m = new Car();
		m.numberWheels = 4;
		System.out.println("numberWheels = " + m.numberWheels);
	}

	static void doors() {
		Car m = new Car();
		m.numberDoors = 4;
		System.out.println("numberDoors = " + m.numberDoors);
	}

	static void color() {
		Car m = new Car();
		m.color = "black";
		System.out.println("color = " + m.color);
	}

	static void condition() {
		Car m = new Car();
		m.condition = "new";
		System.out.println("condition = " + m.condition);
	}

	static void repaired() {
		Car m = new Car();
		m.repaired = false;
		System.out.println("repaired = " + m.repaired);
	}

	static void windows() {
		Car m = new Car();
		m.numberWindows = 5;
		System.out.println("numberWindows = " + m.numberWindows);

	}
}