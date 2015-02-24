package day8.hw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AngryFriend extends JPanel {

	private int x = 50;
	private int y = 250;
	private boolean win = false;

	public AngryFriend() {
		JFrame frame = new JFrame("Start Angry Game");
		frame.setLocationRelativeTo(null);
		frame.setMinimumSize(new Dimension(300, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (x == e.getX() && y == e.getY()) {
					win = true;
				}

				// TODO Auto-generated method stub

			}
		});

		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				Random r = new Random();
				int xAnother = r.nextInt(50);
				int yAnother = r.nextInt(50);

				if (xAnother < 26)
					xAnother = 26;
				if (yAnother < 26)
					yAnother = 26;

				int random = r.nextInt(4);

				if (random == 0) {
					x = e.getX() + xAnother;
					y = e.getY() + yAnother;
				} else if (random == 1) {
					x = e.getX() + xAnother;
					y = e.getY() - yAnother;
				} else if (random == 2) {
					x = e.getX() - xAnother;
					y = e.getY() + yAnother;
				} else {
					x = e.getX() - xAnother;
					y = e.getY() - yAnother;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				repaint();
			}
		});
		
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		g.drawString("Click ME", 100, 50);
		
		if(win) {
			g.setColor(Color.red);
			g.drawString("You Win !", 50, 50);
			return;
		}
		
		g.setColor(Color.red);
		g.fillOval(x, y, 25, 25);
		
	}

	public static void main(String[] args) {
		new AngryFriend();

	}

}
