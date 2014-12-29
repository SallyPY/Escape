package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import escape.GamePanel;
/**
 * The SecondWall class shows the second wall of the room.
 */
public class SecondWall extends WallPanel{
	
	BufferedIm openSafe;
	BufferedIm blackLight;
	
	boolean unlocked;
	
	JLabel caption;
	
	public SecondWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		caption = gp.caption.getText();
		
		back = new BufferedIm("res/second/secWallBack.png");
		openSafe = new BufferedIm("res/second/openLock.png");
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
			
			//if the safe is clicked
			if(x > 177 && x < 340 && y > 150 && y < 250){

				//if the keyhole is clicked
				if(x > 313 && x < 329 && y > 190 && y < 220 && !unlocked){
					
					//if the disk key in the inventory is selected for, the open safe BufferedIm is added to the end of list, and
					//the key disappears from the inventory
					//this can only happen once
					if(s[1].isClicked()){
						unlocked =  true;
						list.add(openSafe);
						b.fourth.unhidden = true;
						s[1].getIL().setVisible(false);
						s[1].setBackground(Color.WHITE);
						sound.start();
					}
					//else if only the keyhole is clicked, a new comment
					else
						caption.setText("It needs a disk-shaped object...");
				}
				
				//else if the safe is unlocked and the click occurs in the specified smaller region(the light machine), a new comment
				else if(x > 235 && x < 275 && y > 184 && y < 252)
					if(unlocked){
						//if the light is turned off
						if(switchClicked)
							caption.setText("I can make out the light.");
						else
							caption.setText("There's a red light coming out of this thing. I can't see where it points to...");
					}
						
				//else if the safe is clicked and locked
				else if(!unlocked)
					caption.setText("It looks like a safe.");
			}
			
			//else if the vase is clicked, new comment
			else if(x > 380 && x < 430 && y > 160 && y < 250)
				caption.setText("What a pretty vase...");
			
			//else if the picture frame is clicked, new comment
			else if(x > 72 && x < 120 && y > 210 && y < 250)
				caption.setText("A picture of the outside world...");
			repaint();
		}
	}
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(switchClicked){	//if the light is turned off from the third wall, the black image is drawn over the rest of the wall images
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			g.drawImage(black.getBI(), 0, 0, null); 
			if(unlocked)	//if the safe is unlocked, the red light is drawn over
				g.drawImage(blackLight.getBI(), 0, 0, null);	
		}
		
		else
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null);  					
	}
	

	

}
