package classintro.PokerHandSimulator;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand(new Deck());
        for (Card card : hand.hand) {
            card.showCard();
        }
    }
}
