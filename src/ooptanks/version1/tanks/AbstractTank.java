package ooptanks.version1.tanks;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import ooptanks.version1.service.ActionField;
import ooptanks.version1.service.BattleField;
import ooptanks.version1.service.Bullet;
import ooptanks.version1.service.Direction;

public abstract class AbstractTank {

	protected int speed = 10; // 1 - up, 2 - down, 3 - left, 4 - right
	private Direction direction;

	// position on BattleField
	private int x;
	private int y;

	private ActionField af;
	private BattleField bf;

	private Bullet bullet;
	private boolean tankType;
	
	protected Color tankColor;
	protected Color towerColor;

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public AbstractTank() {

	}

	public AbstractTank(ActionField af, BattleField bf) {
		this(af, bf, 128, 512, true, Direction.UP);
	}

	public AbstractTank(ActionField af, BattleField bf, int x, int y,
			boolean tankType, Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.tankType = tankType;
		this.direction = direction;
	}

	public void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);

	}

	public void move() throws Exception {
		af.processMove(this);
	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet((x + 25), (y + 25), direction);
		if (this.tankType) {
			bullet.setBulletOwner(true);
		} else {
			bullet.setBulletOwner(false);
		}
		af.processFire(bullet);

	}

	//
	// if ((this.getDirection() == Direction.UP && this.getY() != 0)
	// || (this.getDirection() == Direction.DOWN && this.getY() < 512)
	// || (this.getDirection() == Direction.LEFT && this.getX() != 0)
	// || (this.getDirection() == Direction.RIGHT && this.getX() < 512)) {
	// if(this.getDirection() == Direction.UP) {
	// bullet = new Bullet(this.getX() + 25, this.getY(), direction);
	// } else if (this.getDirection() == Direction.DOWN) {
	// bullet = new Bullet(this.getX() + 25, this.getY() + 64, direction);
	// } else if (this.getDirection() == Direction.LEFT) {
	// bullet = new Bullet(this.getX() + 25, this.getY() + 25, direction);
	// } else {
	// bullet = new Bullet(this.getX() + 64, this.getY() + 25, direction);
	// }
	// }
	// return bullet;
	// }

	public void moveToQuadrant(AbstractTank tank, int v, int h)
			throws Exception {
		af.processMoveToQuadrant(tank, v, h);
	}

	public void moveRandom() throws Exception {
		// Random r = new Random();
		// int i;
		// while (true) {
		// i = r.nextInt(5);
		// if (i > 0) {
		// this.setDirection(i);
		// this.move();
	}

	public void clean() throws Exception {

	}
	
	public void draw(Graphics g) {
		g.setColor(tankColor);
		g.fillRect(this.getX(), this.getY(), 64, 64);
		
		g.setColor(towerColor);
		if(this.getDirection()==Direction.UP){
			g.fillRect(this.getX() + 20, this.getY(), 24, 34);
		} else if (this.getDirection() == Direction.DOWN) {
			g.fillRect(this.getX() + 20, this.getY() + 30, 24, 34);
		} else if (this.getDirection() == Direction.LEFT) {
			g.fillRect(this.getX(), this.getY() + 20, 34, 24);
		} else {
			g.fillRect(this.getX() + 30, this.getY() + 20, 34, 24);
		}
	}

	public void destroy() {
		x = -100;
		y = -100;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}
}
