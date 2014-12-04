package images;

import java.awt.GridBagLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
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
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/bowl.png")))),space, this);
					x.setToolTipText("This is an empty bowl...");
					x.setVisible(false);
					add(x);
					break;

				}
				catch (IOException e){} 
				

			
			
			case 1:
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/key.png")))),space, this);
					x.setToolTipText("A circular object...");
					x.setVisible(false);
					add(x);
					break;

				}
				catch (IOException e){} 
				
			case 2:
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/crowbar.png")))),space, this);
					x.setToolTipText("A crowbar...");
					x.setVisible(false);
					add(x);
					break;
				}
			    catch (IOException e){} 
				
			case 4:
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/waterBowl.png")))),space, this);
					x.setToolTipText("The bowl is now filled with water...");
					x.setVisible(false);
					add(x);
					break;
				}
				catch (IOException e){} 
				
			case 5:
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/seeds.png")))),space, this);
					x.setToolTipText("They look like seeds...");
					x.setVisible(false);
					add(x);
					break;
				}
				catch (IOException e){} 
		
			case 6:
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/finalKey.png")))),space, this);
					x.setToolTipText("Where would this go...");
					x.setVisible(false);
					add(x);
					break;
				}
				catch (IOException e){} 
				
			default:
				try{
					x = new ImageLabel((new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/finalKey.png")))),space, this);
				}
				catch (IOException e){} 
					
				
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