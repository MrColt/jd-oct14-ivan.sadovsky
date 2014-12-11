package day6.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape implements Drawable {

	public Circle() {
		color = new Color(255, 0, 0);
	}

	public void tryM() {
		System.out.println("Circle");
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));

		g.setColor(color);
		g.drawOval(100, 100, 100, 100);

		// g.fillOval(100, 100, 100, 100);
	}

}
