package PokerHandSimulator;
import java.util.Random;
public class Hand {
    public Card card1;
    public Card card2;
    public Card card3;
    public Card card4;
    public Card card5;
    public Hand() {


    }


    public void buildHand() {
        Random rand = new Random();
        Deck deck = new Deck(); // temp
        int BoundVar = rand.nextInt(52);

        card1 = deck.get(BoundVar);
        




    }
}
