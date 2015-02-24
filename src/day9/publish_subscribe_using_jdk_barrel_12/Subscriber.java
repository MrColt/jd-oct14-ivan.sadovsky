package day9.publish_subscribe_using_jdk_barrel_12;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Subscriber " + this.name + " is notified. New release of " + ((Newspaper) o).getName());
		
		
	}

}
