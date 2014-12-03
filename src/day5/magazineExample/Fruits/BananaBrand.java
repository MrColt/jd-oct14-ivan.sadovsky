package day5.magazineExample.Fruits;

public enum BananaBrand {

	BARRO(0), CAVENDISH(1), MANSANO(2), PLANTAIN(3); 
	
	int id;
	
	private BananaBrand(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	
}
