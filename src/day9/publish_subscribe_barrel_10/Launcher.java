package day9.publish_subscribe_barrel_10;

public class Launcher {

	public static void main(String[] args) {
		Subscriber s1 = new Subscriber("Ivan Ivanov");
		Subscriber s2 = new Subscriber("Petr Petrov");
		Subscriber s3 = new Subscriber("Igor Igorevich");
		Subscriber s4 = new Subscriber("Kate Vasilievna");
		Subscriber s5 = new Subscriber("John Brown");
		
		Newspaper.observers.add(s1);
		Newspaper.observers.add(s2);
		Newspaper.observers.add(s3);
		
		Magazine.observers.add(s5);
		Magazine.observers.add(s3);
		Magazine.observers.add(s1);
		
		new Magazine();
		new Newspaper();
		
		Newspaper.observers.remove(s3);
		new Newspaper();

	}

}
