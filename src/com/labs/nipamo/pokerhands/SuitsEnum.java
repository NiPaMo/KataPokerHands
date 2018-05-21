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
}
