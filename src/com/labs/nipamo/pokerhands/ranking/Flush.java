package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class Flush implements IRank {
	private FacesEnum score;

	@Override
	public boolean isRank(Hand h) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public FacesEnum getScore(Hand h) {
		// TODO Auto-generated method stub
		return this.score;
	}
}
