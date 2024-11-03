package oldshelf;

public abstract class Book {

	String title;
	public Book(String title) {
		this.title = title;
		// TODO: Finish Code here if anything to be done?
	}

	@Override
	public String toString() {
		return "Title : " + title;
	}
}
