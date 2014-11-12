package day4.Objects.InfoPen;

public class InfoPenPrint {

	public static void main(String[] args) {

		color();
		transparent();
		spring();
		state();
		length();
		width();

	}

	static void color() {
		Pen m = new Pen();
		m.color = "blue";
		System.out.println("color = " + m.color);
	}

	static void transparent() {
		Pen m = new Pen();
		m.transparent = true;
		System.out.println("transparent = " + m.transparent);
	}

	static void spring() {
		Pen m = new Pen();
		m.spring = false;
		System.out.println("spring = " + m.spring);
	}

	static void state() {
		Pen m = new Pen();
		m.state = "new";
		System.out.println("state = " + m.state);
	}

	static void length() {
		Pen m = new Pen();
		m.length = 5;
		System.out.println("length = " + m.length + " cm");
	}

	static void width() {
		Pen m = new Pen();
		m.width = 0.5;
		System.out.println("width = " + m.width + " mm");
	}

}
