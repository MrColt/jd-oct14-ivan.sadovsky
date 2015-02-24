package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.Destroyable;
import ooptanks.version3.serviceclass.LoadingImages;

public class Eagle extends BFObject implements Destroyable{

	public Eagle(){
		this.color = new Color(255,255,255);
		image = LoadingImages.getEagle();
	}
	
	@Override
	public void destroy() throws Exception {
		
	}

	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		return false;
	}

}
