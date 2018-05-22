package com.labs.nipamo.pokerhands;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Hand hand1;
		Hand hand2;
		
		System.out.println("Enter 5 card values for each player seperated by 1 space");
		
		System.out.print("Black: ");
		String black = reader.nextLine();
		
		System.out.print("White: ");
		String white = reader.nextLine();
		
		reader.close();
		
		hand1 = Parser.parseInput(black);
		hand2 = Parser.parseInput(white);
	}

}
