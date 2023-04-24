package classintro.PokerHandSimulator;

public class SatisticAnalyser {
    public SatisticAnalyser() {
        int[] handCount = new int[10];
        Hand hand;
        Deck deck = new Deck();
        for (int i = 0; i < 1000000; i++) {
            Analyser analyser = new Analyser();
            hand = new Hand(deck.clone());
            switch (analyser.bestHandFinder(hand)) {
                case "Royal Flush":
                    handCount[0]++;
                    break;
                case "Straight Flush":
                    handCount[1]++;
                    break;
                case "Four of a Kind":
                    handCount[2]++;
                    break;
                case "Full House":
                    handCount[3]++;
                    break;
                case "Flush":
                    handCount[4]++;
                    break;
                case "Straight":
                    handCount[5]++;
                    break;
                case "Three of a Kind":
                    handCount[6]++;
                    break;
                case "Two Pair":
                    handCount[7]++;
                    break;
                case "Pair":
                    handCount[8]++;
                    break;
                case "High Card":
                    handCount[9]++;
                    break;
            }
        }
        System.out.println("Royal Flush: " + handCount[0]);
        System.out.println("Straight Flush: " + handCount[1]);
        System.out.println("Four of a Kind: " + handCount[2]);
        System.out.println("Full House: " + handCount[3]);
        System.out.println("Flush: " + handCount[4]);
        System.out.println("Straight: " + handCount[5]);
        System.out.println("Three of a Kind: " + handCount[6]);
        System.out.println("Two Pair: " + handCount[7]);
        System.out.println("Pair: " + handCount[8]);
        System.out.println("High Card: " + handCount[9]);
    }
}
