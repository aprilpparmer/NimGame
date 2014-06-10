package edu.westga.cs6910.nim.model;

// TODO: Classes ComputerPlayer and HumanPlayer share most of their code.
//		 Refactor their code:
// 		 1. Create abstract base class AbstractPlayer to implement the
//			shared code and define abstract methods for methods without
//			duplicate code. AbstractPlayer should implement interface Player.
//		 2. Have ComputerPlayer and HumanPlayer extend AbstractPlayer to
//		    implement the unshared constructor code and the abstract methods.

/**
 * ComputerPlayer represents a very simple automated player in the game Nim.
 * It removes 1 stick at a time.
 * 
 * @author CS 6910
 * @author April Parmer
 * @version Summer 2014
 */
public class ComputerPlayer extends AbstractPlayer implements Player {
	
	private static final String NAME = "Simple computer";
	
	private String name;
	private int sticksToTake;


	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 */
	public ComputerPlayer() {
		super(NAME);
	}
	
	
	//*************************** accessor methods ****************************

	/**
	 * Returns a String representation of this ComputerPlayer by giving its name 
	 * 	and number of sticks to take
	 * 
	 * @return	A String representation of the object
	 */
	public String toString() {
		return "Computer Player named: " + this.name
				+ " with " + this.sticksToTake + " sticks to take";
	}

}
