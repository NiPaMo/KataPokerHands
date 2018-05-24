package com.labs.nipamo.pokerhands;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		String black, white, result;
		Hand hand1, hand2;
		Scanner reader = new Scanner(System.in);
		
		// Get user input
		System.out.println("Enter 5 card values for each player seperated by 1 space");	
		System.out.print("Black: ");
		black = reader.nextLine().toUpperCase();		
		System.out.print("White: ");
		white = reader.nextLine().toUpperCase();	
		reader.close();
			
		// Validate input
		if (black.length() != 14)
			throw new IllegalArgumentException("Invalid input format for Black");
		if (white.length() != 14)
			throw new IllegalArgumentException("Invalid input format for White");
		
		
		// Create the hand objects
		hand1 = new Hand(black);
		hand2 = new Hand(white);
		
		// Assign rank and score for each hand
		HandRanker.rank(hand1);
		HandRanker.rank(hand2);
		
		// Compare the rank and score of each hand to determine a winner
		result = HandComparator.getResult(hand1, hand2);
		
		// Print out the result
		System.out.println(result);
	}
}
