package bonus;


public record Comic(String title, int ageOfMainCharacter) implements IBook<String, Comic> {
    public String printName() {
        return title;
    }

    public int compareTo(Comic comic) {
        return this.ageOfMainCharacter - comic.ageOfMainCharacter;
    }
}
