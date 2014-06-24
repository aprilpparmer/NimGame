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
public class ComputerPlayer extends AbstractPlayer {
	
	private static final String NAME = "Simple computer";
	
	private int sticksToTake;
	private NumberOfSticksStrategy numberOfSticksStrategy;


	/**
	 * Creates a new ComputerPlayer with the specified name.
	 */
	public ComputerPlayer() {
		super(NAME);
		this.numberOfSticksStrategy = new CautiousStrategy();
	}
	
	/**
	 * Creates a new ComputerPlayer with a specified strategy.
	 * 
	 * @param numberOfSticksStrategy - the numberOfSticksStrategy being implemented
	 * 		by the ComputerPlayer
	 * 
	 * Precondition: numberOfSticksStrategy must not be null
	 */
	public ComputerPlayer(NumberOfSticksStrategy numberOfSticksStrategy) {
		super(NAME);
		if (numberOfSticksStrategy == null) {
			throw new IllegalArgumentException("The strategy does not exist");
		}
		this.numberOfSticksStrategy = numberOfSticksStrategy;
	}
	
	@Override
	/**
	 * Sets the number of sticks to take to how many sticks are defined by the strategy.
	 * 
	 * Postcondition: sticksOnThisTurn() >= 1 && 
	 * 		sticksOnThisTurn() <= Math.min(pileForThisTurn.sticksLeft() - 1), 
	 * 		GAME.MAX_STICKS_PER_TURN
	 */
	public void setNumberSticksToTake() {
		this.sticksToTake = 
				this.numberOfSticksStrategy.howManySticks(super.getPileForThisTurn().getSticksLeft());
		super.setNumberSticksToTake(this.sticksToTake);
	}
	
	//*************************** accessor methods ****************************

	/**
	 * Returns a String representation of this ComputerPlayer by giving its name 
	 * 	and number of sticks to take
	 * 
	 * @return	A String representation of the object
	 */
	public String toString() {
		return "Computer Player named: " + this.getName()
				+ " with " + this.sticksToTake + " sticks to take";
	}

}
