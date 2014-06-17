/**
 * 
 */
package edu.westga.cs6910.nim.testing.Game;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;

/**
 * Tests the functionality of the getHumanPlayer method of the Game class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class GameGetHumanPlayer {

	/**
	 * Creates a Game with HumanPlayer John and ComputerPlayer Simple computer
	 */
	@Test
	public void testGetHumanPlayerJohn() {
		HumanPlayer john = new HumanPlayer("John");
		ComputerPlayer comp = new ComputerPlayer();
		Game game = new Game(john, comp);
		assertEquals("John", game.getHumanPlayer().getName());
	}

	/**
	 * Creates a Game with HumanPlayer April and ComputerPlayer Simple computer
	 */
	@Test
	public void testGetHumanPlayerApril() {
		HumanPlayer april = new HumanPlayer("April");
		ComputerPlayer comp = new ComputerPlayer();
		Game game = new Game(april, comp);
		assertEquals("April", game.getHumanPlayer().getName());
	}
	
	/**
	 * Creates a Game with HumanPlayer David and ComputerPlayer Simple computer
	 */
	@Test
	public void testGetHumanPlayerDavid() {
		HumanPlayer david = new HumanPlayer("David");
		ComputerPlayer comp = new ComputerPlayer();
		Game game = new Game(david, comp);
		assertEquals("David", game.getHumanPlayer().getName());
	}	
}
