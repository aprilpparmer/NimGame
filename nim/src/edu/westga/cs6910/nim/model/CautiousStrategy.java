package edu.westga.cs6910.nim.model;

/**
 * Implements the game-play strategy that always returns 1 as the 
 * 		number of sticks to be taken from the Pile.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class CautiousStrategy implements NumberOfSticksStrategy {

	public CautiousStrategy() {
	}
	
	/**
	 * Implements NumberOfSticksStrategy's howManySticks() to return 1.
	 * 
	 * @param pileSize - size of the Pile
	 * @return 1 stick
	 */
	public int howManySticks(int pileSize) {
		if (pileSize <= 0) {
			throw new IllegalArgumentException("The pile size must be greater than 0");
		}
		return 1;
	}

	
	
	
	
	
}
