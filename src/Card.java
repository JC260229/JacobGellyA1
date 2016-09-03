/**
 * Created by Jacob on 2/09/2016.
 */
public class Card {
    String name, classification, crystal, occurrence;
    float hardness, gravity;
    int cleavage, abundance, value;
    boolean superTrump = false;

    public Card(String name, float hardness, float gravity, int cleavage, int abundance, int value, String classification, String crystal, String occurrence){
        //card name
        this.name = name;

        //playing information
        this.hardness = hardness;
        this.gravity = gravity;
        this.cleavage = cleavage;
        this.abundance = abundance;
        this.value = value;

        //extra information
        this.classification = classification;
        this.crystal = crystal;
        this.occurrence = occurrence;
    }

    public Card(String name){
        //card name
        this.name = name;

        //playing information
        this.hardness = 0;
        this.gravity = 0;
        this.cleavage = 0;
        this.abundance = 0;
        this.value = 0;

        //extra information
        this.classification = "Supertrump";
        this.crystal = "Supertrump";
        this.occurrence = "Supertrump";
    }

    @Override
    public String toString() {
            return "- " + name + " -" +
                    "\nClassification: " + classification +
                    "\nCrystal system: " + crystal +
                    "\nOccurrence: " + occurrence +
                    "\nHardness: " + hardness +
                    "\nGravity: " + gravity +
                    "\nCleavage: " + cleavage +
                    "\nAbundance: " + abundance +
                    "\nValue: " + value +
                    "\n";
    }
}
