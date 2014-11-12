package day4.Objects.InfoCar;

public class CarInfo {

	private int numberWheels;
	private int numberDoors;
	private String condition;
	private boolean repaired;
	private int numberWindows;
	private CarColor color;
	
	public CarInfo () {
		numberWheels = 4;
		numberDoors = 4;
		condition = "new";
		repaired = true;
		numberWindows = 8;
		color = CarColor.CRIMSON;
		
	}
	
	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
		System.out.println("CarColor : " + color);
	}

	public int getNumberWheels() {
		return numberWheels;
	}
	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
		System.out.println("numberWheels: " + numberWheels);
	}
	public int getNumberDoors() {
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
		System.out.println("Doors: " + numberDoors);
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
		System.out.println("Condition: " + condition);
	}
	public boolean isRepaired() {
		return repaired;
	}
	public void setRepaired(boolean repaired) {
		this.repaired = repaired;
		System.out.println("Repaired ?: " + repaired);
	}
	public int getNumberWindows() {
		return numberWindows;
	}
	public void setNumberWindows(int numberWindows) {
		this.numberWindows = numberWindows;
		System.out.println("Windows: " + numberWindows);
	}
}
