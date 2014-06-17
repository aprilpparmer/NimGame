package edu.westga.cs6910.nim.testing.ComputerPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;

/**
 * Tests the functionality of setPileForThisTurn and getPileForThisTurn in the ComputerPlayer class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class ComputerPlayerSetPileGetPile {

	/**
	 * Sets a Pile of 5 sticks and returns it.
	 */
	@Test
	public void testSetPile5GetPile() {
		AbstractPlayer comp = new ComputerPlayer();
		Pile pile = new Pile(5);
		
		comp.setPileForThisTurn(pile);
		assertEquals("Pile size: 5",  comp.getPileForThisTurn().toString());
	}
	
	/**
	 * Sets a Pile of 10 sticks and returns it.
	 */
	@Test
	public void testSetPile10GetPile() {
		AbstractPlayer comp = new ComputerPlayer();
		Pile pile = new Pile(10);
		
		comp.setPileForThisTurn(pile);
		assertEquals("Pile size: 10", comp.getPileForThisTurn().toString());
	}
	
	/**
	 * Sets a Pile of 15 sticks and returns it.
	 */
	@Test
	public void testSetPile15GetPile() {
		AbstractPlayer comp = new ComputerPlayer();
		Pile pile = new Pile(15);
		
		comp.setPileForThisTurn(pile);
		assertEquals("Pile size: 15", comp.getPileForThisTurn().toString());
	}

}
