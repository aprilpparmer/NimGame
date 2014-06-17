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

}
