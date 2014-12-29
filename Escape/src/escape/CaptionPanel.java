package escape;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * The CaptionPanel gives the current status when the user clicks around.
 */
public class CaptionPanel extends JPanel{	
	public JLabel label;
	int size;
	
	public CaptionPanel(){
		label= new JLabel("How do I get out?");
		add(label);
	}
	
	public JLabel getText(){return label;}
}
