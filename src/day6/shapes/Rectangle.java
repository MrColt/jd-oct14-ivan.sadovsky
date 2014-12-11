package day6.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape implements Drawable{

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		
		g.setColor(new Color(255, 0, 0));
		g.drawRect(200, 70, 200, 70);
		g.fillRect(200, 70, 200, 70);
	}
}
