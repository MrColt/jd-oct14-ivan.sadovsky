package day3;

public class b9PrintArrays {

	public static void main(String[] args) {

		int[] data1 = { 1, 10, 5, 7, 6 };
		int[] data2 = { 0 };
		int[] data3 = {};
		int[] data4 = { 0, 0, 15, 25, 16 };
		int[] data5 = { -3, 25, 2 };

		System.out.println(printArray(data1));
		System.out.println(printArray(data2));
		System.out.println(printArray(data3));
		System.out.println(printArray(data4));
		System.out.println(printArray(data5));
	}

	public static String printArray(int[] data) {
		if (data == null)
			return "null";
		int indexMaximum = data.length - 1;
		if (indexMaximum == -1)
			return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(data[i]);
			if (i == indexMaximum)
				return b.append(']').toString();
			b.append(", ");
		}
	}

}
