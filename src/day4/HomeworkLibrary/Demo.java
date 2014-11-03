package day4.HomeworkLibrary;

public class Demo {

	public static void main(String[] args) {
		Library laun = new Library();
		for (Book book : laun.findByCategory(Category.MYTHS)) {
			if (book != null) {
				System.out.println(book.getName());

			}
		}
	}
}
