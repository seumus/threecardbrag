package game;
import behaviours.*;
import java.util.*;


public class Player{
    String name;
    ArrayList<Card> hand;
    int score;
    // int[] values;
    // ArrayList<int> values;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.score = score;
        // this.values = values;
        // this.values = new ArrayList<int>();
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }
    public int getScore() {
        return this.score;
    }
    public void sortValues() {
        List<Integer> values = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            values.add(this.hand.get(i).getValue());
        }
    }
    public void setScore() {

        //Collections.sort(hand);
        if(this.hand.get(0).getName() == this.hand.get(1).getName() || this.hand.get(0).getName() == this.hand.get(2).getName()) {
            this.score += 1;
        }
        if(this.hand.get(0).getName() == this.hand.get(1).getName() && this.hand.get(0).getName() == this.hand.get(2).getName()) {
            this.score += 4;
        }
        if(this.hand.get(0).getSuit() == this.hand.get(1).getSuit() && this.hand.get(0).getSuit() == this.hand.get(2).getSuit()) {
            this.score += 2;
        }
        // if(this.hand.get(0).getValue()+1 ==
    }


}
