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

import walls.WallPanel;
import walls.WallBegin;



public class ArrowPanel extends JPanel implements ActionListener{
	
	BasicArrowButton arrow;
	WallPanel parent;
	
	CardLayout cl;

	public ArrowPanel(String s, WallPanel w) {
		super();
		parent = w;
		cl = w.getCl();
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setBackground(new Color(0, 0, 0, 125));
		
		c.insets = new Insets(0,10,0,10);
		if(s.equals("right")){
			arrow = new BasicArrowButton(BasicArrowButton.EAST);
			arrow.addActionListener(this);
			add(arrow, c);
		}
		else if(s.equals("left")){
			arrow = new BasicArrowButton(BasicArrowButton.WEST);
			arrow.addActionListener(this);
			add(arrow,c);
		}
		else if(s.equals("down")){
			arrow = new BasicArrowButton(BasicArrowButton.SOUTH);
			arrow.addActionListener(this);
			add(arrow,c);
		}
		else {
			arrow = new BasicArrowButton(BasicArrowButton.NORTH);
			arrow.addActionListener(this);
			add(arrow,c);
		
		}
		
	}

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
