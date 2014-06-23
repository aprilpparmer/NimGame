package edu.westga.cs6910.nim.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.Player;

/**
 * Defines a GUI for the 1-pile Nim game.
 *  
 * @author CS 6910
 * @author April Parmer
 * @version Summer 2014
 */
public class Gui {

	private JFrame theFrame;
	private Container contentPane;	
	
	private JPanel pnlHumanPlayer;
	private JPanel pnlComputerPlayer;
	private JPanel pnlGameInfo;
	private JPanel pnlChooseFirstPlayer;
	
	private Game theGame;	
	
	
	/**
	 * Creates a Gui object to provide the view for the specified
	 * Game model object.
	 * 
	 * @param theGame	the domain model object representing the Nim game
	 * 
	 * @requires theGame != null
	 * @ensures	 the GUI is displayed
	 */
	public Gui(Game theGame) {
		this.theGame = theGame;
		this.createAndShowGUI();
		this.buildMenuBar();
	}
	
	
	
	//****************************** private helper methods *******************

	private void createAndShowGUI() {
		this.theFrame = new JFrame("Simple Nim");
		
		this.theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.theFrame.setLayout(new BorderLayout());
				
		this.contentPane = this.theFrame.getContentPane();
		this.buildContentPane();

		this.theFrame.setMinimumSize(new Dimension(800, 200));
		this.theFrame.pack();
		this.theFrame.setVisible(true);
		
		this.theFrame.setJMenuBar(this.buildMenuBar());
		
	}

	private void buildContentPane() {
		
		this.pnlChooseFirstPlayer = 
				new NewGamePanel(this.theGame);
		this.contentPane.add(this.pnlChooseFirstPlayer, 
							 BorderLayout.NORTH);
		
		// TODO: 1. Instantiate this.pnlHumanPlayer, add it to
		//			the content pane at the left, and disable it.
		//		 2. Instantiate this.pnlGameInfo and add it to
		//			the content pane in the middle.
		//		 3. Instantiate this.pnlComputerPlayer, add it to
		//			the content pane at the right, and disable it.
		
		this.pnlHumanPlayer = new HumanPlayerPanel(this.theGame);
		this.contentPane.add(this.pnlHumanPlayer, BorderLayout.WEST);
		this.pnlHumanPlayer.setEnabled(false);
		
		this.pnlGameInfo = new GameStatusPanel(this.theGame);
		this.contentPane.add(this.pnlGameInfo, BorderLayout.CENTER);
		
		this.pnlComputerPlayer = new ComputerPlayerPanel(this.theGame);
		this.contentPane.add(this.pnlComputerPlayer, BorderLayout.EAST);
		this.pnlComputerPlayer.setEnabled(false);
		
		
	}
	
	/**
	 * Builds Menu Bar
	 * @return menuBar
	 */
	private JMenuBar buildMenuBar() {
	JMenuBar menuBar = new JMenuBar();
	menuBar.add(this.setFileMenu());
	menuBar.add(this.setSettingsMenu());
	
	return menuBar;
	}
	
	/**
	 * Builds the File Menu
	 * @return file menu
	 */
	private JMenu setFileMenu() {
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setMnemonic(KeyEvent.VK_X);
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
		file.add(exitMenuItem);
		
		return file;
	}
	
	/**
	 * Builds settings menu
	 * @return settings menu
	 */
	private JMenu setSettingsMenu() {
		JMenu settings = new JMenu("Settings");
		settings.setMnemonic(KeyEvent.VK_S);
		settings.add(this.setComputerPlayerMenu());
		
		return settings;
	}
	
	/**
	 * Builds computer player menu
	 * @return computer player menu
	 */
	private JMenu setComputerPlayerMenu() {
		JMenu computerPlayerItem = new JMenu("Computer Player");
		computerPlayerItem.setMnemonic(KeyEvent.VK_P);
		
		JMenuItem cautious = new JMenuItem("Cautious");
		cautious.setMnemonic(KeyEvent.VK_C);
		computerPlayerItem.add(cautious);
		
		JMenuItem greedy = new JMenuItem("Greedy");
		greedy.setMnemonic(KeyEvent.VK_G);
		computerPlayerItem.add(greedy);
		
		JMenuItem random = new JMenuItem("Random");
		random.setMnemonic(KeyEvent.VK_R);
		computerPlayerItem.add(random);
		
		return computerPlayerItem;
	}
	
	
	//************************* private inner classes *************************
	
	/*
	 * Defines the panel in which the user selects which Player plays first.
	 */
	private final class NewGamePanel extends JPanel {

		private static final long serialVersionUID = 140604L;
		
		private JRadioButton radHumanPlayer;
		private JRadioButton radComputerPlayer;
		
		private Game theGame;
		private Player theHuman;
		private Player theComputer;

		private NewGamePanel(Game theGame) {
			this.theGame = theGame;
			
			this.theHuman = this.theGame.getHumanPlayer();
			this.theComputer = this.theGame.getComputerPlayer();
			
			
			this.buildPanel();
		}
		
		private void buildPanel() {
			this.setBorder(BorderFactory.createTitledBorder("Select first player"));	
			
			this.radHumanPlayer = new JRadioButton("Human first");	
			this.radHumanPlayer.addActionListener(new HumanFirstListener());
			
			// TODO: Instantiate this.radComputerPlayer and add 
			//		 ComputerFirstListener as its action listener.
			
			this.radComputerPlayer = new JRadioButton("Computer first");
			this.radComputerPlayer.addActionListener(new ComputerFirstListener());
			
			// TODO: Create a ButtonGroup and add the 2 radio buttons to it.
				
			ButtonGroup buttons = new ButtonGroup();
			buttons.add(radHumanPlayer);
			buttons.add(radComputerPlayer);
			
			
			// TODO: Add the 2 radio buttons to this panel.
			add(this.radHumanPlayer);
			add(this.radComputerPlayer);
			 		
		}
		
		/* 
		 * Defines the listener for computerPlayerButton.
		 */		
		private class ComputerFirstListener implements ActionListener {
			
			@Override
			/** 
			 * Enables the ComputerPlayerPanel and starts a new game. 
			 * Event handler for a click in the computerPlayerButton.
			 */
			
			public void actionPerformed(ActionEvent eventObject) {
					
				Gui.this.pnlComputerPlayer.setEnabled(true);
				Gui.this.theGame.startNewGame(NewGamePanel.this.theComputer, NewGamePanel.this.theHuman);
			}
		}

		
		/* 
		 * Defines the listener for humanPlayerButton.
		 */	
		private class HumanFirstListener implements ActionListener {

			/* 
			 * Enables the HumanPlayerPanel and starts a new game. 
			 * Event handler for a click in the humanPlayerButton.
			 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO: Enable pnlHumanPlayer and start a game
				//		 with theHuman playing first.
				Gui.this.pnlHumanPlayer.setEnabled(true);
				Gui.this.theGame.startNewGame(NewGamePanel.this.theHuman, NewGamePanel.this.theComputer);
				
			}
		}
		
	}


}
