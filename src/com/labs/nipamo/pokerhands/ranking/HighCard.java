package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class HighCard implements IRank {
	private FacesEnum score;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(RanksEnum.HIGH_CARD);
		
		return true;
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
