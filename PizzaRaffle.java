// Created by Julia* Free & Open license, use as you would like.

import java.util.Scanner;

public class PizzaRaffle {
		// to run on Android install any Java Manager or IDE
		
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] winners;
		int ladies;
		int pizzas;
		
		System.out.println("How many ladies in the raffle?");
		ladies = Integer.parseInt(kb.nextLine());
		System.out.println("How many pizzas?");
		pizzas = Integer.parseInt(kb.nextLine());
		winners = new int[pizzas];
		
		generateWinners(winners, ladies);
		printWinners(winners);
		kb.close();
	}

		private static void printWinners(int[] winners) {
			for(int pie : winners) {
				System.out.println("[ " + pie +" ] You get a pie!");
			}
		}

		private static void generateWinners(int[] winners, int ladies) {
			int result, checkMe;
			// generate a list
			for(int i = 0; i < winners.length; i++) {
				result = (int)(Math.random()*ladies);
				winners[i] = result;
			}
			
			// check for duplicates
			for(int i = 0; i < winners.length; i++) {
				checkMe = winners[i];
				for(int j = 0; j < winners.length-1; j++) {
					if(i == j) {
						//skip
					}
					else if(checkMe == winners[j]) {
						//if a duplicate exists, replace it until it is not a duplicate
						while(winners[j] == checkMe) {
							winners[j] = (int)(Math.random()*ladies);
						}
					}
				}
			}
			
		}
}
