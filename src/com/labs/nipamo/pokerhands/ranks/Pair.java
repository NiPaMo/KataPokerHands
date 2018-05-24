package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class Pair implements IRank {
	private Face score;
	private Face face1;
	private Face face2;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(Rank.PAIR);

		for (int i = 0; i < 4; i++) {
			face1 = h.getCard(i).getFace();
			face2 = h.getCard(i + 1).getFace();			
			if (face1.compareTo(face2) == 0)
				return true; 
		}
		
		return false;
	}
	
	@Override
	public void setScore(Hand h) {
		score = face1;
		
		h.setScore(score);
	}
}
