package day4.HomeworkLibrary;

public class Library {
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private Book[][] booksByName;
	private Book[][] booksByAuthor;
	private Book[][] booksByCategory;

	public Library() {
		booksByName = new Book[26][];
		fillDictionary(booksByName);

		booksByAuthor = new Book[26][];
		fillDictionary(booksByAuthor);

		booksByCategory = new Book[26][];
		fillDictionary(booksByCategory);

		createBooks();

	}
	public Book [] findByName (String name) {
		return new Book [0];
	}
	
	public Book [] findByAuthor (String name) {
		return new Book [0];
	}
	
	public Book [] findByCategory (Category category) {
		return booksByCategory[category.getId()];
		
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
