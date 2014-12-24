package ooptanks.version1.tanks;

import java.awt.Color;

import ooptanks.version1.service.ActionField;
import ooptanks.version1.service.BattleField;
import ooptanks.version1.service.Direction;

public class Tiger extends AbstractTank {

	private int armor;
	
	public Tiger(ActionField af, BattleField bf) {
		super(af, bf);
		armor = 1;
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
	
	public Tiger(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction){
		super(af, bf, x, y, tankType, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		if (armor > 0){
			armor = 0;
		}else{
			super.destroy();
			
		}
	}
	
}