package edu.westga.cs6910.nim.testing.HumanPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the functionality of the takeTurn method of the HumanPlayer class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class HumanPlayerSetStickSetPileTakeTurnGetPile {

	/**
	 * Tests takeTurn method by taking 3 sticks from a pile of 10, and returning the 7 that are left.
	 */
	@Test
	public void testSetPile10Sticks3TakeTurnGetPile7() {
		Pile pile = new Pile(10);
		AbstractPlayer john = new HumanPlayer("John");
		
		john.setPileForThisTurn(pile);
		john.setNumberSticksToTake(3);
		john.takeTurn();
		assertEquals("Pile size: 7", john.getPileForThisTurn().toString());
	}
	
	/**
	 * Tests takeTurn method by taking 2 sticks from a pile of 6, and returning the 4 that are left.
	 */
	@Test
	public void testSetPile6Sticks2TakeTurnGetPile4() {
		Pile pile = new Pile(6);
		AbstractPlayer john = new HumanPlayer("John");
		
		john.setPileForThisTurn(pile);
		john.setNumberSticksToTake(2);
		john.takeTurn();
		assertEquals("Pile size: 4", john.getPileForThisTurn().toString());
	}

}
