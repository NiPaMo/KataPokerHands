package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class StraightFlush implements IRank {
	private Face score;
	
	@Override
	public boolean isRank(Hand h) {
		Straight s = new Straight();
		Flush f = new Flush();
		
		if (s.isRank(h) && f.isRank(h)) {
			h.setRank(Rank.STRAIGHT_FLUSH);
			return true;
		}
		
		return false;
	}
	
	@Override
	public void setScore(Hand h) {
		score = h.getCard(0).getFace();
		
		for (int i = 0; i < 5; i++) {
			if (score.compareTo(h.getCard(i).getFace()) < 0)
				score = h.getCard(i).getFace();
		}

		
		h.setScore(score);
	}
}
