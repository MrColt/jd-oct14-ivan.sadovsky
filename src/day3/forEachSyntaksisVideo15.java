package day3;

public class forEachSyntaksisVideo15 {

	public static void main(String[] args) {
		System.out.println(avarage(null));
		System.out.println(avarage(new int[0]));
		
		System.out.println();
		System.out.println(avarage(new int [] {1, 0, 1, 0}));
		System.out.println(avarage(new int [] {5, 2, 5, 7, 9, 11}));
		System.out.println(avarage(new int [] {1, 2, 3, 4, 5, 6}));
	}
	
	static double avarage(int [] data) {
		if (data == null || data.length == 0) {
		return -1;
	}
	
	double sum = 0;
	for (int i : data) {
		sum += i;
	}
	return sum / data.length;
	}
}
