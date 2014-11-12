package day4.Objects.InfoDesk;

public class InfoDeskPrint {

	public static void main(String[] args) {

		bollard();
		height();
		length();
		compruter();
		mooveble();
		color();

	}

	static void bollard() {
		Desk m = new Desk();
		m.numbersBollard = 5;
		System.out.println("numbersBollard = " + m.numbersBollard);
	}

	static void height() {
		Desk m = new Desk();
		m.height = 1.5;
		System.out.println("height = " + m.height);
	}

	static void length() {
		Desk m = new Desk();
		m.length = 2;
		System.out.println("length = " + m.length);
	}

	static void compruter() {
		Desk m = new Desk();
		m.havingComputer = true;
		System.out.println("havingComputer = " + m.havingComputer);
	}

	static void mooveble() {
		Desk m = new Desk();
		m.mooveable = true;
		System.out.println("mooveable = " + m.mooveable);
	}

	static void color() {
		Desk m = new Desk();
		m.color = "grey";
		System.out.println("color = " + m.color);
	}

}
