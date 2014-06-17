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
 * Tests functionality of getComputerPlayer method of the Game class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class GameGetComputerPlayer {

	/**
	 * Creates a HumanPlayer John and computer player, returns computer player's name.
	 */
	@Test
	public void test() {
		HumanPlayer john = new HumanPlayer("John");
		ComputerPlayer comp = new ComputerPlayer();
		Game game = new Game(john, comp);
		assertEquals("Simple computer", game.getComputerPlayer().getName());
	}

}
