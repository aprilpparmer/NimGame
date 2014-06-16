/**
 * 
 */
package edu.westga.cs6910.nim.testing.pile;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.Pile;

/**
 * This class tests the creation of a Constructor in the Pile class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class PileIsCreated {

	/**
	 * Tests the creation of a Pile with 1 stick.
	 */
	@Test
	public void testShouldProducePileWith1Stick() {
		Pile oneStickPile = new Pile(1);
		assertEquals("Pile size: 1", oneStickPile.toString());
	}

}
