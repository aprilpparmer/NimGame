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
public class GreedyStrategy implements NumberOfSticksStrategy {

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
		
		int numberOfSticks = 0;
		
		if (pileSize >= (Game.MAX_STICKS_PER_TURN + 1)) {
			numberOfSticks = Game.MAX_STICKS_PER_TURN;
		} else {
			numberOfSticks = pileSize - 1;
		}
		return numberOfSticks;
	}
}
