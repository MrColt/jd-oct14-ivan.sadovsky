package day3;

public class b6LastElementsOfArrays {

	public static void main(String[] args) {
		
	int[] data1 = {1, 10, 5, 7, 6};
	int[] data2 = {0};
	int[] data3 = {};
	int[] data4 = {0, 10, 15, 25, 16};
	int[] data5 = {- 3, 25, 2};
	
	System.out.println(getLast(data1));
	System.out.println(getLast(data2));
	System.out.println(getLast(data3));
	System.out.println(getLast(data4));
	System.out.println(getLast(data5));
	
		}		
	
	static int getLast(int[] data){
		if (data.length > 0) {
			return data[data.length - 1];
		}
		return -1;
	}
		
}


