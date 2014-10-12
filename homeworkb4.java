package lesson2;

public class homeworkb4 {

	public static void main(String[] args) {
	
		start ( 99 );
		
	}
	static void start (int number) {
		if (number <= 1) {
					System.out.println("Start failed");
					return;
			}
			while (number > 0) {
				System.out.println(number --);
			}
			System.out.println("Go");
	}
}
