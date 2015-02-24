package day9.observer_in_jdk;

import java.util.Observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		System.err.println("Observer Pattern Demo | Day 9");
		System.out.println();
		
		Worker w = new Worker();
		
		Observer o1 = new Supervisor();
		Observer o2 = new Supervisor();
		Observer o3 = new Supervisor();
		Observer o4 = new Supervisor();
		Observer o5 = new Supervisor();
		Observer o6 = new Supervisor();
		
		w.addObserver(o1);
		w.addObserver(o2);
		w.addObserver(o3);
		w.addObserver(o4);
		w.addObserver(o5);
		w.addObserver(o6);
		
		for (int i = 0; i < 10; i ++) {
			w.doRegularJob();
			System.out.println();
		}
		
		w.deleteObserver(o6);
		
		for (int i = 0; i < 10; i ++ ) {
			w.doSpecificJob();
			System.out.println();
		}
	}

}
