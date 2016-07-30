package game;
import java.util.*;
import behaviours.*;



public class Deck{
    //Card card;
    public ArrayList<Card> cards;

    public Deck(){
      this.cards = new ArrayList<Card>();
    }

    public void getCards(){
        for(int i=0; i < 13; i++) {
            Card card = new Card((i),Suit.HEARTS);
            card.getCardName(i);
            cards.add(card);
        }
        for(int i=0; i < 13; i++) {
            Card card = new Card((i),Suit.SPADES);
            card.getCardName(i);
            cards.add(card);
        }
        for(int i=0; i < 13; i++) {
            Card card = new Card((i),Suit.CLUBS);
            card.getCardName(i);
            cards.add(card);
        }
        for(int i=0; i < 13; i++) {
            Card card = new Card((i),Suit.DIAMONDS);
            card.getCardName(i);
            cards.add(card);
        }
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }


}
