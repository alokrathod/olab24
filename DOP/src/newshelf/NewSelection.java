package newshelf;


public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */

	// public static String getAgeOrTitle(Object o) {
		
	// 	if (o instanceof Comic) {
	// 		return ((Comic)o).title();
	// 	}
	// 	else if(o instanceof Fiction) {
	// 		return ((Fiction)o).name();
	// 	}
	// 	else if(o instanceof TextBook) {
	// 		return ((TextBook)o).subject();
	// 	}
	// 	return null;
	// }

	// // using type switches
	// public static String getAgeOrTitle(Object o) {
	// 	return switch (o) {
	// 		case Comic comic when comic.getAge() > 0 -> comic.title();
	// 		case Fiction fiction -> fiction.name();
	// 		case TextBook textBook -> textBook.subject();
	// 		default -> "";
	// 	};
	// }


	// using type switches and record patterns
	public static String getAgeOrTitle(Object o) {
		return switch(o) {
			case Comic(var Title,var ageOfMainCharacter) -> Title;
			case Fiction(var name) -> name;
			case TextBook(var subject) -> subject;
			default -> "";
		};
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
