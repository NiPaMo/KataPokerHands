package com.labs.nipamo.pokerhands;

import java.util.Scanner;
import com.labs.nipamo.pokerhands.ranking.*;

public class Main {
	private static Hand hand1;
	private static Hand hand2;
	private static int winner;	
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Get user input
		System.out.println("Enter 5 card values for each player seperated by 1 space");	
		System.out.print("Black: ");
		String black = reader.nextLine();		
		System.out.print("White: ");
		String white = reader.nextLine();	
		reader.close();
		
		// Parse the input for both hands
		hand1 = Parser.parseInput(black);
		hand2 = Parser.parseInput(white);
		
		// Assign rank and score for each hand
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		// Compare the rank and score of each hand to determine a winner
		winner = Comparator.compareRank(hand1, hand2);
	
		// Print out the results
		if (winner == 1) {
			System.out.println("Black wins. - with " + 
					hand1.getRank().getValue() + ": " + hand1.getScore().getValue());
		} else if (winner == 2){
			System.out.println("White wins. - with " + 
					hand2.getRank().getValue() + ": " + hand2.getScore().getValue());
		} else {
			System.out.println("Tie");
		}
	}

}
