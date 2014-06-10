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

	private Pile thePile;


	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 */
	public ComputerPlayer() {
		super(NAME);
	}
	
	
	//*************************** mutator methods ****************************

	@Override
	/**
	 * @see Player#setPileForThisTurn(Pile)
	 */	
	public void setPileForThisTurn(Pile aPile) {
		if (aPile == null) {
			throw new IllegalArgumentException("Invalid Pile");
		}
		this.thePile = aPile;
		
	}


	@Override
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

	@Override	
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

	
	
	//*************************** accessor methods ****************************

	@Override	
	/**
	 * @see Player#getName()
	 */

	public String getName() {
		return this.name;
	}

	@Override	
	/**
	 * @see Player#getSticksOnThisTurn()
	 */

	public int getSticksOnThisTurn() {
		return this.sticksToTake;
	}
	
	@Override	
	/**
	 * @see Player#getPileForThisTurn()
	 */

	public Pile getPileForThisTurn() {
		return this.thePile;
	}

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
