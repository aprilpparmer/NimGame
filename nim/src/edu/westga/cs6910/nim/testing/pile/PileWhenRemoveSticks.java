/**
 * 
 */
package edu.westga.cs6910.nim.testing.pile;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the removeSticks method of the Pile class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class PileWhenRemoveSticks {

	/**
	 * Tests that a pile has 1 stick left after removing 1 stick from a 2 stick pile.
	 */
	@Test
	public void testShouldHave1StickLeftAfterRemoving1StickFrom2StickPile() {
		Pile twoStickPile = new Pile(2);
		twoStickPile.removeSticks(1);
		assertEquals(1, twoStickPile.getSticksLeft());
	}

}
