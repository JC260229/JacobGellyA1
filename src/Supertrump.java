/**
 * Created by Jacob on 2/09/2016.
 */
public class Supertrump extends Card{
    String superTrumpcCategory;

    public Supertrump(String name, String superTrumpCatagory){
        super(name);
        this.superTrump = true;
        this.superTrumpcCategory = superTrumpCatagory;

    }

    @Override
    public String toString() {
        return "- " + name + " -" +
                "\nCategory changed to: " + this.superTrumpcCategory + "\n";
    }
}
