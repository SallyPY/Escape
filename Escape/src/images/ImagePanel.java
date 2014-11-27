package images;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Panel that specifies what image goes into each space on the grid. Each item has a specific location
 */

public class ImagePanel extends JPanel{
	
	boolean found;
	
	ImageIcon image;
	ImageLabel x;
	ImageSpacePanel space;

	public ImagePanel(int m,ImageSpacePanel space) {
		super();
		setLayout(new GridBagLayout());
		this.space = space;
		switch (m){
			case 0:	
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/bowl.png")).getImage())),space, this);
				x.setToolTipText("This is an empty bowl.");
				//x.setVisible(false);
				add(x);
				break;
			case 1:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)),space, this);
				x.setToolTipText("Image comment");
				add(x);
				break;
			case 2:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)),space, this);
				x.setToolTipText("Image comment");
				add(x);
				break;
			case 3:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)),space, this);
				x.setToolTipText("Image comment");
				add(x);
				break;
			case 4:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/waterbowl.png")).getImage())),space, this);
				x.setToolTipText("Image comment");
				add(x);
				break;
			case 5:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)),space, this);
				x.setToolTipText("Image comment");
				add(x);
				break;
			case 6:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)),space, this);
				x.setToolTipText("Image comment");
				add(x);
				break;
		
			default:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)),space, this);
				x.setToolTipText("Image comment");
				x.setVisible(false);
				add(x);
				
				
		
				
				
				
		}
		found = false;
		 
	
	}
	boolean isClicked(){
		return x.clicked;
	}
	
	ImageLabel getIL(){
		return x;
	}

		
		
	
	
}