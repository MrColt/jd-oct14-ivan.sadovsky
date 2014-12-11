package day6.shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

	protected Color color;

	protected void tryM() {

		System.out.println("Shape");
	}

	public abstract void draw(Graphics g);

}
