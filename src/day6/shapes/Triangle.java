package day6.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle extends Shape implements Drawable {

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));

		int xPoints[] = { 25, 145, 25 };
		int yPoints[] = { 25, 25, 145 };
		int nPoints = 3;

		g.setColor(new Color(255, 0, 0));

		g.drawPolygon(xPoints, yPoints, nPoints);

		g.setColor(new Color(255, 255, 0));

		g.fillPolygon(xPoints, yPoints, nPoints);

	}
}
