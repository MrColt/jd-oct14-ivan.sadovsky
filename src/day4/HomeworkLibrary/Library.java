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
		String result = null;
		if (bookArray != null
				&& bookArray[alphabet.indexOf(bookName.charAt(0))] != null) {
			for (Book bookTemp : bookArray[alphabet.indexOf(bookName.charAt(0))]) {
				if (bookTemp != null) {
					if (bookTemp.getName().equals(bookName)) {
						result = bookTemp.getName() + " "
								+ bookTemp.getAuthor() + " "
								+ bookTemp.getCategory();
						break;
					} else
						result = "Cant find name";
				}

			}

			System.out.println(result);
		}
	}

	public void findBookByAuthor(Book[][] bookArray, String authorName)
			throws Exception {

		int k = 0;
		if (bookArray != null
				&& bookArray[alphabet.indexOf(authorName.charAt(0))] != null) {
			for (Book bookTemp : bookArray[alphabet.indexOf(authorName
					.charAt(0))]) {
				if (bookTemp != null) {
					if (bookTemp.getAuthor().equals(authorName)) {
						System.out.println((k + 1) + ": " + bookTemp.getName()
								+ " " + bookTemp.getAuthor() + " "
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
		if (bookArray != null && bookArray[category.getId()] != null) {
			for (Book bookTemp : bookArray[category.getId()]) {
				if (bookTemp != null) {
					if (bookTemp.getCategory().equals(category)) {
						System.out.println((k + 1) + ": " + bookTemp.getName()
								+ " " + bookTemp.getAuthor() + " "
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

	private void addToLibrary(Book book) {
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

	public String[] getAuthorOfBook(Book[] booksArray) {
		String[] authorNames = new String[booksArray.length];
		int i = 0;
		authorNames[0] = booksArray[0].getAuthor();
		for (Book bookTemp : booksArray) {
			if (!bookTemp.getAuthor().equals(authorNames[i])) {
				boolean mark = false;
				for (int k = 0; k < authorNames.length
						&& authorNames[k] != null; k++) {
					if (authorNames[k] == bookTemp.getAuthor()) {
						mark = true;
						break;
					}
				}
				if (!mark) {
					i++;
					authorNames[i] = bookTemp.getAuthor();

				}
				
			}

		}
		return authorNames;
	}

	public int getNumberOfElements(Book[] booksArray) {
		int number = 0;

		if (booksArray != null) {
			for (Book BookTemp : booksArray) {
				if (BookTemp != null) {
					number++;
				}
			}

		}

		return number;
	}
	public void printLibrary(Book[][] bookArray) throws Exception {

		int count = 0;

		for (Book[] shelf : bookArray) {
			if (shelf != null) {
				for (Book book : shelf) {
					if (book != null) {
						count++;
						System.out.println(count + ": " + book.getName() + " "
								+ book.getAuthor() + " " + book.getCategory());
					}
				}
			}
		}

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

	
	private void createBooks() {
		Book b = new Book();
		b.setName("Just Mary");
		b.setAuthor("Angelina Martynova");
		b.setCategory(Category.DRAMA);
		addToLibrary(b);

		b = new Book();
		b.setName("My second mother");
		b.setAuthor("Abel Santa Crus");
		b.setCategory(Category.DRAMA);
		addToLibrary(b);

		b = new Book();
		b.setName("Sarmat");
		b.setAuthor("Alexander Zvyagintsev");
		b.setCategory(Category.DRAMA);
		addToLibrary(b);

		b = new Book();
		b.setName("Last permission");
		b.setAuthor("Albertas Kazevich");
		b.setCategory(Category.DRAMA);
		addToLibrary(b);

		b = new Book();
		b.setName("Twins");
		b.setAuthor("Andrey Anisimov");
		b.setCategory(Category.DRAMA);
		addToLibrary(b);

		b = new Book();
		b.setName("Myths of ancients");
		b.setAuthor("Alexander Nemyrovsky");
		b.setCategory(Category.MYTHS);
		addToLibrary(b);

	}

}
