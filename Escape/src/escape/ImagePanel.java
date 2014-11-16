package escape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePanel extends JLabel{
	
	boolean clicked;
	
	ImageIcon image;

	public ImagePanel(int m) {
		super();
		switch (m){
			case 0:	
				add(new ImageIcon(((new ImageIcon("src/images/s.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
				break;
		}
		setVisible(true);
	
		clicked = false;
		 
	
	}
	
}