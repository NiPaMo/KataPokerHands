package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

public class FourOfAKind implements IRank {
	private FacesEnum score;
	private FacesEnum face1;
	private FacesEnum face2;
	private FacesEnum face3;
	private FacesEnum face4;

	@Override
	public boolean isRank(Hand h) {
		h.setRank(RanksEnum.FOUR_OF_A_KIND);

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
