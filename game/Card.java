package game;
import behaviours.*;


public class Card{

    int value;
    Suit suit;
    Name name;

    public Card(int value, Suit suit) {
        this.name = name;
        this.value = value;
        this.suit = suit;
    }
    public Name getName() {
        return this.name;
    }
    public Suit getSuit() {
        return this.suit;
    }
    public int getValue() {
        return this.value;
    }

    public void getCardName(int value) {
        // switch(i) {
        //     case 1:
        //         this.name = Name.ONE;
        //         break;
        //     case 2:
        //         this.name = Name.TWO;
        //         break;
        //     case 3:
        //         this.name = Name.THREE;
        //         break;
        //     case 4:
        //         this.name = Name.FOUR;
        //         break;
        //     case 5:
        //         this.name = Name.FIVE;
        //         break;
        //     case 6:
        //         this.name = Name.SIX;
        //         break;
        //
        // }
        // for(Name v: Name.values()){
        //
        // }
        this.name = Name.values()[value];



    }
}
