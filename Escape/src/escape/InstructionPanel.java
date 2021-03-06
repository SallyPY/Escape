package escape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * This InstructionPanel displays and formats the instructions of the game
 */
public class InstructionPanel extends JPanel{
	
	JLabel in;
	
	public InstructionPanel(){
		super();
		setLayout(new BorderLayout());
		setBackground(new Color(0, 0, 0, 125));
	
		in = new JLabel("<html><center>Yesterday, you had a bit too much to drink.<br>"
				+ "Now you've woken up inside a locked room without a key. <br> Good Luck.<html>");
		in.setFont(new Font ("Garamond",Font.PLAIN, 20)); //setting JLabel characteristics
	    in.setForeground(Color.WHITE);
		in.setHorizontalAlignment(JLabel.CENTER);
		
		add(in,BorderLayout.CENTER);
	}
}
