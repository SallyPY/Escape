package escape;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicArrowButton;

public class ArrowPanel extends JPanel {

	public ArrowPanel(String s) {
		super();
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setBackground(new Color(0, 0, 0, 125));
		
		c.insets = new Insets(0,10,0,10);
		if(s.equals("right")){
			
			add(new BasicArrowButton(BasicArrowButton.EAST),c);
		}
		else if(s.equals("left")){
			
			add(new BasicArrowButton(BasicArrowButton.WEST),c);
		}
		
		
	}

}
