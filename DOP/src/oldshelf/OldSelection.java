package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */

	// public static String getAgeOrTitle(Object o) {
		
	// 	if (o instanceof Book) {
	// 		if(o instanceof Comic) {
	// 			return ((Comic)o).getTitle();
	// 		}
	// 		else if(o instanceof Fiction) {
	// 			return ((Fiction)o).getName();
	// 		}
	// 		else if(o instanceof TextBook) {
	// 			return ((TextBook)o).getSubject();
	// 		}
	// 	}
	// 	return null;
	// }

	public static String getAgeOrTitle(Object o) {
		switch(o) {
			case Comic comic:
				return comic.getTitle();
			
			case Fiction fiction:
				return fiction.getName();

			case TextBook textBook:
				return textBook.getSubject();
			
			default:
				return "";
		}
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook textbook = new TextBook("OOPs in Java");
		Comic comic = new Comic("Solo Levelling", 25);
		Fiction fiction = new Fiction("Oedipus Rex");
		System.out.println("Verifying ToString method of books : ");
		System.out.println(textbook.toString());
		System.out.println(comic.toString());
		System.out.println(fiction.toString());
		

		System.out.println("Using  getAgeorTItle method : ");
		System.out.println("getting  getAgeorTItle for textbook : " + getAgeOrTitle(textbook));
		System.out.println("getting  getAgeorTItle for comic: " + getAgeOrTitle(comic));
		System.out.println("getting  getAgeorTItle for Fiction : " + getAgeOrTitle(fiction));
		
	}
}
