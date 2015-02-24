package day5.magazineExample.namesandtypes.brands;

public enum PearBrand {

	AVGUSTINKA(0), BELOLISTKA(1), LADA(2), LEVEN(3), SEN_GERMEN(4);

	int id;

	private PearBrand(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
