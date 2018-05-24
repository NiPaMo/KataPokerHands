package com.labs.nipamo.pokerhands.enums;

public enum Suit {
	CLUBS("C"),
	DIAMONDS("D"),
	HEARTS("H"),
	SPADES("S");
	
	private String value;
	
	Suit (String str){
		value = str;
	}
	
	// Return the enum value using the given string value
	public static Suit getEnum(String str) 
	{		
		for (Suit suit : values())
		{
			if (suit.value.equals(str))
				return suit;
		}
		
		// Validate input
		throw new IllegalArgumentException("Invalid suit - \"" + str + "\"");
	}
}
