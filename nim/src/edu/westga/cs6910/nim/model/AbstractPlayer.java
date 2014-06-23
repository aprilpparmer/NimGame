/**
 * 
 */
package edu.westga.cs6910.nim.model;

/**
 * Abstract superclass defining different aspects of a player.
 * 
 * @author April Parmer
 * @version Summer 2014
 *
 */
public abstract class AbstractPlayer implements Player {
	private Pile thePile;
	private int sticksToTake;
	private String name;
	
	
	public AbstractPlayer(String name) {
		this.name = name;
	}
	
	/**
	 * @see Player#takeTurn(Pile)
	 */
	public void takeTurn() {
		this.thePile.removeSticks(this.sticksToTake);
	}

	/**
	 * Implements Player's setNumberSticksToTake(int), but is not
	 * normally called by clients objects. Instead, clients usually
	 * call the 0-parameter version.
	 * 
	 * @see Player#setNumberSticksToTake(int)
	 */
	public void setNumberSticksToTake(int number) {
		this.sticksToTake = number;
	}
	
	/**
	 * Implements Player's setNumberSticksToTake() to set the number
	 * of sticks to 1.
	 * 
	 * @ensure  sticksOnThisTurn() == 1
	 * 
	 * @see Player#setNumberSticksToTake()
	 */
	public void setNumberSticksToTake() {
		this.sticksToTake = 1;
	}
	
	/**
	 * @see Player#getName()
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * @see Player#getSticksOnThisTurn()
	 */

	public int getSticksOnThisTurn() {
		return this.sticksToTake;
	}

	/**
	 * @see Player#setPileForThisTurn(Pile)
	 */	
	public void setPileForThisTurn(Pile aPile) {
		if (aPile == null) {
			throw new IllegalArgumentException("Invalid Pile");
		}
		this.thePile = aPile;
	}
	/**
	 * @see Player#getPileForThisTurn()
	 */

	public Pile getPileForThisTurn() {
		return this.thePile;
	}

	
}
