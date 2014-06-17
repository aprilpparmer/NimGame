package edu.westga.cs6910.nim.testing.ComputerPlayer;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.AbstractPlayer;
import edu.westga.cs6910.nim.model.ComputerPlayer;

/**
 * Tests the functionality of setNumberSticksToTake and getSticksOnThisTurn
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class ComputerPlayerSetNumberOfSticksGetSticks {

	/**
	 * Sets the number of sticks to take to 3, and returns it.
	 */
	@Test
	public void testSet3SticksGet3Sticks() {
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setNumberSticksToTake(3);
		assertEquals(3, comp.getSticksOnThisTurn());
	}

	/**
	 * Sets the number of sticks to take to 2, and returns it.
	 */
	@Test
	public void testSet2SticksGet2Sticks() {
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setNumberSticksToTake(2);
		assertEquals(2, comp.getSticksOnThisTurn());
	}
	
	/**
	 * Sets the number of sticks to take to 1, and returns it.
	 */
	@Test
	public void testSet1StickGet1Stick() {
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setNumberSticksToTake(1);
		assertEquals(1, comp.getSticksOnThisTurn());
	}
	
	/**
	 * Sets the number of sticks to the default amount (1), and returns it.
	 */
	@Test
	public void testSetDefaultStickGet1Stick() {
		AbstractPlayer comp = new ComputerPlayer();
		
		comp.setNumberSticksToTake();
		assertEquals(1, comp.getSticksOnThisTurn());
	}
}
