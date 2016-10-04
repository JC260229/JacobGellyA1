import java.util.*;

public class Interface {

    public static int getPlayers() {
        int players = 0;
        while (players < 3 | players > 5) {
            System.out.println("Game can have 3 to 5 players");
            System.out.print("Enter number of players: ");
            players = Interface.getValidInt();
        }
        return players;
    }

    public static int getValidInt(){
        int number = 0;
        boolean invalidInt = true;
        while (invalidInt) {
            try {
                Scanner consoleInput = new Scanner(System.in);
                number = consoleInput.nextInt();
                invalidInt = false;
            } catch (Exception e) {
                System.out.print("Invalid input, try again: ");
            }
        }
        return number;
    }
}
