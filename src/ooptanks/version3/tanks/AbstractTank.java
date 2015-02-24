package ooptanks.version3.tanks;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import ooptanks.version3.fieldsobject.BFObject;
import ooptanks.version3.serviceclass.Action;
import ooptanks.version3.serviceclass.ActionField;
import ooptanks.version3.serviceclass.BattleField;
import ooptanks.version3.serviceclass.Destroyable;
import ooptanks.version3.serviceclass.Direction;
import ooptanks.version3.serviceclass.Drawable;

public abstract class AbstractTank extends BFObject implements Drawable,Destroyable{
	protected Direction direction;
	protected int speed = 10;
	protected Color colorTank, colorTower;
	public int maxSpeed;
	public BattleField bf;
	public Action action;
	protected String id;
	protected HashMap<Direction, BufferedImage> imagesOfTank;
	private ActionField af;
	private boolean destroyed = false;

	public AbstractTank() {
	}

	public AbstractTank(BattleField battle) {
		this(battle, 128, 512, Direction.UP);
	}

	public AbstractTank(BattleField bf, int x, int y, Direction direction) {

		this.direction = direction;
		this.x = x;
		this.y = y;
		this.bf = bf;
		this.action = new Action();
	}

	public AbstractTank(ActionField af, BattleField bf, int x, int y,
			Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;

	}

	public AbstractTank(ActionField af, BattleField bf) {
		this.af = af;
		this.bf = bf;

	}

	public abstract Action setup();

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		return destroyed;
	}

	public void draw(Graphics g) {
		g.drawImage(this.imagesOfTank.get(this.getDirection()), this.getX(),
				this.getY(), 64, 64, null);

	}
}
