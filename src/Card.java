
public class Card {
    String superTrumpCategory;
    String name, classification, crystal, occurrence, cleavageDescription, abundanceDescription, valueDescription;
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
        superTrumpCategory = "none";
        //setting attribute descriptions
        setAttributeDescriptions();
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
        //setting attribute descriptions
        setAttributeDescriptions();
    }

    private void setAttributeDescriptions(){
        //setting cleavage description
        switch (cleavage){
            case 1:
                cleavageDescription = "none";
                break;
            case 2:
                cleavageDescription = "poor/none";
                break;
            case 3:
                cleavageDescription = "1 poor";
                break;
            case 4:
                cleavageDescription = "2 poor";
                break;
            case 5:
                cleavageDescription = "1 good";
                break;
            case 6:
                cleavageDescription = "1 good, 1 poor";
                break;
            case 7:
                cleavageDescription = "2 good";
                break;
            case 8:
                cleavageDescription = "3 good";
                break;
            case 9:
                cleavageDescription = "1 perfect";
                break;
            case 10:
                cleavageDescription = "1 perfect, 1 good";
                break;
            case 11:
                cleavageDescription = "1 perfect, 2 good";
                break;
            case 12:
                cleavageDescription = "2 perfect, 1 good";
                break;
            case 13:
                cleavageDescription = "3 perfect";
                break;
            case 14:
                cleavageDescription = "4 perfect";
                break;
            case 15:
                cleavageDescription = "6 perfect";
                break;
            default:
                cleavageDescription = "Supertrump";
        }

        //setting abundance description
        switch (abundance){
            case 1:
                abundanceDescription = "ultratrace";
                break;
            case 2:
                abundanceDescription = "trace";
                break;
            case 3:
                abundanceDescription = "low";
                break;
            case 4:
                abundanceDescription = "moderate";
                break;
            case 5:
                abundanceDescription = "high";
                break;
            case 6:
                abundanceDescription = "very high";
                break;
            default:
                abundanceDescription = "Supertrump";
        }

        //setting value description
        switch (value){
            case 1:
                valueDescription = "trivial";
                break;
            case 2:
                valueDescription = "low";
                break;
            case 3:
                valueDescription = "moderate";
                break;
            case 4:
                valueDescription = "high";
                break;
            case 5:
                valueDescription = "very high";
                break;
            case 6:
                valueDescription = "I'm rich!";
                break;
            default:
                valueDescription = "Supertrump";
        }
    }

    @Override
    public String toString() {
            return "\n--- " + name + " ---" +
                    "\nClassification: " + classification +
                    "\nCrystal system: " + crystal +
                    "\nOccurrence: \t" + occurrence +
                    "\nHardness: \t" + hardness +
                    "\nGravity: \t" + gravity +
                    "\nCleavage: \t" + cleavageDescription +
                    "\nAbundance: \t" + abundanceDescription +
                    "\nValue: \t\t" + valueDescription +
                    "\n------------------";
    }
}