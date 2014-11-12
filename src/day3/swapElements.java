package day3;

public class swapElements {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5 };

	}

	static void swap(int[] data) {

		int Element1 = 0;

		if (data.length > 0) {
			for (int i = 0; i < data.length; i++) {
				Element1 = data[i];
				data[i] = data[i + 1];
				data[i + 1] = Element1;
			
			}
			
		}

	}
	
}