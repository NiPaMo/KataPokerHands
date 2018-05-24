package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class ThreeOfAKind implements IRank {
	private FacesEnum score;
	private FacesEnum face1;
	private FacesEnum face2;
	private FacesEnum face3;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(RanksEnum.THREE_OF_A_KIND);
		
		for (int i = 0; i < 3; i++) {
			face1 = h.getCard(i).getFace();
			face2 = h.getCard(i + 1).getFace();		
			face3 = h.getCard(i + 3).getFace();
			if (face1.compareTo(face2) == 0 && face1.compareTo(face3) == 0)
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
