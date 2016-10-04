import java.util.*;

public class Deck {
    private ArrayList<Card> cardDeck = new ArrayList<>();

    public Deck(){
        buildDeck();
    }


    public Card getCard(){
        //If the deck has a card
        if(cardDeck.size() > 0){
            Random rand = new Random();
            //Choose the card
            int cardNumber = rand.nextInt(cardDeck.size());
            Card tempCard = cardDeck.get(cardNumber);
            //Remove the card from the deck
            cardDeck.remove(cardNumber);
            //Deal the card
            return tempCard;
        } else {
            System.out.println("No cards left");
            return null;
        }
    }

    public Card[] getHand(){
        //initialize hand primitive array for 8 cards
        Card[] hand = new Card[8];
        Random rand = new Random();
        //pick 8 random cards from the deck
        for(int i = 0; i < 8; i++){
            int cardNumber = rand.nextInt(cardDeck.size());
            hand[i] = cardDeck.get(cardNumber);
            cardDeck.remove(cardNumber);
        }
        return hand;
    }

    private void buildDeck(){
        cardDeck.add(new Card("Quartz", 7f, 2.65f, 2, 5, 3, "tectosilicate", "hexagonal", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Plagioclase", 6.5f, 2.8f, 10, 6, 3, "tectosilicate", "triclinic", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Orthoclase", 6.5f, 2.6f, 10, 5, 3, "tectosilicate", "monoclinic", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Biotite", 3f, 3.3f, 9, 4, 2, "phyllosilicate", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Muscovite", 3f, 2.9f, 9, 4, 3, "phyllosilicate", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Hornblende", 6f, 3.5f, 7, 4, 1, "inosilicate", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Actinolite", 6f, 3.5f, 7, 3, 2, "inosilicate", "monoclinic", "metamorphic"));
        cardDeck.add(new Card("Glaucophane", 6f, 3.2f, 7, 3, 1, "inosilicate", "monoclinic", "metamorphic"));
        cardDeck.add(new Card("Olivine", 7f, 4.4f, 4, 5, 2, "nesosilicate", "orthorhombic", "igneous, metamorphic, mantle"));
        cardDeck.add(new Card("Garnet", 7.5f, 4.3f, 1, 4, 3, "nesosilicate", "isometric", "igneous, metamorphic, mantle"));
        cardDeck.add(new Card("Titanite", 5.5f, 3.6f, 8, 3, 2, "nesosilicate", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Zircon", 7.5f, 4.7f, 4, 2, 3, "nesosilicate", "tetragonal", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Augite", 6.5f, 3.6f, 7, 5, 1, "inosilicate", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Orthopyroxene", 6f, 3.9f, 7, 5, 1, "inosilicate", "orthorhombic", "igneous, metamorphic, mantle"));
        cardDeck.add(new Card("Chlorite", 3f, 3.3f, 9, 4, 2, "phyllosilicate", "monoclinic", "metamorphic"));
        cardDeck.add(new Card("Antigorite", 4f, 2.6f, 9, 3, 2, "phyllosilicate", "monoclinic", "metamorphic, mantle"));
        cardDeck.add(new Card("Talc", 1f, 2.8f, 9, 3, 3, "phyllosilicate", "monoclinic", "metamorphic"));
        cardDeck.add(new Card("Kaolinite", 2.5f, 2.7f, 9, 4, 4, "phyllosilicate", "triclinic", "sedimentary"));
        cardDeck.add(new Card("Andalusite", 7f, 3.15f, 7, 3, 3, "nesosilicate", "orthorhombic", "metamorphic"));
        cardDeck.add(new Card("Kyanite", 7f, 3.7f, 10, 2, 3, "nesosilicate", "triclinic", "metamorphic"));
        cardDeck.add(new Card("Sillimanite", 7.5f, 3.25f, 10, 3, 2, "nesosilicate", "orthorhombic", "igneous, metamorphic"));
        cardDeck.add(new Card("Staurolite", 7f, 3.8f, 5, 2, 2, "nesosilicate", "monoclinic", "metamorphic"));
        cardDeck.add(new Card("Epidote", 6.5f, 3.5f, 9, 4, 1, "sorosilicate", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Tourmaline", 7.5f, 3.2f, 4, 2, 3, "cyclosilicate", "hexagonal", "metamorphic"));
        cardDeck.add(new Card("Topaz", 8f, 3.6f, 9, 1, 2, "nesosilicate", "orthorhombic", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Beryl", 8f, 2.9f, 3, 2, 3, "cyclosilicate", "hexagonal", "igneous, metamorphic"));
        cardDeck.add(new Card("Pyrite", 6.5f, 5f, 4, 3, 3, "sulfide", "isometric", "igneous, metamorphic"));
        cardDeck.add(new Card("Pyrrhotite", 4.5f, 4.6f, 1, 3, 3, "sulfide", "monoclinic", "igneous, metamorphic"));
        cardDeck.add(new Card("Chalcopyrite", 4f, 4.3f, 4, 3, 5, "sulfide", "tetragonal", "igneous, metamorphic"));
        cardDeck.add(new Card("Galena", 2.5f, 7.6f, 13, 2, 4, "sulfide", "isometric", "metamorphic"));
        cardDeck.add(new Card("Sphalerite", 4f, 4.1f, 15, 2, 4, "sulfide", "isometric", "metamorphic"));
        cardDeck.add(new Card("Molybdenite", 1.5f, 4.7f, 9, 2, 4, "sulfide", "hexagonal", "igneous, metamorphic"));
        cardDeck.add(new Card("Gold", 3f, 19.3f, 1, 1, 6, "native element", "isometric", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Diamond", 10f, 3.5f, 14, 1, 6, "native element", "isometric", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Graphite", 2f, 2.2f, 9, 2, 3, "native element", "hexagonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Halite", 2.5f, 2.2f, 13, 2, 3, "halide", "isometric", "sedimentary"));
        cardDeck.add(new Card("Fluorite", 4f, 3.2f, 14, 2, 3, "halide", "isometric", "metamorphic"));
        cardDeck.add(new Card("Gypsum", 2f, 2.3f, 11, 2, 4, "sulfide", "monoclinic", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Barite", 3.5f, 4.5f, 12, 2, 3, "sulfide", "orthorhombic", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Apatite", 5f, 3.2f, 4, 3, 4, "phosphate", "hexagonal", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Monazite", 5f, 5.3f, 6, 2, 3, "phosphate", "monoclinic", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Calcite", 3f, 2.7f, 13, 4, 4, "carbonate", "hexagonal", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Dolomite", 4f, 2.9f, 13, 3, 2, "carbonate", "hexagonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Magnesite", 4f, 3f, 13, 3, 3, "carbonate", "hexagonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Siderite", 4.5f, 4f, 13, 2, 3, "carbonate", "hexagonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Magnetite", 6f, 5.2f, 1, 4, 5, "oxide", "isometric", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Hematite", 6f, 5.3f, 1, 2, 4, "oxide", "hexagonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Chromite", 5.5f, 5.1f, 1, 3, 4, "oxide", "isometric", "igneous, sedimentary"));
        cardDeck.add(new Card("Ilmenite", 6f, 4.8f, 1, 3, 3, "oxide", "hexagonal", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Rutile", 6.5f, 4.3f, 7, 3, 4, "oxide", "tetragonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Corundum", 9f, 4f, 1, 2, 3, "oxide", "hexagonal", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Cassiterite", 7f, 7.1f, 6, 2, 4, "oxide", "tetragonal", "igneous, metamorphic, sedimentary"));
        cardDeck.add(new Card("Gibbsite", 3.5f, 2.4f, 9, 3, 4, "hydroxide", "monoclinic", "metamorphic, sedimentary"));
        cardDeck.add(new Card("Goethite", 5.5f, 4.3f, 10, 4, 3, "hydroxide", "orthorhombic", "sedimentary"));
        cardDeck.add(new Supertrump("The Geologist", "anything"));
        cardDeck.add(new Supertrump("The Geophysicist", "gravity"));
        cardDeck.add(new Supertrump("The Mineralogist", "cleavage"));
        cardDeck.add(new Supertrump("The Gemmologist", "hardness"));
        cardDeck.add(new Supertrump("The Petrologist", "abundance"));
        cardDeck.add(new Supertrump("The Miner", "value"));
        //Printing deck to console
        for(Card tempCard: cardDeck){
            System.out.println(tempCard.toString());
        }
        System.out.println("-------------------------------\nDeck created\n-------------------------------\n\n");
    }
}
