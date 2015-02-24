package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.LoadingImages;

public class Water extends BFObject{

	 public Water(){
		 this.color = new Color(65,105,225);
		image = LoadingImages.getWater();
	 }
}