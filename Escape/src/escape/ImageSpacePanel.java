package escape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/*
 * This panel can hold a total of 8 items the user can collect and use to escape the room
 */
public class ImageSpacePanel extends JPanel{
	ImagePanel[] panelHolder;
	GamePanel gp;


	public ImageSpacePanel(GamePanel gp) {
		super();
		this.gp = gp;
	  
		setLayout(new GridLayout(2,4));
		setBackground(Color.BLUE);


		panelHolder = new ImagePanel[8];    

		for(int m = 0; m < 8; m++) {
		      panelHolder[m] = new ImagePanel(m, this);
		      panelHolder[m].setPreferredSize(new Dimension(50,60));
		      panelHolder[m].setOpaque(true);
		      panelHolder[m].setBackground(Color.WHITE);
		      panelHolder[m].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		      add(panelHolder[m]);
		   
		}
	
	}
	
	

}