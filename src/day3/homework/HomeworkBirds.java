package day3.homework;

import java.util.Arrays;
import java.util.Calendar;

public class HomeworkBirds {

	static String[][] birds = { { "Eagle", "2", "15", "1" }, // 1 -- name
								{ "Duck", "30", "2", "3" }, // 2 -- count
								{ "Chicken", "20", "1", "0" }, // 3 -- price
								{ "Hummingbird", "2", "8", "20" } // 4 -- How much sale

								};

	public static void main(String[] args) {
		// System.out.println(birdsSold() + " birds sold.");
		// System.out.println("We have " + getBirdsCount("Duck") + " ducks.");
		// System.out.println("New delivery needed: " + Arrays.toString(needNewDelivery()));
		// getAllInformation(birds);
		 System.out.println(birdsLeftOnStorage() + " birds left");
//		 System.out.println("Now we have: " + moneyInVault(birds) + " $");
	}

	public static void time() {
		Calendar c = Calendar.getInstance();

		int year = c.get(c.YEAR);
		int month = c.get(c.MONTH);
		int date = c.get(c.DATE);
		int hour = c.get(c.HOUR);
		int minute = c.get(c.MINUTE);
		int second = c.get(c.SECOND);
		
		month++;
		hour++;
		minute++;
		second++;

		System.out.println("Time When You Press \"Run\" ");
		System.out.println((hour + 11) + " : " + (minute - 1) + " : "
				+ second);
		System.out.println("Data " + date + "-" + month + "-" + year);
		System.out.println();

	}

	static int birdsSold() {
		int result = 0;
		time();
		for (String[] arr : birds) {
			result += Integer.parseInt(arr[3]);

		}
		return result;
	}

	static int birdsLeftOnStorage() {
		time();
		int count = 0;
		for (String[] array : birds) {
			count += Integer.parseInt(array[1]);
		}
		return count;
	}

	static int moneyInVault(String[][] array) {
		time();
		int i = 0, i1 = 0, i2 = 0, i3 = 0;
		int k = 0, k1 = 0, k2 = 0, k3 = 0;
		i += Integer.parseInt(array[0][2]);
		i1 += Integer.parseInt(array[1][2]);
		i2 += Integer.parseInt(array[2][2]);
		i3 += Integer.parseInt(array[3][2]);
		k += Integer.parseInt(array[0][3]);
		k1 += Integer.parseInt(array[1][3]);
		k2 += Integer.parseInt(array[2][3]);
		k3 += Integer.parseInt(array[3][3]);
		int sum = ((i * k) + (i1 * k1) + (i2 * k2) + (i3 * k3));
		return sum;
	}

	static int getBirdsCount(String type) {
		time();
		for (String[] arr : birds) {
			if (type.equals(arr[0])) {
				return Integer.parseInt(arr[1]);
			}
		}
		return 0;
	}

	static String[] needNewDelivery() {
		time();
		String delivery = "";
		int count;
		for (String[] arr : birds) {
			count = Integer.parseInt(arr[1]);
			if (count < 3) {
				delivery += arr[0] + ",";
			}
		}
		return delivery.substring(0, delivery.length() - 1).split(",");
	}

	static void getAllInformation(String[][] array) {
		time();
		int k = 0;
		for (String[] s : array) {
			if (s != null) {
				System.out.println((k + 1) + ": " + Arrays.toString(s));
				k++;
			}

		}

	}

}
