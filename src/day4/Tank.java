package day4;

import day4.TankColorEnum.TankColor;

public class Tank {

	private TankColor color;
	private int crew;
	private int maxSpeed;

	public Tank() {
		this(TankColor.DARK_RED, 4, 120);
	}

	public Tank(String color) {
		this(TankColor.DARK_GREEN, 0, 0);

	}

	public Tank(TankColor color, int crew, int maxSpeed) {
		this.color = color;
		this.crew = crew;
		setMaxSpeed(maxSpeed);

	}

	public TankColor getColor() {
		return color;
	}

	public void setColor(TankColor color) {
		this.color = color;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
		
	}

}
