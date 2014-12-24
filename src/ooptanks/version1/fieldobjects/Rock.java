package ooptanks.version1.fieldobjects;

import java.awt.Color;

public class Rock extends SimpleBFObjects {

	private int armor = 2;
	
	public Rock(int x, int y) {
		super(x, y);
		color = Color.GRAY;
	}
	
	@Override
    public void destroy() {
        armor--;
        if (armor == 0) {
            isDestroyed = true;
        }
    }
}