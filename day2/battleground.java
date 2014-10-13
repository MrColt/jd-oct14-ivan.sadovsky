package lesson2;

public class battleground {

	public static void main(String[] args) {
		
		System.out.println(getQudrantXY("a", "9"));
		System.out.println(getQudrantXY("g", "2"));
		System.out.println(getQudrantXY("a", "9"));
		System.out.println(getQudrantXY("c", "4"));
		System.out.println(getQudrantXY("i", "1"));
		
	}
	/**
	 * -TANKS-
	 */
	static String getQudrantXY(String v, String h) {
		int hor = Integer.valueOf(h);
		
		int vert = 1;
		if (v.equals("b")) {
			vert = 2;
		} else if (v.equals("c")) {
			vert = 3;
		} else if (v.equals("d")) {
			vert = 4;
		} else if (v.equals("e")) {
			vert = 5;
		} else if (v.equals("f")) {
			vert = 6;
		} else if (v.equals("g")) {
			vert = 7;
		} else if (v.equals("h")) {
			vert = 8;
		} else if (v.equals("i")) {
			vert = 9;
		}
		
		return v + h + ":(" + (vert - 1) * 64 + "px; " + (hor - 1) * 64 + "px)";
		
		}
}


