package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.CaptionPanel;
import escape.GamePanel;

public class SecondWall extends WallPanel{
	
	BufferedIm openLock;
	BufferedIm blackLight;
	
	boolean lockClicked;
	
	CaptionPanel caption;
	
	public SecondWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		caption = gp.caption;
		
		back = new BufferedIm("res/second/secWallBack.png");
		openLock = new BufferedIm("res/second/openLock.png");
		blackLight=new BufferedIm("res/second/blackLight.png");
		
		black = new BufferedIm("res/dimWall.png");
		
		list.add(back);
		
		addMouseListener(new MyMouseListener());
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			
			if(x > 177 && x < 340 && y > 150 && y < 250){
				if(x > 313 && x < 329 && y > 190 && y < 220 && !lockClicked){
					if(s[1].isClicked()){
						lockClicked =  true;
						list.add(openLock);
						b.fourth.unhidden = true;
						s[1].getIL().setVisible(false);
						s[1].setBackground(Color.WHITE);
						sound.start();
					}
					else
						caption.l.setText("It needs a disk-shaped object...");
				}
				else if(x > 235 && x < 275 && y > 184 && y < 252)
					if(lockClicked){
						if(switchClicked)
							caption.l.setText("I can make out the light.");
						else
							caption.l.setText("There's a red light coming out of this thing. I can't see where it points to...");
					}
						
					
				else if(!lockClicked)
					caption.l.setText("It looks like a safe.");
			}
			else if(x > 380 && x < 430 && y > 160 && y < 250)
				caption.l.setText("What a pretty vase...");
			else if(x > 72 && x < 120 && y > 210 && y < 250)
				caption.l.setText("A picture of the outside world...");
			repaint();
		}
	}
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(switchClicked){
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			g.drawImage(black.getBI(), 0, 0, null); 
			if(lockClicked)
				g.drawImage(blackLight.getBI(), 0, 0, null);
				
		}
		else
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null);  					
	}
	

	

}
