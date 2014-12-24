package day6;

public class ExceptionTest {

	public static void main(String[] args) {

		catcher();
		System.out.println("done");

	}

	public static void catcher() {
		try {
			throw new Exception();
		} catch (Exception e) {
			throw new IllegalStateException();
		} finally {
			System.out.println("I want to be printed!");
		}
	}
}
