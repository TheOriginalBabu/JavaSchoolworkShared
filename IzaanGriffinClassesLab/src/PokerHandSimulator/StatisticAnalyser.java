package PokerHandSimulator;

import java.text.DecimalFormat;

public class StatisticAnalyser {

    public int[] handCount = new int[10];
    public String[] handNames = {"Royal Flush", "Straight Flush", "Four of a Kind", "Full House", "Flush", "Straight", "Three of a Kind", "Two Pair", "Pair", "High Card"};
    public int totalHands = 10000000;
    private static final DecimalFormat df = new DecimalFormat("0.000");

    /**
     * Constructor for the StatisticAnalyser class
     */
    public StatisticAnalyser() {
        Analyser analyser = new Analyser();

        handCounter(analyser);

        printHandPercents();
    }


    /**
     * Counts the number of each hand type
     * @param analyser the analyser to be used
     */
    public void handCounter(Analyser analyser) {

            for (int i = 0; i < totalHands; i++) {
                Hand hand = new Hand(new Deck(true));
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

    }

    /**
     * Prints the percentage of each hand type
     */
    public void printHandPercents() {
        double[] handPercents = new double[10];

        for (int i = 0; i < handCount.length; i++) {
            handPercents[i] = ((double) handCount[i] / totalHands) * 100;
        }

        for (int i = 0; i < handPercents.length; i++) {
            System.out.println(handNames[i] + ": " +  df.format(handPercents[i]) + "%");
        }
    }
}
