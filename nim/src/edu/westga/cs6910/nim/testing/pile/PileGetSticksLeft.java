/**
 * 
 */
package edu.westga.cs6910.nim.testing.pile;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the functionality of the getSticksLeft method in the Pile class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class PileGetSticksLeft {

	/**
	 * Tests that 1 stick is left in the pile.
	 */
	@Test
	public void testWith1StickPileShouldHave1StickLeft() {
		Pile oneStickPile = new Pile(1);
		assertEquals(1, oneStickPile.getSticksLeft());
	}
	
	/**
	 * Tests that 5 sticks are left in the pile.
	 */
	@Test
	public void testWith5SticksPileShouldHave5SticksLeft() {
		Pile fiveSticksPile = new Pile(5);
		assertEquals(5, fiveSticksPile.getSticksLeft());
	}
	
	/**
	 * Tests that 30 sticks are left in the pile.
	 */
	@Test
	public void testWith30SticksPileShouldHave30SticksLeft() {
		Pile thirtySticksPile = new Pile(30);
		assertEquals(30, thirtySticksPile.getSticksLeft());
	}

}
