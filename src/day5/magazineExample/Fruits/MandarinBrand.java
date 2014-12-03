package day5.magazineExample.Fruits;

public enum MandarinBrand {

	FAIRCHILD(0), CLEMENTINE(1), SUNBURST(2), ROBINSON(3), DANCY(4);

	int id;

	private MandarinBrand(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
