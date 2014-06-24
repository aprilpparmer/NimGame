/**
 * 
 */
package edu.westga.cs6910.nim.model;

import java.util.Random;

/**
 * Implements the game-play strategy that returns a random number 
 * 		between 1 and the maximum number allowed, inclusive, as the 
 * 		number of sticks to be taken from the pile.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class RandomStrategy implements NumberOfSticksStrategy {
	private Random rand;
	
	/**
	 * Constructor that instantiates the Random instance variable.
	 */
	public RandomStrategy() {
		this.rand = new Random();
	}
	
	/**
	 * Implements NumberOfSticksStrategy's howManySticks() to return a random number of sticks
	 * 		to be taken from the pile.
	 * 
	 * Precondition: pileSize > 0
	 * 
	 * @param pileSize - the current size of the pile
	 * @return randomNumber between 1 and Math.min(pileSize-1, Game.MAX_STICKS_PER_TURN), inclusive
	 */
	public int howManySticks(int pileSize) {
		if (pileSize <= 0) {
			throw new IllegalArgumentException("The pile size must be greater than 0");
		}
		int randomNumber = this.rand.nextInt(Math.min(pileSize - 1, Game.MAX_STICKS_PER_TURN)) + 1;
		return randomNumber;
	}
}
