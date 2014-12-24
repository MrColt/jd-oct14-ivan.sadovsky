package day7.sorting;

import java.util.*;

public class SortedList {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList();
		names.add("James");
		names.add("Victor");
		names.add("Alladin");
		names.add("Kate");
		names.add("Ivan");
		names.add("Oleg");
		names.add("Jackie");
		names.add("Masha");
		names.add("Alex");
		
		
		Collections.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Collections.sort(names, new Comparator<String>() {
			public int compare(String o1, String o2) {
				int result = o1.compareToIgnoreCase(o2);
				if (result < 0) {
					return 1;
				} else if (result > 0) {
					return -1;
				}
				return 0;
			};
		});
		
		System.out.println();
		System.out.println();
		for (String name : names) {
			System.out.println(name);
		}
	}

}
