package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/
	private final String Title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String title, int age) {
		super(title);
		this.Title = title;
		this.ageOfMainCharacter = age;
	}
	
	// TODO : create a getter if required.
	public String getTitle() {
		return this.Title;
	}

	public int getAge() {
		return this.ageOfMainCharacter;
	}
	// TODO: Create a setter if required

	// TODO: write a toString method
	@Override
	public String toString() {
		return "Title : " + this.Title + "\nAge of MainCharactor : " + this.ageOfMainCharacter;
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return this.Title.hashCode()+ageOfMainCharacter;
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		return this.Title.hashCode()==o.hashCode();
	}
}
