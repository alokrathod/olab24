package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/
	private String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static FictionType type;
	public Fiction(String title) {
		super(title);
		this.name = title;
		// TODO  correct the above.
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FictionType getType() {
		return type;
	}

	public static void setType(FictionType fictiontype) {
		type = fictiontype;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + "\nFictional Type : " + type;
	}
}
