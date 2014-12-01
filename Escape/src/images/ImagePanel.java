package images;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
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
				x.setToolTipText("This is an empty bowl...");
				x.setVisible(false);
				add(x);
				break;
			case 1:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/key.png")).getImage())),space, this);
				x.setToolTipText("A circular object...");
				x.setVisible(false);
				add(x);
				break;
			case 2:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/crowbar.png")).getImage())),space, this);
				x.setToolTipText("A crowbar...");
				x.setVisible(false);
				add(x);
				break;
			case 4:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/waterBowl.png")).getImage())),space, this);
				x.setToolTipText("The bowl is now filled with water...");
				x.setVisible(false);
				add(x);
				break;
			case 5:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/seeds.png")).getImage())),space, this);
				x.setToolTipText("They look like seeds...");
				x.setVisible(false);
				add(x);
				break;
		
			case 6:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/finalkey.png")).getImage())),space, this);
				x.setToolTipText("Where would this go...");
				x.setVisible(false);
				add(x);
				break;
			default:
				x = new ImageLabel(new ImageIcon(((new ImageIcon("src/res/finalkey.png")).getImage())),space, this);
			
				
		
				
				
		
				
				
				
		}
		found = false;
		 
	
	}
	public boolean isClicked(){
		return x.clicked;
	}
	
	public ImageLabel getIL(){
		return x;
	}

		
		
	
	
}