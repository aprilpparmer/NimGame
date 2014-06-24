/**
 * 
 */
package edu.westga.cs6910.nim.model;

/**
 * Implements the strategy that the ComputerPlayer takes as many sticks as possible off the pile.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class GreedyStrategy {

	public GreedyStrategy() {
	}
	
	/**
	 * Implements NumberOfSticksStrategy's howManySticks method, to return the largest possible
	 * 		number of sticks to take from the pile.
	 * 
	 * Precondition: pileSize > 0
	 * 
	 * @param pileSize - size of the pile
	 * @return numberOfSticks to take from pile
	 */
	public int howManySticks(int pileSize) {
		if (pileSize <= 0) {
			throw new IllegalArgumentException("The pile size must be greater than 0");
		}
		
		int numberOfSticks = Math.max(pileSize - 1, Game.MAX_STICKS_PER_TURN);
		return numberOfSticks;
	}
}
