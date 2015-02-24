package day9.publish_subscribe_using_jdk_barrel_12;

import java.util.Observable;

public class Newspaper extends Observable {

	String name;
	
	
	public Newspaper() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void newRelease() {
		System.out.println();
		System.out.println("New release of " + this.name);
		setChanged();
		notifyObservers();
	}
	
}
