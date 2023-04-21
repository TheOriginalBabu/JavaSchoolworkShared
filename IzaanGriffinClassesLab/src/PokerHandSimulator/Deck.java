package PokerHandSimulator;

public class Deck {

    public Card[] deck = new Card[52];

    public Deck() {
        deckBuilder(0);
    }

    public Card addCard(String value, String suit) {
        return new Card(value, suit);
    }

    public Card addCard(int value, int suit) {
        return new Card(value, suit);
    }

    public void deckBuilder(int suit) {
        if (suit < 4) {
            for (int i = 0; i < 14; i++) {
                deck[i + (suit * 14)] = addCard(i, suit);
            }
            deckBuilder(suit+1);
        }

    }

    public Card get(int cardIndex) {
        return deck[cardIndex];
    }
}
