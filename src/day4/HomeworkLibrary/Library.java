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
		b.setName("Master and Margaryte");
		b.setAuthor("Mikhail Bulgakov");
		b.setCategory(Category.MYTHS);
		addToLibrary(b);

		b = new Book();
		b.setName("Ahyiskyy Cykl");
		b.setAuthor("Henry Layon Oldy");
		b.setCategory(Category.MYTHS);
		addToLibrary(b);

		b = new Book();
		b.setName("Hero should be only one");
		b.setAuthor("Henry Layon Oldy");
		b.setCategory(Category.MYTHS);
		addToLibrary(b);

		b = new Book();
		b.setName("Siddharta");
		b.setAuthor("Herman Hesse");
		b.setCategory(Category.MYTHS);
		addToLibrary(b);

		b = new Book();
		b.setName("Quitters, Inc");
		b.setAuthor("Stiven King");
		b.setCategory(Category.THRILLER);
		addToLibrary(b);

		b = new Book();
		b.setName("The Long Walk");
		b.setAuthor("Stiven King");
		b.setCategory(Category.THRILLER);
		addToLibrary(b);

		b = new Book();
		b.setName("The Silence of the Lambs");
		b.setAuthor("Tomas Harris");
		b.setCategory(Category.THRILLER);
		addToLibrary(b);

		b = new Book();
		b.setName("Psycho");
		b.setAuthor("Robert Bloh");
		b.setCategory(Category.THRILLER);
		addToLibrary(b);

		b = new Book();
		b.setName("Fight Club");
		b.setAuthor("Chuk Palanik");
		b.setCategory(Category.THRILLER);
		addToLibrary(b);

		b = new Book();
		b.setName("Sherlock Holmes");
		b.setAuthor("Artur Konan Doel");
		b.setCategory(Category.ADVENTURE);
		addToLibrary(b);

		b = new Book();
		b.setName("A Storm of Swords");
		b.setAuthor("George R.R. Martyn");
		b.setCategory(Category.ADVENTURE);
		addToLibrary(b);

		b = new Book();
		b.setName("Treasure Island, or the Mutiny of the Hispaniola");
		b.setAuthor("Robert Luis Stivenson");
		b.setCategory(Category.ADVENTURE);
		addToLibrary(b);

		b = new Book();
		b.setName("Through the Looking Glass and What Alice Found There");
		b.setAuthor("Luis Kerrol");
		b.setCategory(Category.ADVENTURE);
		addToLibrary(b);

		b = new Book();
		b.setName("White Fang");
		b.setAuthor("Jack London");
		b.setCategory(Category.ADVENTURE);
		addToLibrary(b);

		b = new Book();
		b.setName("Flowers for Algernon");
		b.setAuthor("Daniel Kiz");
		b.setCategory(Category.FANTASY);
		addToLibrary(b);

		b = new Book();
		b.setName("There Will Come Soft Rains");
		b.setAuthor("Rei Bredbary");
		b.setCategory(Category.FANTASY);
		addToLibrary(b);

		b = new Book();
		b.setName("Capitaine Nemo");
		b.setAuthor("Jul Verne");
		b.setCategory(Category.FANTASY);
		addToLibrary(b);

		b = new Book();
		b.setName("Something for Nothing");
		b.setAuthor("Robert Shekli");
		b.setCategory(Category.FANTASY);
		addToLibrary(b);

		b = new Book();
		b.setName("Hyperion");
		b.setAuthor("Den Simmons");
		b.setCategory(Category.FANTASY);
		addToLibrary(b);

		b = new Book();
		b.setName("The Terror");
		b.setAuthor("Den Simmons");
		b.setCategory(Category.HORROR);
		addToLibrary(b);

		b = new Book();
		b.setName("The Sandman");
		b.setAuthor("Neil Gayman");
		b.setCategory(Category.HORROR);
		addToLibrary(b);

		b = new Book();
		b.setName("It");
		b.setAuthor("Styphen King");
		b.setCategory(Category.HORROR);
		addToLibrary(b);

		b = new Book();
		b.setName("Shining");
		b.setAuthor("Styphen King");
		b.setCategory(Category.HORROR);
		addToLibrary(b);

		b = new Book();
		b.setName("Misery");
		b.setAuthor("Styphen King");
		b.setCategory(Category.HORROR);
		addToLibrary(b);
		
		b = new Book();
		b.setName("Myths of ancients");
		b.setAuthor("Alexander Nemyrovsky");
		b.setCategory(Category.MYTHS);
		addToLibrary(b);

	}

}
