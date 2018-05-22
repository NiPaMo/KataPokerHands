package com.labs.nipamo.pokerhands;

public enum SuitsEnum {
	CLUBS("C"),
	DIAMONDS("D"),
	HEARTS("H"),
	SPADES("S");
	
	private String value;
	
	SuitsEnum (String str){
		value = str;
	}
	
	// Return the enum value using the given string value
	public static SuitsEnum getEnum(String str) 
	{		
		for (SuitsEnum suit : values())
		{
			if (suit.value.equals(str))
				return suit;
		}
		
		// Validate input
		throw new IllegalArgumentException("Invalid suit - \"" + str + "\"");
	}
}
