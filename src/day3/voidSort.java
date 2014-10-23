package day3;

import java.util.Arrays;

public class voidSort {

	public static void main(String[] args) {

		int [] data = {1, 6, 3, 7};
		
		sort(data);
		
		System.out.println(Arrays.toString(data));

		}
	
	static void sort (int [] data) {
		
			int i = 0;
			while (data[i] > data[i + 1]) {
				data [i] = data[i - 1];
					
			}
					
		}

	}
