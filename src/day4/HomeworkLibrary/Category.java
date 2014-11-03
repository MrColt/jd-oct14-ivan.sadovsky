package day4.HomeworkLibrary;

public enum Category {
	FANTASY(0), NOVEL(1), POEM(2), DRAMA(3), NOVELLA(4), MYTHS(5);
	
	private int id;
	
	private Category (int id) {
		this.id = id;
		
	}

	public int getId() {
		return id;
	}
}
