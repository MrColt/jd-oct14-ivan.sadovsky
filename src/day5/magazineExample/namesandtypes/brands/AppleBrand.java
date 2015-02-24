package day5.magazineExample.namesandtypes.brands;

public enum AppleBrand {

	ANTONOVKA(0), FUJI(1), GALA(2), GOLDEN_DELICIOUS(3), MCINTOSH(4);
	
	int id;
	
	private AppleBrand(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
}
