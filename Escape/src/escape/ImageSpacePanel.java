package escape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ImageSpacePanel extends JPanel{
	JPanel[][] panelHolder;
	ImageButton[] ib = new ImageButton[8];
	ImageButton[][] imageHolder;

	public ImageSpacePanel() {
		super();
		
	  
		setLayout(new GridLayout(2,4));
		setBackground(Color.BLUE);

		JButton p = new JButton("hi");
		
		panelHolder = new JPanel[2][4];    

		for(int m = 0; m < 2; m++) {
		   for(int n = 0; n < 4; n++) {
		      panelHolder[m][n] = new JPanel();
		      panelHolder[m][n].setPreferredSize(new Dimension(40,40));
		      panelHolder[m][n].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		      add(panelHolder[m][n]);
		   }
		}
	
		/*for(int i = 0; i<8; i++){
			ib[i] = new ImageButton(i);
			add(ib[i]);
		}*/
	}
	
	

}