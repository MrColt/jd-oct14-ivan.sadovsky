package day3;

import java.util.Arrays;

public class Video8SwapElements {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8 };

		swap(data, 0, 3);

		System.out.println(Arrays.toString(data));
	}

	static void swap(int[] data, int index, int k) {

		if (data == null || (index >= data.length) || (k >= data.length)
				|| index == k || index < 0 || k < 0) {
			return;
		}

		int change = data[index];
		data[index] = data[k];
		data[k] = change;
	}
}
