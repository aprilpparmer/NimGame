/**
 * 
 */
package edu.westga.cs6910.nim.model;

/**
 * Defines the common interface for all the game-play algorithms for the 1-Pile version of Nim.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public interface NumberOfSticksStrategy {
	
	/**
	 * Returns the number of sticks to be taken from the Pile.
	 * 
	 * @param size of the pile
	 * @return numberOfSticks
	 * 
	 * Precondition: pileSize > 0
	 * Precondition: Returns the number of sticks to take, an integer that is > 0 
	 * 		and <= the pile size.
	 */
	public int howManySticks(int pileSize);
}
