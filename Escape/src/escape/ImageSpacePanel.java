package escape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ImageSpacePanel extends JPanel{
	ImagePanel[] panelHolder;
	ImagePanel[] ib = new ImagePanel[8];


	public ImageSpacePanel() {
		super();
		
	  
		setLayout(new GridLayout(2,4));
		setBackground(Color.BLUE);

		JButton p = new JButton("hi");
		
		panelHolder = new ImagePanel[8];    

		for(int m = 0; m < 8; m++) {
		      panelHolder[m] = new ImagePanel(m);
		      panelHolder[m].setPreferredSize(new Dimension(50,60));
		      panelHolder[m].setOpaque(true);
		      panelHolder[m].setBackground(Color.WHITE);
		      panelHolder[m].setBorder(BorderFactory.createLineBorder(Color.GRAY));
		      add(panelHolder[m]);
		   
		}
	
	}
	
	

}