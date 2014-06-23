package edu.westga.cs6910.nim.testing.CautiousStrategy;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;

/**
 * Tests the functionality of the howManySticks method of the CautiousStrategy class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class WhenTestHowManySticks {

	/**
	 * Tests that 1 stick is returned on a pile size of 10.
	 */
	@Test
	public void testReturn1StickPile10() {
		CautiousStrategy game = new CautiousStrategy();
		assertEquals(1, game.howManySticks(10));
	}

	/**
	 * Tests that 1 stick is returned on a pile size of 5.
	 */
	@Test
	public void testReturn1StickPile5() {
		CautiousStrategy game = new CautiousStrategy();
		assertEquals(1, game.howManySticks(5));
	}
	
	/**
	 * Tests that 1 stick is returned on a pile size of 2.
	 */
	@Test
	public void testReturn1StickPile2() {
		CautiousStrategy game = new CautiousStrategy();
		assertEquals(1, game.howManySticks(2));
	}
}
