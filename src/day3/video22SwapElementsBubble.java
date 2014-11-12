package day3;

import java.util.Arrays;
import java.util.Random;

public class video22SwapElementsBubble {

	public static void main(String[] args) {
		
		int [] dataK = createArray(1000);
		int [] data10K = createArray(10000);
		int [] data100K = createArray(1000000);
		Arrays.sort(data100K);
//		sort(dataK);
//		sort(data10K);
//		sort(data100K);
		long time = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis() - time);

	}
		static void sort (int [] data) {
			long time = System.currentTimeMillis();
			if ( data != null) {
				int activeLength = data.length - 1;
				int swapCount;
				for (int i = 0; i < data.length - 1; i++) {
					swapCount = 0;
					for ( int k = 0; k < activeLength; k++) {
						swapCount += swap (data, k, k + 1);
					}
					if (swapCount == 0) {
						break;
				}
					activeLength --;
			}
			System.out.println(System.currentTimeMillis() - time);
		}
	}
		
		static int swap(int [] data, int i, int k) {
				int tmp;
					if (data[i] > data [k]) {
						tmp = data[k];
						data[k] = data [i];
						data [i] = tmp;
						return 1;
					}
					return 0;
				}
		
		
		
		static int [] createArray (int dimension) {
			int [] data = new int[dimension];
			Random r = new Random();
			int cValue = dimension;
			for (int i = 0; i < data.length; i++) {
				data[i] = r.nextInt(dimension);
				data[i] = cValue --;
			}
			return data;
		}
}
