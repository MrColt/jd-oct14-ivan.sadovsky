package ooptanks.version1.service;

import java.awt.Color;
import java.awt.Graphics;

import ooptanks.version1.interfaces.Destroyable;
import ooptanks.version1.interfaces.Drawable;

public class Bullet implements Drawable, Destroyable{

	private int speed = 5;
	
	private int x;
	private int y;
	private Direction direction;
	private boolean bulletOwner;

	public Bullet(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public void destroy() {
		x = -100;
		y = -100;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public boolean isBulletOwner() {
		return bulletOwner;
	}

	public void setBulletOwner(boolean bulletOwner) {
		this.bulletOwner = bulletOwner;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(255, 255, 0));
		g.fillRect(this.x, this.y, 14, 14);
		
	}
}
