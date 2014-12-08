package escape;

import images.ImageSpacePanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import walls.WallBegin;

/*
 * The GamePanel holds the arrow buttons, the space containing the collected items, and the images of the room
 * The most interaction from the user will occur here
 */

public class GamePanel extends JPanel{
	
	public ImageSpacePanel sp;
	WallBegin w;
	ArrowPanel right;
	ArrowPanel left;
	
	public CaptionPanel caption;
	
	public GamePanel() {
		
		super();
		setBackground(new Color(77,77,77));
		setLayout(new BorderLayout());
		
		caption = new CaptionPanel();
		add(caption, BorderLayout.NORTH);
		
		sp = new ImageSpacePanel(this);	//add the collection space at the bottom
		add(sp, BorderLayout.SOUTH);
	
		w = new WallBegin(this, sp); //add the sides of the rooms in the center
		add(w, BorderLayout.CENTER);
		
		right = new ArrowPanel("right", w);	//place right arrow to the right
		add(right, BorderLayout.EAST);
		
		left = new ArrowPanel("left", w);	//place left arrow to the left
		add(left, BorderLayout.WEST);
	}
	
	public ImageSpacePanel getImageSpacePanel(){return sp;}	
}
	

