package com.labs.nipamo.pokerhands.ranks;

import com.labs.nipamo.pokerhands.Hand;

public interface IRank {
	public boolean isRank(Hand h);	
	public void setScore(Hand h);
}
