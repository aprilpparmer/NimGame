/**
 * 
 */
package edu.westga.cs6910.nim.testing.HumanPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.HumanPlayer;

/**
 * Tests the creation of a HumanPlayer by calling the toString method.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class HumanPlayerCreated {

	/**
	 * Creates a HumanPlayer with the name of "John" and 0 sticks to take.
	 */
	@Test
	public void testCreatHumanPlayerJohnWith0Sticks() {
		AbstractPlayer john = new HumanPlayer("John");
		assertEquals("Human Player named: John with 0 sticks to take", john.toString());
	}

	/**
	 * Creates a HumanPlayer with the name of "Donna" and 0 sticks to take.
	 */
	@Test
	public void testCreateHumanPlayerDonnaWith0Sticks() {
		AbstractPlayer donna = new HumanPlayer("Donna");
		assertEquals("Human Player named: Donna with 0 sticks to take", donna.toString());
	}

	/**
	 * Creates a HumanPlayer with the name of "David" and 0 sticks to take.
	 */
	@Test
	public void testCreateHumanPlayerDavidWith0Sticks() {
		AbstractPlayer david = new HumanPlayer("David");
		assertEquals("Human Player named: David with 0 sticks to take", david.toString());
	}
}
