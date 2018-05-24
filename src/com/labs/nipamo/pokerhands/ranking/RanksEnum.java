package com.labs.nipamo.pokerhands.ranking;

public enum RanksEnum {
	HIGH_CARD ("high card"),
	PAIR ("pair"),
	TWO_PAIRS ("two pairs"),
	THREE_OF_A_KIND ("three of a kind"),
	STRAIGHT ("straight"),
	FLUSH ("flush"),
	FULL_HOUSE ("full house"),
	FOUR_OF_A_KIND ("fout of a kind"),
	STRAIGHT_FLUSH ("straight flush");
	
	private String value;
	
	RanksEnum(String str) { 
		value = str; 
	}
	
	public String getValue() {
		return this.value;
	}
}
