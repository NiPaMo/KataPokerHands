package com.labs.nipamo.pokerhands;

import java.util.Scanner;
import com.labs.nipamo.pokerhands.ranking.*;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Hand hand1,
		     hand2;
		FacesEnum score1,
				  score2;
		int winner;
		
		System.out.println("Enter 5 card values for each player seperated by 1 space");
		
		System.out.print("Black: ");
		String black = reader.nextLine();
		
		System.out.print("White: ");
		String white = reader.nextLine();
		
		reader.close();
		
		hand1 = Parser.parseInput(black);
		hand2 = Parser.parseInput(white);
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		winner = Comparator.compareRank(hand1, hand2);
		
		if (winner == 1) {
			System.out.println("Black wins");
		}
		else if (winner == 2)
		{
			System.out.print("White wins");
		}
		else
		{
			System.out.println("Tie");
		}
		
		
	}

}
