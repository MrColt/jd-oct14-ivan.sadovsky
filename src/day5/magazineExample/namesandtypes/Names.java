package day5.magazineExample.namesandtypes;

public enum Names {
	
	APPLE(0), BANANA(1), MANDARIN(2), ORANGE(3), PEAR(4); 
	
	private int id;
	
	private Names (int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
