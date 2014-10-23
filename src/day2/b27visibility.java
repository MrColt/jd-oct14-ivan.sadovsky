package day2;

public class b27visibility {

	public static void main(String[] args) {
		double d = 10.0;
		System.out.println(square(d));
		System.out.println();
		System.out.println(square(10));
		System.out.println();
		System.out.println(square(89l));
		
	}

	static double square (double number) {
		System.out.println("square(double number)");
		return number * number;
	}
	static double square (long number) {
		System.out.println("square(long number)");
		return number * number;
	}
	static double square (int number) {
		System.out.println("square(int number)");
		return number * number;
	}
}
