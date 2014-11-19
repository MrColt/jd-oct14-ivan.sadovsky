package TanksOOP;

public class T34 extends Tank {
	
	private static String color = "Black";
	private static int crew = 2;
	private static int maxSpeed = 50;
	
	public void move() {
		
	}
	
	public T34() {
		
		T34.showInfo();
		
	}	
	
	public static void showInfo() {
		System.out.println("---Info about T34---");
		System.out.println();
		System.out.println("Color: " + getColor());
		System.out.println("Crew: " + getCrew());
		System.out.println("Speed: " + getMaxSpeed());
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
				
}


