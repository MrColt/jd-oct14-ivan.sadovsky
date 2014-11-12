package day3;

public class sintaksisForA {

	public static void main(String[] args) {
		int[] data = {1, 10, 5, 7, 6, 3};
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		
		}
	}
}


//		for(<var>; <condition>; <modification>) {...}
//		
//		<var> -- начальные условие, объявление переменных
//		<condition> -- условие выхода. Проверяем если условие TRUE то мы заходим если FALSE то мы выходим из цикла
//		<modification> -- изменение счетчика

//int index = 0; // индекс который нам нужен всегда для доступа к массиву
//while (index <data.length) { // сам цикл и условия выхода из цикла
//	System.out.println(data[index]); // работа с нашим циклом внутри цикла
//	index ++; // работа с нашим циклом внутри цикла


