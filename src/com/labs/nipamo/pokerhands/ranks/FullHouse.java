package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class FullHouse implements IRank {
	private Face score;
	private Face face1;
	private Face face2;
	private Face face3;
	private Face face4;
	private Face face5;
	
	@Override
	public boolean isRank(Hand h) {
		h.setRank(Rank.FULL_HOUSE);
		
			face1 = h.getCard(0).getFace();
			face2 = h.getCard(1).getFace();		
			face3 = h.getCard(2).getFace();
			face4 = h.getCard(3).getFace();
			face5 = h.getCard(4).getFace();
			
			// 1-2-3 & 4-5
			if (face1.compareTo(face2) == 0 && face1.compareTo(face3) == 0 &&
				face4.compareTo(face5) == 0) {
				face5 = face1;
				return true;
			}
			
			// 1-2 & 3-4-5
			if (face1.compareTo(face2) == 0 && face3.compareTo(face4) == 0 &&
				face3.compareTo(face5) == 0)
				return true;
	
		return false;
	}
	
	@Override
	public void setScore(Hand h) {
		score = face5;
		
		h.setScore(score);
	}
}
