package ooptanks.version1.service;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import ooptanks.version1.tanks.AbstractTank;
import ooptanks.version1.tanks.T34;
import ooptanks.version1.tanks.Tiger;

public class ActionField extends JPanel {

	final boolean COLORDED_MODE = false;

	private BattleField battleField;
	private AbstractTank deffender;
	private AbstractTank aggressor;
	private Bullet bullet;
	private AbstractTank tank;

	void runTheGame() throws Exception {
		deffender.fire();
		deffender.fire();
		deffender.fire();
	}

	public void processTurn(AbstractTank tank) throws Exception {
		repaint();
	}

	public void processMoveToQuadrant(AbstractTank tank, int v, int h)
			throws Exception {
		String coordinates = getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y = Integer.parseInt(coordinates.substring(0, separator));
		int x = Integer.parseInt(coordinates.substring(separator + 1));

		if (tank.getX() < x) {
			while (tank.getX() != x) {
				tank.turn(Direction.RIGHT);
				processMove(tank); // go right 4
			}

		} else {
			while (tank.getX() != x) {
				tank.turn(Direction.LEFT);
				processMove(tank); // go left 3
			}
		}

		if (tank.getY() < y) {
			while (tank.getY() != y) {
				tank.turn(Direction.DOWN);
				processMove(tank);
			}
		} else {
			while (tank.getY() != y) {
				tank.turn(Direction.UP);
				processMove(tank);
			}
		}
		repaint();
		Thread.sleep(tank.getSpeed());
	}

	public void processMove(AbstractTank tank) throws Exception {

		Direction direction = tank.getDirection();
		int step = 1;
		int covered = 0;
		// 1 - up, 2 - down, 3 - left, 4 - right
		if ((direction == Direction.UP && tank.getY() == 0)
				|| (direction == Direction.DOWN && tank.getY() >= 512)
				|| (direction == Direction.LEFT && tank.getX() == 0)
				|| (direction == Direction.RIGHT && tank.getX() >= 512)) {
			System.out.println("[illegal move] direction: " + direction
					+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			return;
		}

		tank.turn(direction);

		while (covered < 64) {

			if (direction == Direction.UP) {
				tank.updateY(-step);
				System.out.println("[move up] direction: " + direction
						+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			} else if (direction == Direction.DOWN) {
				tank.updateY(step);
				System.out.println("[move down] direction: " + direction
						+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			} else if (direction == Direction.LEFT) {
				tank.updateX(-step);
				System.out.println("[move left] direction: " + direction
						+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			} else {
				tank.updateX(step);
				System.out.println("[move right] direction: " + direction
						+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			}
			covered += step;

			repaint();
			Thread.sleep(tank.getSpeed());
		}
	}

	// 1 - up, 2 - down, 3 - left, 4 - right
	public void processFire(Bullet bullet) throws Exception {
		this.bullet = bullet;
		int step = 1;
		Direction direction = bullet.getDirection();

		while ((bullet.getY() > -14 && bullet.getY() < 590)
				&& (bullet.getX() > -14 && bullet.getX() < 590)) {
			if (bullet.getDirection() == Direction.UP) {
				bullet.updateY(-step);
			} else if (bullet.getDirection() == Direction.DOWN) {
				bullet.updateY(step);
			} else if (bullet.getDirection() == Direction.LEFT) {
				bullet.updateX(-step);
			} else {
				bullet.updateX(step);
			}

			if (processInterception()) {
				bullet.destroy();
			}

			repaint();
			Thread.sleep(bullet.getSpeed());

		}
	}

	private boolean processInterception() {
		String coordinates = getQuadrant(bullet.getX(), bullet.getY());
		int y = Integer.parseInt(coordinates.split("_")[0]);
		int x = Integer.parseInt(coordinates.split("_")[1]);

		if (y >= 0 && y < 9 && x >= 0 && x < 9) {
			if (!battleField.scanQuadrant(y, x).trim().isEmpty()) {
				battleField.updateQuadrant(y, x, "");
				return true;
			}

			if (bullet.isBulletOwner()
					&& checkInterception(
							getQuadrant(aggressor.getX(), aggressor.getY()),
							coordinates)) {
				System.out.println("Aggressor was destroyed");
				aggressor.destroy();
				return true;
			}

			if (!bullet.isBulletOwner()
					&& checkInterception(
							getQuadrant(deffender.getX(), deffender.getY()),
							coordinates)) {
				System.out.println("Deffender was destroyed");
				deffender.destroy();
				return true;

			}
		}
		return false;

	}

	private boolean checkInterception(String object, String quadrant) {
		int oy = Integer.parseInt(object.split("_")[0]);
		int ox = Integer.parseInt(object.split("_")[1]);

		int qy = Integer.parseInt(quadrant.split("_")[0]);
		int qx = Integer.parseInt(quadrant.split("_")[1]);

		if (oy >= 0 && oy < 9 && ox >= 0 && ox < 9) {
			if (oy == qy && ox == qx) {
				return true;
			}
		}
		return false;
	}

	public String getQuadrant(int x, int y) {
		return y / 64 + "_" + x / 64;
	}

	public String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	public ActionField() throws Exception {

		battleField = new BattleField();
		deffender = new T34(this, battleField);
		bullet = new Bullet(-100, -100, Direction.NONE);
		String location = battleField.getAggressorLocation();
		aggressor = new Tiger(this, battleField, Integer.parseInt(location
				.split("_")[1]), Integer.parseInt(location.split("_")[1]),
				false, Direction.UP);

		JFrame frame = new JFrame("BATTLE FIELD, OOP");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(battleField.getBfWidth(),
				battleField.getBfHeight() + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQuadrant(j, k).equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}

		deffender.draw(g);
		aggressor.draw(g);
		bullet.draw(g);
		
	}

}
