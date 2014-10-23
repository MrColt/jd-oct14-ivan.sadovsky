package day3;

import java.util.Arrays;

public class b8ArraysPlace {

	public static void main(String[] args) {
		
		int [] data = {5, 4, 2, 7, 10};
		swap(data, 1, 3);
		swap(data, 2, 4);
		
		System.out.println(Arrays.toString(data));
		
		}

		static void swap (int [] data, int i, int k) {
			if (data == null || (data.length - 1 <= i) || (data.length - 1 <= k || i < 0 || k < 0 || i == k)) {
				return;
			}
			int tmp = data[i];
			data[i] = data[k];
			data[k] = tmp;

	}

}
