package day3;

public class SyntaksisForA {

	public static void main(String[] args) {
		
//		for (<var>; <condition>; <modification>) {...}
//		
//		
//		<var> --- начальные условия. объявления переменных
//		<condition> --- условия выхода. Если условие TRUE то заходим если FALSE выходим из цикла
//		<modification> --- изменение счетчика

		int[]data = {10, 20, -5, 3, 0, 40};
		for (int i : data) {
			i++;
			System.out.println(data[i]);
		}
		
	}

}
