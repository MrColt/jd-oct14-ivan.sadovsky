package day6;

public class TryBlock {

	public static void main(String[] args) {
		try {
			TryBlock.doThisForMe();
		} catch (InterruptedException e) {
			System.out.println("Do smth with e");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("print all the time");
		}

	}

	public static void doThisForMe() throws InterruptedException {
		Thread.sleep(-1000);
	}
}