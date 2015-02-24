package day8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Drawing extends JPanel {
	
	private final static String BLOCKS = "Blocks.jpg";
	private Image Blocks;
	
	public Drawing() {	
		try {
			Blocks = ImageIO.read(new File(BLOCKS));
		} catch (IOException e) {
			System.err.println("Catn find image: " + BLOCKS);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.RED);
		g.fillRect(400, 100, 50, 50);
		
		g.setColor(Color.GREEN);
		g.draw3DRect(400, 200, 40, 40, true);
		
		g.setColor(new Color (255, 255, 255));
		g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 32));
		g.drawString("Hello world !", 20, 50);
		
		g.drawImage(Blocks, 100, 500, new ImageObserver() {
			
			@Override
			public boolean imageUpdate(Image img, int infoflags, int x, int y,
					int width, int height) {
				// TODO Auto-generated method stub
				return false;
			}
		
		});
		
	}
	
	public static void main (String[] args) {
		JFrame frame = new JFrame("Day 8");
		frame.setMinimumSize(new Dimension(800,600));
		frame.setLocationRelativeTo(null);
		
		frame.getContentPane().add(new Drawing());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}