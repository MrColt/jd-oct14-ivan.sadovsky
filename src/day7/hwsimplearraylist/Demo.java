package day7.hwsimplearraylist;

public class Demo {

	public static void main(String[] args) {
		Object object1 = new String("James");
		Object object2 = new String("Harry");
		Object object3 = new String("Hillary");
		Object object4 = new String("Cortney");
		Object object5 = new String("Jackie Chan");

		SimpleArrayList sal = new SimpleArrayList();
		sal.addFirst(object1);
		sal.addFirst(object2);
		sal.addFirst(object4);
		sal.addLast(object3);
		sal.addLast(object5);
		sal.remove(object5);
//		sal.getByPosition(4);
//		sal.getByPosition(3);
//		sal.addAfter(object1, object2);
		sal.printArrayList();

	}

}
