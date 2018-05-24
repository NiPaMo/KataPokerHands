package com.labs.nipamo.pokerhands;

import com.labs.nipamo.pokerhands.ranks.Flush;
import com.labs.nipamo.pokerhands.ranks.FourOfAKind;
import com.labs.nipamo.pokerhands.ranks.FullHouse;
import com.labs.nipamo.pokerhands.ranks.HighCard;
import com.labs.nipamo.pokerhands.ranks.Pair;
import com.labs.nipamo.pokerhands.ranks.Straight;
import com.labs.nipamo.pokerhands.ranks.StraightFlush;
import com.labs.nipamo.pokerhands.ranks.ThreeOfAKind;
import com.labs.nipamo.pokerhands.ranks.TwoPairs;

public abstract class HandRanker {
	
	// Private constructor so class cannot be instantiated
	private HandRanker() { }
	
	public static void rank(Hand h) {
		StraightFlush straightFlush = new StraightFlush();
		FourOfAKind fourOfAKind = new FourOfAKind();
		FullHouse fullHouse = new FullHouse();
		Flush flush = new Flush();
		Straight straight = new Straight();
		ThreeOfAKind threeOfAKind = new ThreeOfAKind();
		TwoPairs twoPairs = new TwoPairs();
		Pair pair = new Pair();
		HighCard highCard = new HighCard();
		
		if (straightFlush.isRank(h))
			straightFlush.setScore(h);
		else if (fourOfAKind.isRank(h))
			fourOfAKind.setScore(h);
		else if (fullHouse.isRank(h))
			fullHouse.setScore(h);
		else if (flush.isRank(h))
			flush.setScore(h);
		else if (straight.isRank(h))
			straight.setScore(h);
		else if (threeOfAKind.isRank(h))
			threeOfAKind.setScore(h);
		else if (twoPairs.isRank(h))
			twoPairs.setScore(h);
		else if (pair.isRank(h))
				pair.setScore(h);
		else {
			highCard.isRank(h);
			highCard.setScore(h);
		}
	}
}
