package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.Hand;

public interface IRank {
	public boolean isRank(Hand h);	
	public void setScore(Hand h);
}
