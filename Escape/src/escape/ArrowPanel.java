package escape;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicArrowButton;

import walls.WallBegin;

/*
 * ArrowPanel creates a JPanel with a specific direction-facing button that responds to clicks
 */

public class ArrowPanel extends JPanel implements ActionListener{
	
	BasicArrowButton arrow;
	WallBegin parent;
	CardLayout cl;

	public ArrowPanel(String s, WallBegin w) {
		super();
		parent = w;
		cl = w.getCl();
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setBackground(new Color(0, 0, 0, 125));
		
		
		c.insets = new Insets(0,10,0,10);
		if(s.equals("right")){		
			arrow = new BasicArrowButton(BasicArrowButton.EAST);	/*produces a right-facing arrow*/
			arrow.addActionListener(this);
			add(arrow, c);
		}
		else if(s.equals("left")){
			arrow = new BasicArrowButton(BasicArrowButton.WEST);	/*produces a left-facing arrow*/
			arrow.addActionListener(this);
			add(arrow,c);
		}
		else if(s.equals("down")){
			arrow = new BasicArrowButton(BasicArrowButton.SOUTH);	/*produces an up-facing arrow*/
			arrow.addActionListener(this);
			add(arrow,c);
		}
		else {
			arrow = new BasicArrowButton(BasicArrowButton.NORTH);	/*produces a down-facing arrow*/
			arrow.addActionListener(this);
			add(arrow,c);
		}	
	}
	
	/*
	 * This method travels across the panels in CardLayout when arrow is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(arrow)){
			if(arrow.getDirection()== BasicArrowButton.EAST||arrow.getDirection()== BasicArrowButton.NORTH)
				cl.next(parent);
			else
				cl.previous(parent);
		}	
	}
}
