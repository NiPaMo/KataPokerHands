package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class Straight implements IRank {
	private FacesEnum score;
	private FacesEnum face1;
	private FacesEnum face2;
	private FacesEnum face3;
	private FacesEnum face4;
	private FacesEnum face5;
	
	@Override
	public boolean isRank(Hand h) {
		h.setRank(RanksEnum.STRAIGHT);
		
		face1 = h.getCard(0).getFace();
		face2 = h.getCard(1).getFace();
		face3 = h.getCard(2).getFace();
		face4 = h.getCard(3).getFace();
		face5 = h.getCard(4).getFace();

		int first = face1.ordinal();
		if (face2.ordinal() == first + 1 &&
			face3.ordinal() == first + 2 &&
			face4.ordinal() == first + 3 &&
			face5.ordinal() == first + 4)
			return true;
		
		return false;
	}

	@Override
	public void setScore(Hand h) {
		score = face5;
		
		h.setScore(score);
	}
}
