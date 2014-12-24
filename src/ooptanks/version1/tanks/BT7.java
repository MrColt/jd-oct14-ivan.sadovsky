package ooptanks.version1.tanks;

import java.awt.Color;

import ooptanks.version1.service.ActionField;
import ooptanks.version1.service.BattleField;
import ooptanks.version1.service.Direction;

public class BT7 extends AbstractTank {

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
	
	public BT7(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction) {
		super(af, bf, x, y, tankType, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
}