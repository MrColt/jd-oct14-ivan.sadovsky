package JavaDay;

public class test {

	public static void main(String[] args) {

		Index("Ivan", 10);

	}

	public static void Index (String name, int index) {
		int i = 0;
		while (index <= 10) {
			i++;
			System.out.println(name);
				if ( i >= 10 ){
					break;
				}
			}
		}
	}
