package lesson2;

public class b27olegvariant {

	public static void main(String[] args) {
		
		printCoordinates ("a", "9");
		/**
		 * -TANKS-
		 */
	}
		static void printCoordinates(String v, String h) {
			String coordinates = getQuadrantXY(v, h);
			String x = coordinates.substring(0, coordinates.indexOf("_"));
			String y = coordinates.substring(coordinates.indexOf("_") + 1);
			System.out.println(v + h +":(" + x + "px," + y + "px)");
		}
		static String getQuadrantXY(String v, String h) {
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
			return h;
		}
}
