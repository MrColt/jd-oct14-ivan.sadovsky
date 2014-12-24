package day4.InfoTank;

public class Tank {

	String color;
	int crew;
	int maxSpeed;

	public Tank() {
		this("red", 4, 120);
	}

	Tank(String color) {
		this(color, 0, 0);

	}

	public Tank(String color, int crew, int maxSpeed) {
		this.color = color;
		this.crew = crew;
		if (maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;

		}
	}
}	
		
	

