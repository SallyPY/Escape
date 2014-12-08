package escape;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CaptionPanel extends JPanel{	
	public JLabel l;
	int size;
	
	public CaptionPanel(){
		l= new JLabel("How do I get out?");
		add(l);
	}
}
