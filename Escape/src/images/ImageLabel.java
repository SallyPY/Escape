package images;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The ImageLabel class creates an ImageLabel object out of a specific image given from the ImagePanel class
 */
public class ImageLabel extends JLabel{
	boolean clicked;
	ImageInventoryPanel isp;
	ImagePanel ip;
	
	ImageLabel(ImageIcon image, ImageInventoryPanel isp, ImagePanel ip){
		super(image);
		this.isp = isp;
		this.ip = ip;
		clicked = false;
		addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener extends MouseAdapter{ //Selects the item the user clicks and deselects the rest
		public void mouseClicked(MouseEvent e){
			for(int i = 0; i < 8; i++)
				if(isp.panelHolder[i].isClicked() == true && isp.panelHolder[i] != ip){
					isp.panelHolder[i].setBackground(Color.WHITE);
					isp.panelHolder[i].getIL().clicked = false;
				}
			
			clicked = !clicked;
			
			  if(clicked)
				 ip.setBackground(Color.GRAY);
			  else
				 ip.setBackground(Color.WHITE);
		}
	}
}
