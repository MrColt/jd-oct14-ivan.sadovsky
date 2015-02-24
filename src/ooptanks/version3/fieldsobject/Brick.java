package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.Destroyable;
import ooptanks.version3.serviceclass.LoadingImages;

public class Brick extends BFObject implements Destroyable {

	public Brick() {
		this.color = new Color(250, 100, 100);
		
		image = LoadingImages.getBricks();
		
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
