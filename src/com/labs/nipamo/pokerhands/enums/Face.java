package com.labs.nipamo.pokerhands.enums;

public enum Face {
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("T"),
	JACK("J"),
	QUEEN("Q"),
	KING("K"),
	ACE("A");
	
	private String value;
	
	Face(String str) { 
		value = str; 
	}
	
	public String getValue() {
		// Create longer strings from values for printing
		switch (this.value) {
			case "T":
				return "10";
			case "J":
				return "Jack";
			case "Q":
				return "Queen";
			case "K":
				return "King";
			case "A":
				return "Ace";
			default:
				return this.value;
		}
	}
	
	// Return the enum using the given string value
	public static Face getEnum(String str) {
		for (Face face : values()) {
			if (face.value.equals(str))
				return face;
		}
		
		// Validate input
		throw new IllegalArgumentException("Invalid face - \""+ str + "\"");
	}
}
