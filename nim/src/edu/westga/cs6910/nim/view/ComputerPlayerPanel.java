package edu.westga.cs6910.nim.view;

import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;

/**
 * Defines the panel that lets the user tell the computer player to
 * take its turn and that displays the number of sticks the computer
 * player took on its turn.
 * 
 * @author CS 6910
 * @author April Parmer
 * @version Summer 2014
 */
public class ComputerPlayerPanel extends JPanel implements Observer {

	private Game theGame;
	private static final long serialVersionUID = 140604L;
	private JLabel lblNumberTaken;
	private ComputerPlayer theComputer;

	/**
	 * Creates a new ComputerPlayerPanel that observes the specified game. 
	 * 
	 * @param theGame	the model object from which this panel gets its data
	 * 
	 * @requires 	theGame != null
	 * @ensures		theGame.countObservers() = theGame.countObservers()@prev + 1
	 */
	public ComputerPlayerPanel(Game theGame) {
		this.theGame = theGame;
		
		// TODO: Add this object as an observer of this.theGame.
		//       See http://tinyurl.com/javaObserverPattern
		 
		this.theGame.addObserver(this);
		this.theComputer = this.theGame.getComputerPlayer();
		
		this.buildPanel();
	}

	

	/** 
	 * Sets whether or not this panel and its components are enabled.
	 * 
	 * @param  enabled true if this component should be enabled, false otherwise	
	 * @see javax.swing.JComponent#setEnabled(boolean)
	 * 
	 * @ensures enabled() == enabled &&		<br />
	 * 			for each Component c in getComponents(), c.enabled() == enabled
	 */
	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		
		for (Component aComponent: this.getComponents()) {
			aComponent.setEnabled(!aComponent.isEnabled());
		}
	}
	

	
	/**
	 * Sets this Panel's text to show the number of sticks this Player removed
	 * in its most recent turn and enables or disables this Panel and it
	 * components. Called when the observed Game object notifies this Panel
	 * that a Player took a turn. 
	 * 
	 * @param arg0	not used
	 * @param arg1	not used
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 * 
	 * @ensures the panel's text is changed && isEnabled() == !isEnabled@prev
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO: 1. Set the text of this.lblNumberTaken to the number of
		//          sticks taken by the computer player.
		//       2. Swap this panel's enabled status from enabled to disabled
		//			or vice versa.
			
		String sticks = Integer.toString(this.theComputer.getSticksOnThisTurn());
		this.lblNumberTaken.setText("Number of sticks taken: " + sticks);
		
		
		this.setEnabled(!this.isEnabled());
		if (this.isEnabled() && !this.theGame.isGameOver()) {
			this.theComputer.setPileForThisTurn(ComputerPlayerPanel.this.theGame.getPile());
			this.theComputer.setNumberSticksToTake();
			this.theGame.play();
			JOptionPane.showMessageDialog(null, "The Computer Player took: " + 
					this.theComputer.getSticksOnThisTurn() + " stick(s) from the pile.");
		}
	}
	
	
	
	//*********************** private helper method ***************************
	
	private void buildPanel() {
		// TODO: Using the other panel classes as a model, build this panel.
		this.setBorder(BorderFactory.createTitledBorder(this.theComputer.getName()));
		
		this.lblNumberTaken = new JLabel("Number of sticks taken: " + this.theComputer.getSticksOnThisTurn());
		this.add(this.lblNumberTaken);

	}

}
