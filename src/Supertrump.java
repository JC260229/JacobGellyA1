
public class Supertrump extends Card{

    public Supertrump(String name, String superTrumpCategory){
        super(name);
        this.superTrump = true;
        this.superTrumpCategory = superTrumpCategory;
    }

    @Override
    public String toString() {
        return "\n--- " + name + " ---" +
                "\nCategory change: " + this.superTrumpCategory + "\n------------------";
    }
}
