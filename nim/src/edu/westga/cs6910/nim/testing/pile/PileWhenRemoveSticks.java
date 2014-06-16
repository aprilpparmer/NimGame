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
	
	/**
	 * Tests that a pile has 3 sticks left after removing 2 sticks from a 5 stick pile.
	 */
	@Test
	public void testShouldHave3SticksLeftAfterRemoving2SticksFrom5StickPile() {
		Pile fiveStickPile = new Pile(5);
		fiveStickPile.removeSticks(2);
		assertEquals(3, fiveStickPile.getSticksLeft());
	}
	
	/**
	 * Tests that a pile has 20 sticks left after removing 10 sticks from a 30 stick pile.
	 */
	@Test
	public void testShouldHave20SticksLeftAfterRemoving10SticksFrom30StickPile() {
		Pile thirtyStickPile = new Pile(30);
		thirtyStickPile.removeSticks(10);
		assertEquals(20, thirtyStickPile.getSticksLeft());
	}

}
