import game.*;
import java.util.*;

public class Runner{
    public static void main(String args) {
        Player player1 = new Player("Bob");
        Player player2 = new Player("Gooseman");
        Player player3 = new Player("Simon");
        ArrayList<Player> players = {player1,player2,player3};
        // ArrayList<players> = new ArrayList<>
        Deck deck = new Deck();
        deck.getCards();

        Game game = new Game(players, deck)

        //deck.shuffle();


    }
}
