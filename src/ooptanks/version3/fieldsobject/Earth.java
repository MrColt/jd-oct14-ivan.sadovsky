package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.LoadingImages;

public class Earth extends BFObject {

	public Earth() {
		this.color = new Color(102, 255, 102);
		image = LoadingImages.getEarth();
	}

	public Earth(int x, int y) {
		this.color = new Color(102, 255, 102);
		this.x = x;
		this.y = y;
		image = LoadingImages.getEarth();
		}
	}
