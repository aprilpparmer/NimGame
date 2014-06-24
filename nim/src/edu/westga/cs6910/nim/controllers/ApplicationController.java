/**
 * 
 */
package edu.westga.cs6910.nim.controllers;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.view.Gui;

/**
 * Driver for the application. Creates the GUI in its
 * own thread and shows it.
 * 
 * @author CS6910
 * @version Summer 2014
 *
 */
public class ApplicationController {

	/**
	 * Creates the game and the players, and runs the GUI in its
	 * own thread so it can run independently.
	 * 
	 * @param args	not used
	 * 
	 * @ensures The GUI is visible and running
	 */
	public static void main(String[] args) {		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CautiousStrategy strategy = new CautiousStrategy();
				new Gui(new Game(new HumanPlayer("Me"), 
								 new ComputerPlayer(strategy)));
			}
		});
	}

}
