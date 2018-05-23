package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class ThreeOfAKind implements IRank {
	private FacesEnum score;

	@Override
	public boolean isRank(Hand h) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setScore(Hand h) {
		// TODO Auto-generated method stub
		h.setScore(score);
	}
}
