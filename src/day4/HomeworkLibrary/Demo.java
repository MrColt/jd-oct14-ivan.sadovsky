package day4.HomeworkLibrary;

public class Demo {

	public static void main(String[] args) {
		Library laun = new Library();
		for (Book book : laun.findByCategory(Category.DRAMA)) {
			if (book != null) {
				System.out.println("Name Of Book -- " + book.getName());
				System.out.println("Name Of Author -- " + book.getAuthor());
				System.out.println();

			}
		}
	}
}
