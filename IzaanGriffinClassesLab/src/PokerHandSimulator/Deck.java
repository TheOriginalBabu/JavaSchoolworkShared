package PokerHandSimulator;

public class Deck {

    public String[][] cards = new String[52][2];

    public Deck() {

    }

    public Card addCard(String suit, String value) {
        Card card = new Card(value, suit);
        return card;
    }

    public Card addCard(String suit, int value) {
        Card card = new Card(value, suit);
        return card;
    }

    public void deckBuilder(String suit, int suitCount) {
        for (int i = 0; i < 14; i++) {
            cards[i+(suitCount*14)] = addCard(suit, i);
        }
    }
}
