package day6.shapes;

public class Launcher {

	public static void main(String[] args) {

		Drawable[] shapes = new Drawable[] { new Rectangle() };

		new ShapesTemplate(shapes);
	}
}
