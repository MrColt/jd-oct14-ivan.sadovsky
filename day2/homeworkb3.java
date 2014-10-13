package day2;

public class homeworkb3 {

	public static void main(String[] args) {
		
		emotions (15, 7, -3);
		emotions (3, 300, 0);
		emotions (3, 300, 40);
		emotions (-47, 74, -4);
	}
		static void emotions(int a, int b, int c) {
			if(a == 15 || a > c) {
				if (a < b) {
					System.out.print("Heh!");
				} else {
					System.out.print("!!!");
				}
			} else if (c < 0 && a !=3) {
				System.out.print(":)");
			} else {
				System.out.print(":(");
				
			}
		}
}
