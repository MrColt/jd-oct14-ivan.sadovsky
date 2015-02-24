package day9.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		System.out.println("AdapterPatternDemo, Day 9");
		System.out.println();
		
//		Target target1 = new AdapterByObject();
		Target target2 = new AdapterByClass();
		
//		System.out.println(target1.newRequest());
		System.out.println(target2.newRequest());
	}

}
