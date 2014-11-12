package day2;

public class loopscyklus {

	public static void main(String[] args) {
		
		int i= 1;
		while (i <= 10) {
			System.out.println(i);
			if (++i == 10) {
				continue; }
			if (i == 10 ) {
				break; }
		}
	}
		
}



//int i = 0;
//while (i<5) {
//	System.out.println(i++); 
	
//i++ это инкремент, добавляет 1
//i-- это инкремент, вычитает 1

//int i = 1;
//while (true) {
//	System.out.println(i);
//	i++;
//	if (i > 10) {
//		break;
//	}


//while(<boolean expression>) {
//	our code
//}
