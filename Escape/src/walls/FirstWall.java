package walls;

import images.BufferedIm;
import images.ImagePanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import escape.GamePanel;

public class FirstWall extends JPanel {
	
	GamePanel gp;
	
	WallBegin b;
	BufferedImage c; 
	BufferedIm a;
	BufferedIm back;
	BufferedIm d;
	BufferedIm bowl;
	boolean revBowl;
	boolean bowlClicked;
	ImagePanel[] imPanel;
	
	LinkedList<BufferedIm> list = new LinkedList<BufferedIm>();
	public FirstWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		setBackground(Color.RED);
		
		
		back = new BufferedIm(new File("src/res/Background.png"));
		a = new BufferedIm(new File("src/res/onlygreencouch.png"));
		d = new BufferedIm(new File("src/res/onlybluedoor.png"));
		bowl = new BufferedIm(new File("src/res/bowlbackground.png"));
		list.add(back);
		list.add(bowl);
		list.add(a);
		list.add(d);
		
		imPanel = gp.getImageSpacePanel().getPanelHolder();
		
		addMouseListener(new MyMouseListener());
		
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			if(x > 469 && x < 486 && y > 427 && y < 438 ){
			bowlClicked = true;
			
				repaint();
			}
				
			
		}
	}
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(bowlClicked)
			list.remove(bowl);
		
		for(BufferedIm x: list){
		g.drawImage(x.getBI(), 0, 0, null); 
		
		}
		
		
		
	}
	


}
