import java.util.*;

public class Player {
    public int position;
    public ArrayList<Card> hand;
    public boolean hasCard;

    public Player(Card[] givenHand, int position){
        hand = new ArrayList<>(Arrays.asList(givenHand));
        hasCard = true;
        this.position = position;
    }


    public Card userTurn(Card topCard, String category){
        System.out.println("you have " + hand.size() + " cards");
        System.out.println("Here is your hand:");
        //showing user hand
        int i = 0;
        for (Card displayCard : hand) {
            System.out.println(displayCard);
            System.out.println("Card number: " + i);
            i++;
        }
        if(canPlay(topCard, category)) {
            System.out.println("\nYou can play a card!");
            System.out.println("It is your turn, the category is " + category);
            int cardChoice = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter Card number of choice: ");
                cardChoice = Interface.getValidInt();
                if (cardChoice < (hand.size()) && cardChoice >= 0) {
                    if (checkChoice(hand.get(cardChoice), topCard, category)) {
                        validInput = true;
                    } else {
                        System.out.println("card not allowed to be placed");
                    }
                } else {
                    System.out.println("Not in range");
                }
            }
            Card tempCard = hand.get(cardChoice);
            hand.remove(cardChoice);
            return tempCard;
        } else {
            System.out.println("You can not make a move and must pick up!");
            return null;
        }
    }

    public Card userTurn(){
        System.out.println("you have " + hand.size() + " cards");
        System.out.println("Here is your hand:");
        //showing user hand
        int i = 0;
        for (Card displayCard : hand) {
            System.out.println(displayCard);
            System.out.println("Card number: " + i);
            i++;
        }
        int cardChoice = 0;
        boolean validInput = false;
        System.out.println("First play!");
        while (!validInput) {
            System.out.print("Enter Card number of choice: ");
            cardChoice = Interface.getValidInt();
            if (cardChoice < (hand.size()) && cardChoice >= 0) {
                validInput = true;
            } else {
                System.out.println("Not in range");
            }
        }
        Card tempCard = hand.get(cardChoice);
        hand.remove(cardChoice);
        return tempCard;
    }

    private boolean canPlay(Card card, String category){
        for (Card temp : hand){
            if(checkChoice(temp, card, category)){
                return true;
            }
        }
        for (Card temp : hand){
            if(temp.superTrump){
                return true;
            }
        }
        return false;
    }

    private boolean checkChoice(Card test, Card topCard, String category){
        switch (category){
            case "hardness":
                if(topCard.hardness < test.hardness){
                    return true;
                }
                if(test.superTrump){
                    return true;
                }
                break;
            case "gravity":
                if(topCard.gravity < test.gravity){
                    return true;
                }
                if(test.superTrump){
                    return true;
                }
                break;
            case "cleavage":
                if(topCard.cleavage < test.cleavage){
                    return true;
                }
                if(test.superTrump){
                    return true;
                }
                break;
            case "abundance":
                if(topCard.abundance < test.abundance){
                    return true;
                }
                if(test.superTrump){
                    return true;
                }
                break;
            case "value":
                if(topCard.value < test.value){
                    return true;
                }
                if(test.superTrump){
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }

    public String userPickCategory(){
        System.out.println("Pick a category\n0.Hardness 1.Gravity 2.Cleavage 3.Abundance 4.Value");
        int category = 0;
        boolean validInput = false;
        while(!validInput) {
            System.out.print("Enter choice: ");
            category = Interface.getValidInt();
            if(category >= 0 && category < 5){
                validInput = true;
            } else {
                System.out.println("You must choose between 0 & 4");
            }
        }
        switch (category){
            case 0:
                System.out.println("Chosen category is hardness\n");
                return "hardness";
            case 1:
                System.out.println("Chosen category is gravity\n");
                return "gravity";
            case 2:
                System.out.println("Chosen category is cleavage\n");
                return "cleavage";
            case 3:
                System.out.println("Chosen category is abundance\n");
                return "abundance";
            default:
                System.out.println("Chosen category is value\n");
                return "value";
        }
    }

//Non User functions ----------------------------------------------------------------------------------------------------------

    public Card turn(Card topCard, String category){
        //Deciding what card to play
        if(hand.size() != 0){
            switch (category){
                case "hardness":
                    for(Card test : hand){
                        if(topCard.hardness < test.hardness){
                            Card chosenCard = test;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    for(Card test2 : hand){
                        if(test2.superTrump){
                            Card chosenCard = test2;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    break;
                case "gravity":
                    for(Card test : hand){
                        if(topCard.gravity < test.gravity){
                            Card chosenCard = test;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    for(Card test2 : hand){
                        if(test2.superTrump){
                            Card chosenCard = test2;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    break;
                case "cleavage":
                    for(Card test : hand){
                        if(topCard.cleavage < test.cleavage){
                            Card chosenCard = test;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    for(Card test2 : hand){
                        if(test2.superTrump){
                            Card chosenCard = test2;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    break;
                case "abundance":
                    for(Card test : hand){
                        if(topCard.abundance < test.abundance){
                            Card chosenCard = test;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    for(Card test2 : hand){
                        if(test2.superTrump){
                            Card chosenCard = test2;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    break;
                case "value":
                    for(Card test : hand){
                        if(topCard.value < test.value){
                            Card chosenCard = test;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    for(Card test2 : hand){
                        if(test2.superTrump){
                            Card chosenCard = test2;
                            hand.remove(chosenCard);
                            return chosenCard;
                        }
                    }
                    break;
                default:
                    System.out.println("No category found");
                    return null;
            }
        }
        return null;
    }

    public boolean hasCard(){
        if(hand.size() == 0){
            hasCard = false;
        } else {
            hasCard = true;
        }
        return hasCard;
    }

    public Card turn(){
        //First play turn, no card required
        //Randomly chosen from hand
        if(hand.size() != 0){
            Card chosenCard;
            System.out.println("Player " + position + " playing the first card");
            while (true) {
                Random rand = new Random();
                //picking a card
                int cardChoice = rand.nextInt(hand.size());
                //making sure chosen card is not a supertrump
                chosenCard = hand.get(cardChoice);
                if(!chosenCard.superTrump){
                    break;
                }
            }
            hand.remove(chosenCard);
            return chosenCard;
        } else {
            return null;
        }
    }

    public String pickCategory(){
        //randomly choose category
        Random rand = new Random();
        //picking a category
        int categoryChoice = rand.nextInt(5);
        switch (categoryChoice){
            case 0:
                System.out.println("Chosen category is hardness\n");
                return "hardness";
            case 1:
                System.out.println("chosen category is gravity\n");
                return "gravity";
            case 2:
                System.out.println("chosen category is cleavage\n");
                return "cleavage";
            case 3:
                System.out.println("chosen category is abundance\n");
                return "abundance";
            default:
                System.out.println("chosen category is value\n");
                return "value";
        }
    }

    public void pickUpCard(Card givenCard){
        //adding a card to hand
        hand.add(givenCard);
        System.out.println("Player " + position + " has picked up a card");
    }

    public void showHand(){
        //show player hand
        System.out.println("Player hand:");
        for(Card chosen : hand){
            System.out.println(chosen.toString());
        }
    }

    @Override
    public String toString() {
        return "Player " + position;
    }
}
