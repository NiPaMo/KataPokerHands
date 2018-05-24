package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class FourOfAKind implements IRank {
	private Face score;
	private Face face1;
	private Face face2;
	private Face face3;
	private Face face4;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(Rank.FOUR_OF_A_KIND);

		for (int i = 0; i < 2; i++) {
			face1 = h.getCard(i).getFace();
			face2 = h.getCard(i + 1).getFace();		
			face3 = h.getCard(i + 2).getFace();
			face4 = h.getCard(i + 3).getFace();
			if (face1.compareTo(face2) == 0 && face1.compareTo(face3) == 0 &&
				face1.compareTo(face4) == 0)
				return true; 
		}

		
		return false;
	}
	
	@Override
	public void setScore(Hand h) {
		score = face4;
		
		h.setScore(score);
	}
}
