package edu.westga.cs6910.nim.view;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Observable;
import java.util.Observer;

import edu.westga.cs6910.nim.model.Game;

/**
 * Defines the panel that displays either the number of sticks left on the
 * pile or the winner if the game is over.
 * 
 * @author CS 6910
 * @version Summer 2014
 */
public class GameStatusPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 140604L;
	
	private JLabel lblStatusLabel;	
	private Game theGame;
	
	
	/**
	 * Creates a new GameStatusPanel that observes the specified game. 
	 * 
	 * @param theGame	the model object from which this panel gets its data
	 * 
	 * @requires 	theGame != null
	 * @ensures		theGame.countObservers() = theGame.countObservers()@prev + 1
	 */
	public GameStatusPanel(Game theGame)  {
		super();
		
		this.theGame = theGame;		
		this.theGame.addObserver(this);
		
		this.setBorder(BorderFactory.createTitledBorder("Game info"));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.lblStatusLabel = new JLabel(this.theGame.toString());
		
		
		this.add(this.lblStatusLabel);
	}
		
	@Override	
	/**
	 * Sets this Panel's text to show the return value of the Game's
	 * toString() method. Called when the observed Game object notifies
	 * this Panel that a Player took a turn. 
	 * 
	 * @param observableObject		not used
	 * @param arg					not used
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 * 
	 * @ensures the panel's text displays either the number of sticks left
	 * pile or the winner if the game is over.
	 */

	public void update(Observable observableObject, Object arg) {
		this.lblStatusLabel.setText(this.theGame.toString());
	}

}
