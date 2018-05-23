package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;

interface IRank {
	public boolean isRank(Hand h);	
	public FacesEnum getScore(Hand h);
}
