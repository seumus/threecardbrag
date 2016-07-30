//package specs;
import game.*;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import behaviours.*;
import java.util.*;


public class OtherTest {

  Deck deck;
  Game game;


  @Before
  public void before() {
    Player player1 = new Player("Bob");
    Player player2 = new Player("Gooseman");
    Player player3 = new Player("Simon");
    ArrayList<Player> players = new ArrayList<Player>(
        Arrays.asList(player1,player2,player3)
    );
    deck = new Deck();
    deck.getCards();
    deck.shuffle();

    game = new Game(players, deck);

  }

  @Test
  public void canGetCards(){
    //   deck.getCards();
      assertEquals(52, deck.cards.size());
  }
  // @Test
  // public void getCardName(){
  //   //   deck.getCards();
  //     assertEquals(Name.TWO, deck.cards.get(0).getName());
  // }
  @Test
  public void checkPlayers(){
      assertEquals(3, game.getPlayers().size());
  }
  @Test
  public void checkPlayerHand(){
      game.deal();
      assertEquals(3, game.getPlayers().get(0).getHand().size());
  }
  @Test
  public void checkCanScore() {
      game.deal();
      game.getPlayers().get(0).setScore();
      assertEquals(2, game.getPlayers().get(0).getScore());
  }

}
