package day4.Objects.InfoNotebook;

public class InfoNotebookPrint {

	public static void main(String[] args) {

		state();
		year();
		buttons();
		system();
		firm();

	}

	static void state() {
		Notebook m = new Notebook();
		m.state = "new";
		System.out.println("state = " + m.state);
	}

	static void year() {
		Notebook m = new Notebook();
		m.year = 2014;
		System.out.println("year = " + m.year);
	}

	static void buttons() {
		Notebook m = new Notebook();
		m.havingAllButtons = true;
		System.out.println("havingAllButtons = " + m.havingAllButtons);
	}

	static void system() {
		Notebook m = new Notebook();
		m.operationSystem = "Windows 7";
		System.out.println("operationSystem = " + m.operationSystem);
	}

	static void firm() {
		Notebook m = new Notebook();
		m.firm = "Dell";
		System.out.println("firm = " + m.firm);

	}
}
