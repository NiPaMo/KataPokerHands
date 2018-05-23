package com.labs.nipamo.pokerhands;

import java.util.Scanner;
import com.labs.nipamo.pokerhands.ranking.*;

public class Main {
	private static Hand hand1;
	private static Hand hand2;
	private static String result;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Get user input
		System.out.println("Enter 5 card values for each player seperated by 1 space");	
		System.out.print("Black: ");
		String black = reader.nextLine();		
		System.out.print("White: ");
		String white = reader.nextLine();	
		reader.close();
		
		// Create the hand objects
		hand1 = new Hand(black);
		hand2 = new Hand(white);
		
		// Assign rank and score for each hand
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		// Compare the rank and score of each hand to determine a winner
		result = Comparator.getResult(hand1, hand2);
		
		// Print out the result
		System.out.println(result);
	}
}
