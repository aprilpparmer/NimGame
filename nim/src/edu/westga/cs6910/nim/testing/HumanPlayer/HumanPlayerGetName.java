/**
 * 
 */
package edu.westga.cs6910.nim.testing.HumanPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.HumanPlayer;

/**
 * Tests the functionality of the getName method of the HumanPlayer class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class HumanPlayerGetName {

	/**
	 * Returns the name of a human player named Sally.
	 */
	@Test
	public void testHumanPlayerGetNameSally() {
		AbstractPlayer sally = new HumanPlayer("Sally");
		assertEquals("Sally", sally.getName());
	}

	/**
	 * Returns the name of a human player named Bob.
	 */
	@Test
	public void testHumanPlayerGetNameBob() {
		AbstractPlayer bob = new HumanPlayer("Bob");
		assertEquals("Bob", bob.getName());
	}
	
	/**
	 * Returns the name of a human player named Jake.
	 */
	@Test
	public void testHumanPlayerGetNameJake() {
		AbstractPlayer jake = new HumanPlayer("Jake");
		assertEquals("Jake", jake.getName());
	}
	
}
