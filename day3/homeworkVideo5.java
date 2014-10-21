package day3;

public class homeworkVideo5 {

	public static void main(String[] args) {
		printJournal();
	}
	
	static void printJournal () {
		for (int[] data : journal) {
			for (String s :subjects[data[0]]) {
				System.out.print(s + " ");
			}
			
			for (String s : students[data[1]]) {
				System.out.print(s + " ");
			}
			System.out.println(data[2]);
	}
}

	static String [][] students = {
		{"Oleg", "Kotov"},
		{"Irina", "Larina"},
		{"Alexey", "Volkov"},
		{"Inna", "Zarina"}
	};
	
	static String [][] subjects = {
		{"Math", "460"},
		{"Russian", "300"},
		{"English", "100"},
	};
		
	static int [][] journal = {
		{0, 0, 2},
		{0, 1, 4},
		{0, 2, 5},
		{0, 3, 3},
		{2, 0, 2},
		{2, 1, 4},
		{2, 2, 4},
		{2, 3, 5},
		{1, 3, 5}
	};
		
}	

	

