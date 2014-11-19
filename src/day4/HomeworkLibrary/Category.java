package day4.HomeworkLibrary;

public enum Category {
	FANTASY(0), THRILLER(1), ADVENTURE(2), DRAMA(3), HORROR(4), MYTHS(5);
	
	private int id;
	
	private Category (int id) {
		this.id = id;
		
	}

	public int getId() {
		return id;
	}
}
