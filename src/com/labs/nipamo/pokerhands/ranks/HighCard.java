package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class HighCard implements IRank {
	private Face score;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(Rank.HIGH_CARD);
		
		return true;
	}
	
	@Override
	public void setScore(Hand h) {
		score = h.getCard(4).getFace();
		
		h.setScore(score);
	}
	
	public void setScore(Hand h, int i) {
		score = h.getCard(3 - i).getFace();
		
		h.setScore(score);
	}
}
