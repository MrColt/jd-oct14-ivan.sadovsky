package ooptanks.version2.tanks.bf.tanks;

import ooptanks.version2.tanks.Direction;
import ooptanks.version2.tanks.bf.Destroyable;
import ooptanks.version2.tanks.bf.Drawable;



public interface Tank extends Drawable, Destroyable {
	
	public Action setUp();

	public void move();

	public Bullet fire();

	public int getX();

	public int getY();
	
	public Direction getDirection();
	
	public void updateX(int x);

	public void updateY(int y);
	
	public int getSpeed();
	
	public int getMovePath();

}
