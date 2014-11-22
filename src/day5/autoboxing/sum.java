package day5.autoboxing;

public class sum {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = new Integer(5);
		int c = 7;
		sum(a, 5);
		sum(c, b);
		a = sum(5, 7);
		
	}
	public static int sum(int a, int b) {
		return a + b;
		
	}

}
