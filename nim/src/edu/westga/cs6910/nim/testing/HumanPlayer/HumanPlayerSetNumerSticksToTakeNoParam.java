package edu.westga.cs6910.nim.testing.HumanPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the functionality of the setNumberSticksToTake method without parameters.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class HumanPlayerSetNumerSticksToTakeNoParam {

	/**
	 * Sets a Pile of 3 sticks, takes the default amount, leaving 1.
	 */
	@Test
	public void testPile3SticksTakeDefault() {
		AbstractPlayer john = new HumanPlayer("John");
		Pile pile = new Pile(3);
		
		john.setPileForThisTurn(pile);
		john.setNumberSticksToTake();
		john.takeTurn();
		assertEquals("Pile size: 1", john.getPileForThisTurn().toString());
	}
	
	/**
	 * Sets a Pile of 4 sticks, takes the default amount, leaving 1.
	 */
	@Test
	public void testPile4SticksTakeDefault() {
		AbstractPlayer john = new HumanPlayer("John");
		Pile pile = new Pile(4);
		
		john.setPileForThisTurn(pile);
		john.setNumberSticksToTake();
		john.takeTurn();
		assertEquals("Pile size: 1", john.getPileForThisTurn().toString());
	}
	
	/**
	 * Sets a Pile of 6 sticks, takes the default amount, leaving 3.
	 */
	@Test
	public void testPile6SticksTakeDefault() {
		AbstractPlayer john = new HumanPlayer("John");
		Pile pile = new Pile(6);
		
		john.setPileForThisTurn(pile);
		john.setNumberSticksToTake();
		john.takeTurn();
		assertEquals("Pile size: 3", john.getPileForThisTurn().toString());
	}

}
