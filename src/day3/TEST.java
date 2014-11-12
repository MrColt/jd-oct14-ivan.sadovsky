package day3;

import java.util.*;

public class TEST {

	public static void main(String[] args) {
		int[] data = { 0, 1, 2, 3, 4 };// создаем обычный массив

		int index = 2;// делаем индекс 2

		System.out.println("before: " + data[index]);// выводим на экран

		updateValue(data, index, 25);//

		System.out.println("after: " + data[index]);//

	}

	static void updateValue(int[] data, int index, int value) {
		data[index] = value;//

	}

}