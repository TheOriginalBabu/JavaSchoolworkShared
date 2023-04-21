package classintro.PokerHandSimulator;

import java.util.Random;

public class Hand {
    public Card[] hand = new Card[5];

    public Hand(Deck deck) {
        buildHand(deck);
    }


    public void buildHand(Deck deck) {
        Random rand = new Random();
        for (int i = 0; i < hand.length; i++) {
            int tempIndex;
            while (true) {
                tempIndex = rand.nextInt(52);
                if (deck.get(tempIndex) != null) {
                    hand[i] = deck.get(tempIndex);
                    break;
                }
            }
            deck.removeCard(tempIndex);
        }
    }
}
