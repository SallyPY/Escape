package walls;

import images.BufferedIm;
import images.ImagePanel;

import java.util.LinkedList;

import javax.swing.JPanel;

import escape.GamePanel;
import escape.Sound;

/*
 * Abstract class that helps navigation using the arrows in ArrowPanel
 */
public abstract class WallPanel extends JPanel{
	
	GamePanel gp;
	
	WallBegin b;

	BufferedIm back;
	BufferedIm black;
	
	LinkedList<BufferedIm> list = new LinkedList<BufferedIm>();
	
	Sound sound = new Sound("/res/blip.wav");
	
	boolean switchClicked;
	
	ImagePanel[] s;
	
	
	

}
