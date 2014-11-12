package day3;

public class ForEach {

	public static void main(String[] args) {

		System.out.println(avarage(new int[] { 1, 2, 3, 4, 5 }));

	}

	static double avarage(int[] data) {

		if (data == null || data.length == 0) {
			return -1;
		}

		double sum = 0;
		for (int index : data) {
			sum = sum + index;
		}
		return sum / data.length;
	}
}