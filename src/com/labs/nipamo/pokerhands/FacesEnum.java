package com.labs.nipamo.pokerhands;

public enum FacesEnum {
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
	
	FacesEnum(String str) { 
		value = str; 
	}
	
	public String getValue() {
		return this.value;
	}
	
	// Return the enum using the given string value
	public static FacesEnum getEnum(String str) 
	{
		for (FacesEnum face : values())
		{
			if (face.value.equals(str))
				return face;
		}
		
		// Validate input
		throw new IllegalArgumentException("Invalid face - \""+ str + "\"");
	}
}
