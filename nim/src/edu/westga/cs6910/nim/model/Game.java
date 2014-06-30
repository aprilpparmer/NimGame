package edu.westga.cs6910.nim.model;

import java.util.Observable;

/**
 * Game represents a Nim game with 1 pile of sticks.
 * @author CS 6910
 * @author April Parmer
 * @version Summer 2014
 */
public class Game extends Observable {

	/**
	 * Constant to define the initial pile size
	 */
	public static final int INITIAL_PILE_SIZE = 9;
	/**
	 * Constant to define the maximum number of sticks to be
	 *  removed per turn
	 */
	public static final int MAX_STICKS_PER_TURN = 3;

	private Player currentPlayer;
	private Player otherPlayer;

	private HumanPlayer theHuman;
	private ComputerPlayer theComputer;

	private Pile thePile;

	/**
	 * Creates a nim Game with the specified Players and a pile
	 * of INITIAL_PILE_SIZE sticks.
	 * 
	 * @param theComputer
	 *            the automated player
	 * @param theHuman
	 *            the human player
	 * 
	 * @require theHuman != null && theComputer != null
	 * 
	 * @ensure humanPlayer().equals(theHuman) &&
	 *         computerPlayer.equals(theComputer) &&
	 *         sticksLeft() == INITIAL_PILE_SIZE
	 */
	public Game(HumanPlayer theHuman, ComputerPlayer theComputer) {
		this.theHuman = theHuman;
		this.theComputer = theComputer;
		
		this.currentPlayer = null;
		this.otherPlayer = null;
		
		this.thePile = new Pile(INITIAL_PILE_SIZE);
	}

	
	// *********************** mutator methods *************************

	/**
	 * Initializes the game for play.
	 * 
	 * @param firstPlayer 	the Player who takes the first turn
	 * @param secondPlayer	the Player who takes the second turn
	 * 
	 * @require firstPlayer != null && 
	 * 			secondPlayer != null &&
	 * 			!firstPlayer.equals(secondPlayer)
	 * 
	 * @ensures whoseTurn().equals(firstPlayer) &&
	 * 			sticksLeft() == INITIAL_PILE_SIZE
	 */
	public void startNewGame(Player firstPlayer, Player secondPlayer) {
		this.currentPlayer = firstPlayer;
		this.otherPlayer = secondPlayer;
		this.thePile = new Pile(INITIAL_PILE_SIZE);
	}

	/**
	 * Conducts a move in the game, allowing the appropriate Player to
	 * take a turn. Has no effect if the game is over.
	 * 
	 * @requires !isGameOver()
	 * 
	 * @ensures !whoseTurn().equals(whoseTurn()@prev) &&
	 * 			sticksLeft() < sticksLeft()@prev
	 */
	public void play() {
		// TODO: 1. Tell the current player to take its turn.
		//		 2. Swap whose turn it is.
		//		 3. Tell all observers that a significant change
		//			occurred: set the changed flag and notify observers.
		//          See http://tinyurl.com/javaObserverPattern

		this.getCurrentPlayer().takeTurn();
		this.swapWhoseTurn();
		setChanged();
		notifyObservers();
		
		
	}

	// *********************** accessor methods *************************

	/**
	 * Returns the human Player object.
	 * 
	 * @return the human Player
	 */
	public HumanPlayer getHumanPlayer() {
		return this.theHuman;
	}

	/**
	 * Returns the computer Player object.
	 * 
	 * @return the computer Player
	 */
	public ComputerPlayer getComputerPlayer() {
		return this.theComputer;
	}
	
	/**
	 * Returns the Player whose turn it is.
	 * 
	 * @return	the current Player
	 */
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	/**
	 * Returns the Player whose turn it is not.
	 * 
	 * @return the other Player
	 */
	public Player getOtherPlayer() {
		return this.otherPlayer;
	}
	
	/**
	 * Returns the number of sticks remaining in the pile.
	 * 
	 * @return how many sticks are left in the pile
	 */
	public int getSticksLeft() {
		return this.thePile.getSticksLeft();
	}

	/**
	 * Return whether the game is over.
	 * 
	 * @return true if sticksLeft() == 1
	 */
	public boolean isGameOver() {
		return this.thePile.getSticksLeft() == 1;
	}
	
	/**
	 * Returns the Pile used in this Game.
	 * 
	 * @return	the Pile
	 */
	public Pile getPile() {
		return this.thePile;
	}


	/**
	 * Returns a String representing the pile size, or, if
	 * the game is over, the name of the winner.
	 * 
	 * @return a String representation of this Game
	 */
	public String toString() {
		if (this.isGameOver()) {
			String gameOver = "Game over! Winner: " + this.otherPlayer.getName();
			return gameOver;
		}

		return " Pile size: " + this.thePile.getSticksLeft();
	}

	
	
	// ************************ private helper method *************************

	private void swapWhoseTurn() {
		// TODO: Swap the players so that the other player becomes 
		//       the current player and vice versa. 
		if (getCurrentPlayer() == this.theHuman) {
			this.currentPlayer = this.theComputer;
			
		} else {
			this.currentPlayer = this.theHuman;
		}
		
	}
	
}
