package day3.homework;

public class homeWorkvideo4Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(9));
		
		

	}
	static long factorial (int num) {
		if ( num <= 0) {
			return 1;
		}
		
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
