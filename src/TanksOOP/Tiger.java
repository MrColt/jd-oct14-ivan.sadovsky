package TanksOOP;

public class Tiger extends Tank {

	private static String color = "Dark_Orange";
	private static int crew = 2;
	private static int maxSpeed = 72;
	private static int armor = 1;

	public void move() {
		
	}

	public Tiger() {

		Tiger.showInfo();

	}

	public static void showInfo() {
		System.out.println("---Info about Tiger---");
		System.out.println();
		System.out.println("Color: " + getColor());
		System.out.println("Crew: " + getCrew());
		System.out.println("Speed: " + getMaxSpeed());
		System.out.println("Armor: " + getArmor());

	}

	public static String getColor() {
		return color;
	}

	public static int getCrew() {
		return crew;
	}

	public static int getMaxSpeed() {
		return maxSpeed;
	}

	public static int getArmor() {
		return armor;
	}

}
