package day5.magazineExample.namesandtypes.brands;

public enum OrangeBrand {

	WASHINGTON_NAVEL(0), VALENCIA(1), BLONDO_COMMUNE(2), OVALE(3), TALOCCO(4);

	int id;

	private OrangeBrand(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

}
