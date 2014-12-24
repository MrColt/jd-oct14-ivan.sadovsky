package day7.hashmap;

import java.util.HashMap;
import java.util.Map;

import day7.hashcodeadress.Adress;

public class Person {
	private String name;
	private int age;
	private long salary;
	private String city;
	private String adress;
	private int house;

	public Person(String name, int age, int salary, String city, String adress,
			int house) {
		this.name = name;
		this.age = age;
		salary = 1000;
		this.city = city;
		this.adress = adress;
		this.house = house;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (name != null && name.equals(p.name) && p.age == age
					&& p.salary == salary) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 25;
		result = 37 * result + name.hashCode();
		result = 37 * result + age;
		result = 37 * result + new Long(salary).hashCode();
		return result;
		// copy implementation
		// public int hashCode() {
		// return (int)(value ^ (value >>> 32));
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("Ivan Ivanov", 23, 1000, "Kiev", "Velyka valka", 5);
		Person p2 = new Person("Igor Olegovich", 33, 1300, "Chernigov", "Troeshina", 5);
		Person p3 = new Person("Victor Igorevich", 23, 2000, "Donetsk", "Obolon", 5);

		System.out.println("Check p1 == p2 ?: " + p1.equals(p2));
		System.out.println("HashCode #1 and #2: " + p1.hashCode() + " " + p2.hashCode());
		System.out.println("Key of Person #1: " + p1);
		System.out.println();
		
		Map<String, Person> hm = new HashMap<>(); // String - Key, Person - Value

		hm.put(p1.name, p1);
		hm.put(p2.name, p2);
		hm.put(p3.name, p3);
		
		System.out.println("Check HashMap contains Person #3?: " + hm.containsValue(p3));
		System.out.println("Check HashMap contains key of Person #2?: " + hm.containsKey(p2.name));
		System.out.println();

		for (String key : hm.keySet()) {
			System.out.println("key: " + key);
		}
		System.out.println();

		for (Person value : hm.values()) {
			System.out.println("Value: " + value.name + " " + value.age + " "
					+ value.salary);
		}
		System.out.println();

		for (Map.Entry<String, Person> me : hm.entrySet()) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

	}
}
