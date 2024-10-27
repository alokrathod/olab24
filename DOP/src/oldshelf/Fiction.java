package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/
	private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static FictionType type;
	public Fiction(String title, FictionType Tragedy) {
		this.name = title;
		Fiction.type = Tragedy;
		// TODO  correct the above.
	}

	public String getName() {
		return this.name;
	}

	public FictionType getType() {
		return Fiction.type;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + "\nFictional Type : " + type;
	}
}
