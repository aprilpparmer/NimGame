/**
 * 
 */
package edu.westga.cs6910.nim.testing.HumanPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.HumanPlayer;

/**
 * Tests the functionality of setNumberSticksToTake and getSticksOnThisTurn.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class HumanPlayerSetNumberOfSticksGetSticks {

	/**
	 * Creates a HumanPlayer and sets the number of sticks to take to 3, then returns the number taken.
	 */
	@Test
	public void testSet3SticksGet3Sticks() {
		AbstractPlayer john = new HumanPlayer("John");
		john.setNumberSticksToTake(3);
		assertEquals(3, john.getSticksOnThisTurn());
	}

}
