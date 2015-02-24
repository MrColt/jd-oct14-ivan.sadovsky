package day9.publish_subscribe_using_jdk_barrel_12;

import java.util.Observer;

public class DemoPublishSubscribe {

	public static void main(String[] args) {
		Observer s1 = new Subscriber("Ivan Ivanov");
		Observer s2 = new Subscriber("Petr Petrov");
		Observer s3 = new Subscriber("Igor Igorevich");
		Observer s4 = new Subscriber("Kate Vasilievna");
		Observer s5 = new Subscriber("John Brown");
		
		Magazine mg1 = new Magazine();
		mg1.setName("Esquire");
		
		Newspaper nw1 = new Newspaper();
		nw1.setName("Daily News");
		
		mg1.addObserver(s1);
		mg1.addObserver(s2);
		mg1.newRelease();
		
		nw1.addObserver(s3);
		nw1.addObserver(s4);
		nw1.addObserver(s5);
		nw1.newRelease();
		
		nw1.deleteObserver(s5);
		nw1.newRelease();
	}

}
