package ooptanks.version3.tanks;

import ooptanks.version3.serviceclass.Action;
import ooptanks.version3.serviceclass.ActionField;
import ooptanks.version3.serviceclass.BattleField;
import ooptanks.version3.serviceclass.Direction;


public class BT7 extends AbstractTank {
	int maxSpeed = 55;

	public BT7() {
		super();
	}

	public BT7(ActionField af, BattleField bf, int x, int y, Direction direction) {
		super (af, bf, x, y, direction);
		
	}

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);
		speed = 5;
	}

	private void move() {
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Speed of BT7 is " + maxSpeed;
	}

	@Override
	public Action setup() {
		
		return null;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		return false;
	}

}