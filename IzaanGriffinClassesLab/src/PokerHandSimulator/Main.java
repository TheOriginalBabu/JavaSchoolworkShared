package PokerHandSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long hands;
        while(true) {
            try {
                System.out.print("Enter the number of hands to be simulated: ");
                hands = scan.nextInt();
                System.out.println();
                StatisticAnalyser analyser = new StatisticAnalyser(hands);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }
}
