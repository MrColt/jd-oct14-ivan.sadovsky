package day4.HomeworkLibrary;

public class Demo {

	public static void main(String[] args) throws Exception{
		Library library = new Library();
//		library.findBookByCategory(library.getLibraryByCategory(), Category.DRAMA);
//		library.printLibrary(library.getLibraryByCategory());
		library.findBookByAuthor(library.getLibraryByAuthorName(), "Alexander Zvyagintsev");
 		library.printLibrary(library.getLibraryByAuthorName());	
		
			}
		
	}

