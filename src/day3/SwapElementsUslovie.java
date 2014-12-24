package day3;

import java.util.Arrays;

public class SwapElementsUslovie {

	public static void main(String[] args) {

		int[] data = { 5, 4, 3, 2, 1 };

		swap(data);

		System.out.println(Arrays.toString(data));

	}

	static void swap(int[] data) {

		int tmp;
		if (data != null) {
			for (int i = 0; data.length - 1 > i; i++) {
				if (data[i] > data[i + 1]) {
					tmp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = tmp;
				}
			}
		}
	}
}