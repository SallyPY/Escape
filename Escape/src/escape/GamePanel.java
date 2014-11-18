package escape;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import walls.WallBegin;

/*
 * The GamePanel holds the arrow buttons, the space containing the collected items, and the images of the room
 * The most interaction from the user will occur here
 */

public class GamePanel extends JPanel{
	
	ImageSpacePanel sp;
	WallBegin w;
	ArrowPanel right;
	ArrowPanel left;
	
	public GamePanel() {
		super();
		setBackground(new Color(77,77,77));
		setLayout(new BorderLayout());
		
		
		
		w = new WallBegin(); //add the sides of the rooms in the center
		add(w, BorderLayout.CENTER);
		
		sp = new ImageSpacePanel();	//add the collection space at the bottom
		add(sp, BorderLayout.SOUTH);
		
		right = new ArrowPanel("right", w);	//place right arrow to the right
		add(right, BorderLayout.EAST);
		
		left = new ArrowPanel("left", w);	//place left arrow to the left
		add(left, BorderLayout.WEST);
		
		
		
	}
	

}