package day9.publish_subscribe_barrel_10;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject {

	static List <Observer> observers = new ArrayList<>();
	
	
	public Magazine() {
		System.out.println("New magazine publication");
		notifyObservers();
		System.out.println();
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
		
	}

}
