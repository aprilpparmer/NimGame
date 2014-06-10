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
	private static final String NAME = "Simple computer";
	private String name;
	private Pile thePile;
	private int sticksToTake;
	
	
	public AbstractPlayer() {
		
	}
	
	public void takeTurn() {
		this.thePile.removeSticks(this.sticksToTake);
	}
	
	
}
