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
		this.sticksToTake = 0;
	}
	
	public void takeTurn() {
		this.thePile.removeSticks(this.sticksToTake);
	}
	
	
}
