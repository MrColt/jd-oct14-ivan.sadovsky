package day6.hw;

public class returns {

	public static void main(String[] args) {
		catcher();
		System.err.println("done");
	}

	public static void catcher() {
		try {
			return;
		} catch (Exception c) {
			c.printStackTrace();
		} finally {
			System.out.println("I want to be executed!");
		}

	}

}
