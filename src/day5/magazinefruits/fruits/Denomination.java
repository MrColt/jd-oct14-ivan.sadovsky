package day5.magazinefruits.fruits;

public enum Denomination {
	APPLE(0), ORANGE(1), PEAR(2), MANDARIN(3);
	private int id;
	
	private Denomination(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
