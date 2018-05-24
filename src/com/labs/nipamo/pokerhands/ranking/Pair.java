package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class Pair implements IRank {
	private FacesEnum score;
	private FacesEnum face1;
	private FacesEnum face2;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(RanksEnum.PAIR);

		for (int i = 0; i < 5; i++) {
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
