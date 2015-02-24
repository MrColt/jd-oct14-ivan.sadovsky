package day9.observerpattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		
		ConcreteSubject cs = new ConcreteSubject();
		
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		
		
		cs.addObserver(o1);
		cs.addObserver(o2);
		
		for (int i = 0; i < 10; i ++) {
			cs.doTheJob();
			System.out.println();
		}
		
		cs.removeObserver(o2);
		
		for (int i = 0; i < 10; i++) {
			cs.doTheJob();
		}
	}

}
