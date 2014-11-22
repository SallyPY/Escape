package escape;

import javax.swing.JFrame;



public class EscapeGame extends JFrame{	//sets frame

	private EscapeGame() {
		super("Escape!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MainMenu(this));
		pack();
		setVisible(true);
		}
	
	public static void main (String[] args) {
	 new EscapeGame();	//begins new game
	}


}
