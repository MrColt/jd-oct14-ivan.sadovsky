package day3;

import java.util.Arrays;

public class swapElements {

	public static void main(String[] args) {

		int [] data = {1, 2, 3, 4, 5, 6, 7};
		
		
		swap(data);
	
		
		System.out.println(Arrays.toString(data));
		
			}
	
		static void swap (int [] data) {
		int tmp;	
				
		if (data != null) {
			for (int i = 0; i < data.length - 1; i++) {
//				if (data[i] > data[i + 1]) { -- ��� ������� ��������� ��� ������ ���� ������ ������� ������ �� ��� ��������
				tmp = data[i];
				data[i] = data [i + 1];
				data [i + 1] = tmp;
		
			
				}
			}
		}
	}	
//}


