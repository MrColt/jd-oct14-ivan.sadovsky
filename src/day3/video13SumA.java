package day3;

public class video13SumA {

	public static void main(String[] args) {

		System.out.println(addElementSum(new int[] { 1, 2, 3, 4, 5 }));

	}

	static long addElementSum(int[] data) {
		long sum = 0;
		if (data != null) {
			for (int i = 0; i < data.length; i++) {
				if (i % 2 == 1) {
					sum = sum + data[i];
				}
			}
		}
		return sum;
	}
}
