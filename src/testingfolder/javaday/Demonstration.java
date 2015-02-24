package testingfolder.javaday;

public class Demonstration {

	public static void main(String[] args) {

		String dateOfBirth = "09.03.1992";
		int summa = summaChisel(dateOfBirth);

		System.out.println(summa);
		
	}

	public static int summaChisel(String data) {

		int suma = 0;
		suma += numberToInt(data, 0);
		suma += numberToInt(data, 1);
		suma += numberToInt(data, 3);
		suma += numberToInt(data, 4);
		
		return suma;

	}

	// suma = Integer.parseInt(String.valueOf(data.charAt(0)));

	public static int numberToInt(String data, int index) {
		int suma = 0;

		char ch = data.charAt(0);
		String str = String.valueOf(ch);
		int number = Integer.parseInt(str);

		suma += number;

		return suma;
	}

}
