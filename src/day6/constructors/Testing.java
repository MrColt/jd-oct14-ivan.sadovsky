package day6.constructors;

public class Testing extends Glyph {

	private String name = "James";
	
	@Override
	public void draw() {
		System.out.println(name.length());
	}
	
}
