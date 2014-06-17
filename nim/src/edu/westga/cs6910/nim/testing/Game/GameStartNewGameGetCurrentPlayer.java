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
 * Tests the startNewGame and getCurrentPlayer methods of the Game class.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public class GameStartNewGameGetCurrentPlayer {

	/**
	 * Starts a game with human player first.
	 */
	@Test
	public void testStartHumanJohnFirst() {
		HumanPlayer john = new HumanPlayer("John");
		ComputerPlayer comp = new ComputerPlayer();
		Game game = new Game(john, comp);
		
		game.startNewGame(john, comp);
		assertEquals("John", game.getCurrentPlayer().getName());
	}

}
