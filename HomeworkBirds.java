package day3.homework;

import java.util.Arrays;

public class HomeworkBirds {

	static String[][] birds = { { "Eagle", "2", "15", "1" }, // 1 -- name
								{ "Duck", "30", "2", "3" }, // 2 -- count
								{ "Chicken", "20", "1", "0" }, // 3 -- price
								{ "Hummingbird", "2", "8", "20" } // 4 -- How much sale

							 };

	public static void main(String[] args) {
		// System.out.println(birdsSold() + " birds sold.");
		// System.out.println("We have " + getBirdsCount("Duck") + " ducks.");
		// System.out.println("New delivery needed: " + Arrays.toString(needNewDelivery());
		// getAllInformation(birds);
//		System.out.println(birdsLeftOnStorage() + " birds left");
		time();
		System.out.println(moneyInVault(birds) + " $");
	}
	
	static void time() {
		long randomNumbers = System.currentTimeMillis();
		System.out.println(String.valueOf(randomNumbers));
		
		
	}

	static int birdsSold() {
		int result = 0;
		for (String[] arr : birds) {
			result += Integer.parseInt(arr[3]);

		}
		return result;
	}

	static int birdsLeftOnStorage() {
		int count = 0;
		for (String[] array : birds) {
			count += Integer.parseInt(array[1]);
		}
		return count;
	}

	static int moneyInVault(String[][] array) {
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
		for (String[] arr : birds) {
			if (type.equals(arr[0])) {
				return Integer.parseInt(arr[1]);
			}
		}
		return 0;
	}

	static String[] needNewDelivery() {
		System.out.println("     ---Need To deliver---       ");
		System.out.println();
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
		int k = 0;
		for (String[] s : array) {
			if (s != null) {
				System.out.println((k + 1) + ": " + Arrays.toString(s));
				k++;
			}

		}

	}

}
