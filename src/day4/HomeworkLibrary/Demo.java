package day4.HomeworkLibrary;

public class Demo {

	public static void main(String[] args) throws Exception {

		Library library = new Library();
		Book book[] = new Book[100];
		
		
		book[0] = new Book("Just Mary", "Angelina Martynova", Category.DRAMA);
		library.addToLibrary(book[0]);
		book[1] = new Book("My second mother", "Abel Santa Crus",
				Category.DRAMA);
		library.addToLibrary(book[1]);
		book[2] = new Book("Sarmat", "Alexander Zvyagintsev", Category.DRAMA);
		library.addToLibrary(book[2]);
		book[3] = new Book("Last permission", "Albertas Kazevich",
				Category.DRAMA);
		library.addToLibrary(book[3]);
		book[4] = new Book("Twins", "Andrey Anisimov", Category.DRAMA);
		library.addToLibrary(book[4]);
		book[5] = new Book("Master and Margaryte", "Mikhail Bulgakov",
				Category.MYTHS);
		library.addToLibrary(book[5]);
		book[6] = new Book("Hero should be only one", "Henry Layon Oldy",
				Category.MYTHS);
		library.addToLibrary(book[6]);
		book[7] = new Book("Siddharta", "Herman Hesse", Category.MYTHS);
		library.addToLibrary(book[7]);
		book[8] = new Book("Quitters, Inc", "Stiven King", Category.THRILLER);
		library.addToLibrary(book[8]);
		book[9] = new Book("The Long Walk", "Stiven King", Category.THRILLER);
		library.addToLibrary(book[9]);
		book[10] = new Book("The Silence of the Lambs", "Tomas Harris",
				Category.THRILLER);
		library.addToLibrary(book[10]);
		book[11] = new Book("Psysho", "Robert Bloh", Category.THRILLER);
		library.addToLibrary(book[11]);
		book[12] = new Book("Fight Club", "Chuk Palanik", Category.THRILLER);
		library.addToLibrary(book[12]);
		book[13] = new Book("Sherlock Holmes", "Artur Konan Doel",
				Category.ADVENTURE);
		library.addToLibrary(book[13]);
		book[14] = new Book("A Storm of Swords", "George R.R. Martyn",
				Category.ADVENTURE);
		library.addToLibrary(book[14]);
		book[15] = new Book("Treasure Island, or the Mutiny of the Hispaniola",
				"Robert Luis Stivenson", Category.ADVENTURE);
		library.addToLibrary(book[15]);
		book[16] = new Book(
				"Through the Looking Glass and What Alice Found There",
				"Luis Kerrol", Category.ADVENTURE);
		library.addToLibrary(book[16]);
		book[17] = new Book("White Fang", "Jack London", Category.ADVENTURE);
		library.addToLibrary(book[17]);
		book[18] = new Book("Flowers for Algernon", "Daniel Kiz",
				Category.FANTASY);
		library.addToLibrary(book[18]);
		book[19] = new Book("There Will Come Soft Rains", "Rei Bredbary",
				Category.FANTASY);
		library.addToLibrary(book[19]);
		book[20] = new Book("Capitaine Nemo", "Jul Verne", Category.FANTASY);
		library.addToLibrary(book[20]);
		book[21] = new Book("Something for Nothing", "Robert Shekli",
				Category.FANTASY);
		library.addToLibrary(book[21]);
		book[22] = new Book("Hyperion", "Den Simmons", Category.FANTASY);
		library.addToLibrary(book[22]);
		book[23] = new Book("The Terror", "Den Simmons", Category.HORROR);
		library.addToLibrary(book[23]);
		book[24] = new Book("The Sandman", "Neil Gayman", Category.HORROR);
		library.addToLibrary(book[24]);
		book[25] = new Book("It", "Styphen King", Category.HORROR);
		library.addToLibrary(book[25]);
		book[26] = new Book("Shining", "Styphen King", Category.HORROR);
		library.addToLibrary(book[26]);
		book[27] = new Book("Misery", "Styphen King", Category.HORROR);
		library.addToLibrary(book[27]);
		book[28] = new Book("Myths of ancients", "Alexander Nemyrovsky",
				Category.MYTHS);
		library.addToLibrary(book[28]);
		book[29] = new Book("Harry Potter", "Joan Rowling", Category.FANTASY);
		library.addToLibrary(book[29]);

		library.printLibrary(library.getLibraryByCategory());
		// library.findBookByName(library.getLibraryByBookName(), "Twins");
		// library.findBookByAuthor(library.getLibraryByAuthorName(),
		// "Tomas Harris");
		// library.findBookByCategory(library.getLibraryByCategory(),
		// Category.HORROR);

	}

}
