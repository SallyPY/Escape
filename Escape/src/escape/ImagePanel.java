package escape;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Panel that specifies what image goes into each space on the grid. Each item has a specific location
 */

public class ImagePanel extends JPanel{
	
	boolean clicked;
	
	ImageIcon image;
	JLabel x;

	public ImagePanel(int m) {
		super();
		setLayout(new GridBagLayout());
		switch (m){
			case 0:	
				x = new JLabel(new ImageIcon(((new ImageIcon("src/images/s.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
				add(x);
				//x.setVisible(false);
				break;
		}
		clicked = false;
		 
	
	}
	
}