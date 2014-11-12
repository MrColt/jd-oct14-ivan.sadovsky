package day3;

public class b13IntSum {

	public static void main(String[] args) {
		
		int [] data = {1, 2, 3, 4, 5};
		
		for ( int i = 0, k = 5; ((i & 1) == 1) || (( k & 1) == 0); i++) {
	
				System.out.println(data[i]);
			}
			
		}
	}

