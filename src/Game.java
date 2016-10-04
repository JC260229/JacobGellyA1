import java.util.*;

public class Game {
    Deck gameDeck;
    ArrayList<Card> stack;
    ArrayList<Player> players;
    int playerTurn;
    int humanPlayer;
    String category;

    public Game(int playerNumber){
        //create the game deck
        gameDeck = new Deck();
        //create empty stack
        stack = new ArrayList<>();
        //create the players and deal hands
        createPlayers(playerNumber);
        //choose dealer
        chooseDealer();
        //choose human
        humanPlayer = chooseHuman();
    }

    public void startGame(){
        //first move - initializing the game
        if(playerTurn == humanPlayer){
            addToStack(players.get(playerTurn).userTurn());
            category = players.get(playerTurn).userPickCategory();

        } else {
            addToStack(players.get(playerTurn).turn());
            category = players.get(playerTurn).pickCategory();
        }
        nextTurn();
        //begin game
        while(true) {
            //check if its the human players turn
            if (playerTurn == humanPlayer) {
              Card userPlayedCard = players.get(playerTurn).userTurn(topOfStack(), category);
                if (userPlayedCard != null) {
                    if (userPlayedCard.superTrump) {
                        category = userPlayedCard.superTrumpCategory;
                        System.out.println("Supertrump played! category changed to " + category);
                        if (category == "anything") {
                            category = players.get(playerTurn).userPickCategory();
                        }
                    }
                    addToStack(userPlayedCard);
                } else {
                    if (players.get(playerTurn).hasCard()) {
                        if (!pickUpCard(players.get(playerTurn))) {
                            System.out.println("Game over");
                            findWinner();
                            break;
                        }
                    } else {
                        System.out.println("Player " + playerTurn + " has won the game");
                        break;
                    }

                }
            } else {
                //Bot turn
                //Pass player the top of the stack & category
                //Get chosen card
                Card playedCard = players.get(playerTurn).turn(topOfStack(), category);

                //If card is played
                if (playedCard != null) {
                    //Check if card Supertrump
                    if (playedCard.superTrump) {
                        category = playedCard.superTrumpCategory;
                        System.out.println("Supertrump played! category changed to " + category);
                        //if Supertrump, player choose category
                        if (category == "anything") {
                            category = players.get(playerTurn).pickCategory();
                        }
                    }
                    //Add chosen card to stack
                    addToStack(playedCard);
                } else {
                    //If no card is played
                    //check if player has a card
                    if (players.get(playerTurn).hasCard()) {
                        //Checking if the deck has cards, if so, player picks up
                        if (!pickUpCard(players.get(playerTurn))) {
                            System.out.println("Game over");
                            findWinner();
                            break;
                        }
                        //If player hand is empty they win the game
                    } else {
                        System.out.println("Player " + playerTurn + " has won the game");
                        break;
                    }
                }
            }
            nextTurn();
        }
    }

    private void findWinner(){
        int smallestHand = 100;
        int winner = 100;
        for (Player temp : players){
            if (temp.hand.size() < smallestHand){
                winner = temp.position;
                smallestHand = temp.hand.size();
            }
        }
        System.out.println("The player with the least cards is: " + players.get(winner));
        if (winner == humanPlayer){
            System.out.println("You win!");
        } else {
            System.out.println(players.get(winner) + " Wins");
        }
    }

    private boolean pickUpCard(Player player){
        Card newCard = gameDeck.getCard();
        if (newCard != null){
            player.pickUpCard(newCard);
            return true;
        } else {
            System.out.println("Deck is empty");
            return false;
        }
    }

    private void addToStack(Card playedCard){
        stack.add(playedCard);
        System.out.println(playedCard);
        System.out.println("has been played\n\n");
    }

    private void nextTurn(){
        if(players.size() == (playerTurn+1)){
            playerTurn = 0;
        } else {
            playerTurn = (playerTurn+1);
        }
        System.out.println("Player " + playerTurn + "'s turn");
    }

    private Card topOfStack(){
        if (stack.size() > 0){
            return stack.get(stack.size()-1);
        } else {
            System.out.println("Stack empty");
            return null;
        }
    }

    private void createPlayers(int playerNumber){
        players = new ArrayList<>();
        for(int i = 0; i < playerNumber; i++){
            players.add(new Player(gameDeck.getHand(), i));
        }
        System.out.println(players.size() + " players created");
        for (Player temp: players){
            System.out.print(temp + ". ");
        }
        System.out.println("\n");
    }

    private void chooseDealer(){
        Random rand = new Random();
        int dealerNumber = rand.nextInt(players.size());
        System.out.println("Dealer is player " + dealerNumber);

        if(players.size() == (dealerNumber+1)){
            playerTurn = 0;
            System.out.println("Player " + playerTurn + " begins");
        } else {
            playerTurn = (dealerNumber+1);
            System.out.println("Player " + playerTurn + " begins");
        }
    }

    private int chooseHuman(){
        Random rand = new Random();
        int humanNumber = rand.nextInt(players.size());
        System.out.println("You are player " + humanNumber + "\n");
        return humanNumber;
    }
}
