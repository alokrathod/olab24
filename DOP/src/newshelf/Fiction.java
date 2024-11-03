package newshelf;
import oldshelf.FictionType;


public record Fiction(String name) implements IBook {
    private static FictionType type;

    public FictionType getType() {
        return type;
    }

    public static void setType(FictionType fictionType) {
        type = fictionType;
    }
}
