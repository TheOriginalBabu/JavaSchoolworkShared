package classintro.PokerHandSimulator;

public class StatisticAnalyser {
    public StatisticAnalyser() {
        int[] handCount = new int[10];
        double[] handPercents = new double[10];
        String[] handNames = {"Royal Flush", "Straight Flush", "Four of a Kind", "Full House", "Flush", "Straight", "Three of a Kind", "Two Pair", "Pair", "High Card"};

        Hand hand;
        Deck deck = new Deck();
        Analyser analyser = new Analyser();
        for (int i = 0; i < 1000000; i++) {
            hand = new Hand(deck.clone());
            switch (analyser.bestHandFinder(hand)) {
                case "Royal Flush" -> handCount[0]++;
                case "Straight Flush" -> handCount[1]++;
                case "Four of a Kind" -> handCount[2]++;
                case "Full House" -> handCount[3]++;
                case "Flush" -> handCount[4]++;
                case "Straight" -> handCount[5]++;
                case "Three of a Kind" -> handCount[6]++;
                case "Two Pair" -> handCount[7]++;
                case "Pair" -> handCount[8]++;
                case "High Card" -> handCount[9]++;
            }
        }

        for (int i = 0; i < handCount.length; i++) {
            handPercents[i] = ((double) handCount[i] / 10000) * 100;
        }

        for (int i = 0; i < handPercents.length; i++) {
            System.out.println(handNames[i] + ": " + handPercents[i] + "%");
        }
    }
}
