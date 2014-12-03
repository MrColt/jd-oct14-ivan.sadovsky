package day4.HomeworkLibrary;

public class Library {
	
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private Book[][] booksByName = new Book[alphabet.length()][];
	private Book[][] booksByAuthor = new Book[alphabet.length()][];
	private Book[][] booksByCategory = new Book[6][];
	
	
	public Library() throws Exception {

		booksByName = new Book[26][];
		fillDictionary(booksByName);

		booksByAuthor = new Book[26][];
		fillDictionary(booksByAuthor);

		booksByCategory = new Book[26][];
		fillDictionary(booksByCategory);
		
		createBooks();
		
	}

	public void findBookByName(Book[][] bookArray, String bookName)
			throws Exception {

		int k = 0;
		System.out.println("			------SEARCH BY NAME------			");
		System.out.println();
		if (bookArray != null
				&& bookArray[alphabet.indexOf(bookName.charAt(0))] != null) {
			for (Book bookTemp : bookArray[alphabet.indexOf(bookName.charAt(0))]) {
				if (bookTemp != null) {
					if (bookTemp.getName().equals(bookName)) {
						System.out.println((k + 1) + ": " + bookTemp.getName()
								+ " || " + bookTemp.getAuthor() + " || "
								+ bookTemp.getCategory());
						k++;
					}

				}

			}
			if (k == 0) {
				System.out.println("Cant find name of book");
			}
		}
	}

	public void findBookByAuthor(Book[][] bookArray, String authorName)
			throws Exception {

		int k = 0;
		System.out.println("			------SEARCH BY AUTHOR------			");
		System.out.println();
		if (bookArray != null
				&& bookArray[alphabet.indexOf(authorName.charAt(0))] != null) {
			for (Book bookTemp : bookArray[alphabet.indexOf(authorName
					.charAt(0))]) {
				if (bookTemp != null) {
					if (bookTemp.getAuthor().equals(authorName)) {// object1.equals(object2)
						System.out.println((k + 1) + ": " + bookTemp.getName()
								+ " || " + bookTemp.getAuthor() + " || "
								+ bookTemp.getCategory());
						k++;
					}
				}

			}

			if (k == 0) {
				System.out.println("Cant find author");
			}

		}

	}

	public void findBookByCategory(Book[][] bookArray, Category category)
			throws Exception {

		int k = 0;
		System.out.println("	------SEARCH BY CATEGORY------			");
		System.out.println();
		if (bookArray != null && bookArray[category.getId()] != null) {
			for (Book bookTemp : bookArray[category.getId()]) {
				if (bookTemp != null) {
					if (bookTemp.getCategory().equals(category)) {// object1.equals(object2)
						System.out.println((k + 1) + ": " + bookTemp.getName()
								+ " || " + bookTemp.getAuthor() + " || "
								+ bookTemp.getCategory());
						k++;
					}
				}

			}

			if (k == 0) {
				System.out.println("Cant find category");
			}
		}

	}

	private void fillDictionary(Book[][] dictionary) {
		for (int index = 0; index < dictionary.length; index++) {
			dictionary[index] = new Book[10];
		}

	}

	public void addToLibrary(Book book) {
		int position = alphabet.indexOf(book.getName().charAt(0));
		addToStorage(booksByName[position], book);

		position = alphabet.indexOf(book.getAuthor().charAt(0));
		addToStorage(booksByAuthor[position], book);

		addToStorage(booksByCategory[book.getCategory().getId()], book);
	}

	private void addToStorage(Book[] storage, Book book) {
		for (int index = 0; index < storage.length; index++) {
			if (storage[index] == null) {
				storage[index] = book;
				return;

			}

		}

	}

	public void printLibrary(Book[][] bookArray) throws Exception {

		int count = 0;
		System.out.println("	  ------ALL BOOKS IN LIBRARY------		");
		System.out.println();
		for (Book[] shelf : bookArray) {
			if (shelf != null) {
				for (Book book : shelf) {
					if (book != null) {
						count++;
						System.out.println(count + ": " + book.getName()
								+ " || " + book.getAuthor() + " || "
								+ book.getCategory());

					}
				}
			}
		}
	}

	private void createBooks() throws Exception {
		AllBooks books = new AllBooks();


	}

	public Book[][] getLibraryByAuthorName() {
		return booksByAuthor;
	}

	public Book[][] getLibraryByBookName() {
		return booksByName;
	}

	public Book[][] getLibraryByCategory() {
		return booksByCategory;
	}

}
