package day4.TankColorEnum;

public enum TankColor {

	BLACK(0), DARK_GREEN(1), DARK_BLUE(2), DARK_RED(3);

	private int id;

	private TankColor(int id) {
		this.id = id;
	}

	TankColor getDefaultColor() {
		return BLACK;
	}
}
