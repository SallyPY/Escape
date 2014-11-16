package escape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import walls.WallPanel;

public class GamePanel extends JPanel{
	
	ImageSpacePanel sp;
	WallPanel w;
	ArrowPanel right;
	ArrowPanel left;
	
	public GamePanel() {
		super();
		setBackground(new Color(77,77,77));
		setLayout(new BorderLayout());
		
		right = new ArrowPanel("right");
		add(right, BorderLayout.EAST);
		
		left = new ArrowPanel("left");
		add(left, BorderLayout.WEST);
		
		w = new WallPanel();
		add(w, BorderLayout.CENTER);
		
		sp = new ImageSpacePanel();
		add(sp, BorderLayout.SOUTH);
		
		
		
	}
	

}