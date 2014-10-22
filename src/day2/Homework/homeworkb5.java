package day2.Homework;

public class homeworkb5 {

	public static void main(String[] args) {
		
		printNumbers (1, 5);
			
	}
	static void printNumbers(int i, int n) {
		while(i < n) {
			n++;
			i+=2;
			System.out.println("i:" + i + ", " + "n:" + n);
			}
		}
	}

