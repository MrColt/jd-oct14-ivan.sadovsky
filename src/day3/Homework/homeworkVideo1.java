package day3.Homework;

public class homeworkVideo1 {

	public static void main(String[] args) {
		
		System.out.println(findElement(new double[] {1.0, 5, 45.6, 33}, 1.0 ));

	}
	
	static int findElement(double[] numbers, double el) {
		if (numbers != null) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == el) {
					return i;
				}
			}
		}
		return -1;
	}
}
