/**
 * 
 */
package edu.westga.cs6910.nim.testing.HumanPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the setPileForThisTurn and getPileForThisTurn methods of the HumanPlayer class.
 * @author April PArmer
 * @version Summer 2014
 *
 */
public class HumanPlayerSetPileGetPile {

	/**
	 * Sets a pile of 10 for this turn, and then returns it.
	 */
	@Test
	public void testSetPile10GetPile() {
		Pile pile = new Pile(10);
		AbstractPlayer john = new HumanPlayer("John");
		john.setPileForThisTurn(pile);
		assertEquals("Pile size: 10", john.getPileForThisTurn().toString());
	}
	
	/**
	 * Sets a pile of 5 for this turn, and then returns it.
	 */
	@Test
	public void testSetPile5GetPile() {
		Pile pile = new Pile(5);
		AbstractPlayer john = new HumanPlayer("John");
		john.setPileForThisTurn(pile);
		assertEquals("Pile size: 5", john.getPileForThisTurn().toString());
	}

}
