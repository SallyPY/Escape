package escape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import walls.WallBegin;

public class GamePanel extends JPanel{
	
	ImageSpacePanel sp;
	WallBegin w;
	ArrowPanel right;
	ArrowPanel left;
	
	public GamePanel() {
		super();
		setBackground(new Color(77,77,77));
		setLayout(new BorderLayout());
		
		
		
		w = new WallBegin();
		add(w, BorderLayout.CENTER);
		
		sp = new ImageSpacePanel();
		add(sp, BorderLayout.SOUTH);
		
		right = new ArrowPanel("right", w);
		add(right, BorderLayout.EAST);
		
		left = new ArrowPanel("left", w);
		add(left, BorderLayout.WEST);
		
		
		
	}
	

}