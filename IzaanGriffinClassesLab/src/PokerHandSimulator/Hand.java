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
        int BoundVar;


        BoundVar = rand.nextInt(52);
        card1 = deck.get(BoundVar);
        deck.removeCard(BoundVar);

        BoundVar = rand.nextInt(52);
        card2 = deck.get(BoundVar);
        deck.removeCard(BoundVar);

        BoundVar = rand.nextInt(52);
        card3 = deck.get(BoundVar);
        deck.removeCard(BoundVar);

        BoundVar = rand.nextInt(52);
        card4 = deck.get(BoundVar);
        deck.removeCard(BoundVar);

        BoundVar = rand.nextInt(52);
        card5 = deck.get(BoundVar);
        deck.removeCard(BoundVar);
        




    }
}
