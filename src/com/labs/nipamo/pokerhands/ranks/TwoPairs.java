package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;

public class TwoPairs implements IRank {
	private Face score;
	private Face face1a;
	private Face face2a;
	private Face face1b;
	private Face face2b;	

	@Override
	public boolean isRank(Hand h) {
		h.setRank(Rank.TWO_PAIRS);

		for (int i = 0; i < 2; i++) {
			face1a = h.getCard(i).getFace();
			face2a = h.getCard(i + 1).getFace();			
			if (face1a.compareTo(face2a) == 0) {
				face1b = h.getCard(i + 2).getFace();
				face2b = h.getCard(i + 3).getFace();		
				if (face1b.compareTo(face2b) == 0)
					return true;
				if (i == 0) {
					face1b = h.getCard(i + 3).getFace();
					face2b = h.getCard(i + 4).getFace();	
					if (face1b.compareTo(face2b) == 0)
						return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public void setScore(Hand h) {
		if (face1a.compareTo(face1b) > 1)
			score = face1a;
		else
			score = face1b;		
		
		h.setScore(score);
	}
}
