package walls;

import images.BufferedIm;
import images.ImagePanel;

import java.util.LinkedList;

import javax.swing.JPanel;

import escape.GamePanel;

/*
 * Abstract class that helps navigation using the arrows in ArrowPanel
 */
public abstract class WallPanel extends JPanel{
	
	GamePanel gp;
	WallBegin b;

	BufferedIm back;
	BufferedIm black;
	
	LinkedList<BufferedIm> list = new LinkedList<BufferedIm>();
	
	boolean switchClicked;
	
	ImagePanel[] s;
	

}
