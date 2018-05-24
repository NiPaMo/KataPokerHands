package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class Straight implements IRank {
	private Face score;
	private Face face1;
	private Face face2;
	private Face face3;
	private Face face4;
	private Face face5;
	
	@Override
	public boolean isRank(Hand h) {		
		face1 = h.getCard(0).getFace();
		face2 = h.getCard(1).getFace();
		face3 = h.getCard(2).getFace();
		face4 = h.getCard(3).getFace();
		face5 = h.getCard(4).getFace();

		int first = face1.ordinal();
		if (face2.ordinal() == first + 1 &&
			face3.ordinal() == first + 2 &&
			face4.ordinal() == first + 3 &&
			face5.ordinal() == first + 4) {
			h.setRank(Rank.STRAIGHT);
			return true;
		}
		
		return false;
	}

	@Override
	public void setScore(Hand h) {
		score = face5;
		
		h.setScore(score);
	}
}
