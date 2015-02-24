package day8.hw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MagicSquare extends JPanel {
	
	private int x = 50;
	private int y = 250;
	
	public MagicSquare() {
		JFrame frame = new JFrame("Magic Square");
		frame.setMinimumSize(new Dimension(400, 400));
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if ((e.getX() > x && e.getX() < y + x) && (e.getY() > x && e.getY() < y + x)) {
					repaint();
				}
			}
		});
		
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Random r = new Random();
		int colorRed = r.nextInt(255);
		int colorGreen = r.nextInt(255);
		int colorBlue = r.nextInt(255);
		
		g.setColor(new Color (colorRed, colorGreen, colorBlue));
		g.fillRect(x, x, y, y);
		
	}
	
	public static void main(String[] args) {
		new MagicSquare();
	}

}
