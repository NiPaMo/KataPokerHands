package com.labs.nipamo.pokerhands;

public abstract class Comparator {

	// Private constructor so class cannot be instantiated
	private Comparator() { }
	
	public static int compareRank(Hand h1, Hand h2) {
		if (h1.getRank().compareTo(h2.getRank()) > 0) {
			return 1;
		} else if (h1.getRank().compareTo(h2.getRank()) < 0) {
			return 2;
		} else {
			return compareScore(h1, h2);
		}
	}
	
	private static int compareScore(Hand h1, Hand h2) {
		if (h1.getScore().compareTo(h2.getScore()) > 0) {
			return 1;
		} else if (h1.getScore().compareTo(h2.getScore()) < 0) {
			return 2;
		} else {
			return 0;
		}
	}
}
