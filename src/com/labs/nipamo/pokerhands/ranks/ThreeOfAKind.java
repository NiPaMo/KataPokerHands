package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class ThreeOfAKind implements IRank {
	private Face score;
	private Face face1;
	private Face face2;
	private Face face3;

	@Override
	public boolean isRank(Hand h) {		
		for (int i = 0; i < 3; i++) {
			face1 = h.getCard(i).getFace();
			face2 = h.getCard(i + 1).getFace();		
			face3 = h.getCard(i + 2).getFace();
			if (face1.compareTo(face2) == 0 && face1.compareTo(face3) == 0) {
				h.setRank(Rank.THREE_OF_A_KIND);
				return true; 
			}
		}
		return false;
	}

	@Override
	public void setScore(Hand h) {
		score = face1;
		
		h.setScore(score);
	}
}
