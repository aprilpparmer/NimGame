package edu.westga.cs6910.nim.testing.ComputerPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the functionality of the takeTurn method of the ComputerPlayer class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class ComputerPlayerSetStickSetPileTakeTurnGetPile {

	/**
	 * Tests takeTurn method by taking 3 sticks from a pile of 10, and returning the 7 that are left.
	 */
	@Test
	public void testSetPile10Sticks3TakeTurnGetPile7() {
		Pile pile = new Pile(10);
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setPileForThisTurn(pile);
		comp.setNumberSticksToTake(3);
		comp.takeTurn();
		assertEquals("Pile size: 7", comp.getPileForThisTurn().toString());
	}
	
	/**
	 * Tests takeTurn method by taking 2 sticks from a pile of 6, and returning the 4 that are left.
	 */
	@Test
	public void testSetPile6Sticks2TakeTurnGetPile4() {
		Pile pile = new Pile(6);
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setPileForThisTurn(pile);
		comp.setNumberSticksToTake(2);
		comp.takeTurn();
		assertEquals("Pile size: 4", comp.getPileForThisTurn().toString());
	}
	
	/**
	 * Tests takeTurn method by taking 1 stick from a pile of 3, and returning the 2 that are left.
	 */
	@Test
	public void testSetPile3Sticks1TakeTurnGetPile2() {
		Pile pile = new Pile(3);
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setPileForThisTurn(pile);
		comp.setNumberSticksToTake(1);
		comp.takeTurn();
		assertEquals("Pile size: 2", comp.getPileForThisTurn().toString());
	}

}

