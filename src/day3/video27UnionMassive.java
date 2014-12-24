package day3;

import java.util.Arrays;

public class video27UnionMassive {

	public static void main(String[] args) {
		int[] data1 = {1, 2, 3};
		int[] data2 = {4, 5, 6, 7};
		
		System.out.println(Arrays.toString(union(data1, data2)));
	}
	
	static int[] union(int[] data1, int[] data2) {
		int[] result = new int [data1.length + data2.length];
		
		int i = 0;
		for (; i < data1.length; i++) {
			result [i] = data1[i];
		}
		
		for (int k = 0; k < data2.length; k++) {
			result[i++] = data2[k];
		}
		return result;
	}
}
