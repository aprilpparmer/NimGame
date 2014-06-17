package edu.westga.cs6910.nim.model;

/**
 * HumanPlayer represents a human player in the game Nim.
 * 
 * @author CS 6910
 * @author April Parmer
 * @version Summer 2014
 */
public class HumanPlayer extends AbstractPlayer {

	private int sticksToTake;
	private Pile thePile;

	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 * @param name
	 *            this Player's name
	 * 
	 * @requires name != null
	 * @ensure name().equals(name) && sticksRemoved() == 0
	 */
	public HumanPlayer(String name) {
		super(name);
	}

	// ************************** mutator methods ********************************
	
	@Override	
	/**
	 * @see Player#setPileForThisTurn(Pile)
	 */

	public void setPileForThisTurn(Pile aPile) {
		super.setPileForThisTurn(aPile);
		this.thePile = aPile;

	}
	
	@Override
	/**
	 * Implements Player's setNumberSticksToTake() to set the number
	 * of sticks to the maximum allowed for this turn.
	 * 
	 * @ensure  sticksOnThisTurn() == 
	 * 					Math.min(pileForThisTurn.sticksLeft()-1, 
	 * 							 Game.MAX_STICKS_PER_TURN)
	 * 
	 * @see Player#setNumberSticksToTake()
	 */
	public void setNumberSticksToTake() { 
		this.sticksToTake = 
				Math.min(this.thePile.getSticksLeft() - 1, Game.MAX_STICKS_PER_TURN);
		super.setNumberSticksToTake(this.sticksToTake);
	}
	
	/**
	 * Returns a String representation of this HumanPlayer by giving its name 
	 * 	and number of sticks to take
	 * 
	 * @return	A String representation of the object
	 */
	public String toString() {
		return "Human Player named: " + this.getName()
				+ " with " + this.sticksToTake + " sticks to take";
	}
}
