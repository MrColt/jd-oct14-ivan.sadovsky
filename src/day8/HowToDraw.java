package day8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HowToDraw extends JPanel {
	
	public HowToDraw() {
		JFrame frame = new JFrame("Day 8, 2D Graphics");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(600, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(this);
		
		frame.pack();
		frame.setVisible(true);
		frame.repaint();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(50, 50, 500, 300);
		
	}

	public static void main(String[] args) {
		new HowToDraw();

	}

}
