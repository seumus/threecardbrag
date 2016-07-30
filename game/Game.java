package game;
import java.util.*;

public class Game{
    ArrayList<Player> players;
    Deck deck;
    // Player[] players

    public Game(ArrayList<Player> players, Deck deck) {
    // public Game(Player[3] players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }
    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void deal() {
        for(int i =0; i < this.players.size(); i++) {
            this.players.get(i).hand.add(this.deck.cards.remove(0));
            this.players.get(i).hand.add(this.deck.cards.remove(0));
            this.players.get(i).hand.add(this.deck.cards.remove(0));
        }
    }


}
