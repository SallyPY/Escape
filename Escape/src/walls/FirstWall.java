package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import escape.CaptionPanel;
import escape.GamePanel;
import escape.Sound;

public class FirstWall extends WallPanel {
	
	BufferedIm couch;
	BufferedIm door;
	BufferedIm bowl;
	BufferedIm openCouch;
	BufferedIm key;
	BufferedIm openDoor;
	
	boolean revBowl;
	boolean bowlClicked;
	boolean couchClicked;
	boolean keyClicked;
	boolean doorUnlocked;
	
	CaptionPanel caption;
	
	Sound unlocking;
	Sound rattle;
	Sound win;

	
	public FirstWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		caption = gp.caption;
		
		
		
		back = new BufferedIm("res/first/firstBack.png");
		black = new BufferedIm("res/dimWall.png");
		
		couch = new BufferedIm("res/first/couch.png");
		door = new BufferedIm("res/first/door.png");
		bowl = new BufferedIm("res/first/bowlOnGround.png");
		openCouch = new BufferedIm("res/first/openCouch.png");
		key = new BufferedIm("res/first/keyOnCouch.png");
		
		openDoor =  new BufferedIm("res/first/openDoor.png");
		
		unlocking = new Sound("/res/sfx.wav");
		win = new Sound("/res/win.wav");
		rattle = new Sound("/res/rattle.wav");
		
		list.add(back);
		list.add(bowl);
		list.add(door);
		list.add(openCouch);
		list.add(key);
		list.add(couch);
		
		addMouseListener(new MyMouseListener());	
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
	
			
			if(x > 460 && x < 492 && y > 420 && y < 440 && !bowlClicked){
				bowlClicked = true;
				list.remove(bowl);
				s[0].getIL().setVisible(true);
				caption.l.setText("An empty bowl...");
				sound.start();
				
			}
			
			else if(x > 323 && x < 348 && y > 390 && y < 410 && couchClicked && !keyClicked){
				keyClicked = true;
				list.remove(key);
				list.remove(openCouch);
				list.add(couch);
				s[1].getIL().setVisible(true);
				caption.l.setText("What is this?");
				sound.start();

			}
			
			else if(x > 260 && x < 369 && y > 375 && y < 416 && !couchClicked){
				couchClicked = true;		
				list.remove(couch);
			}
			
			else if(x > 175 && x < 205 && y > 259 && y < 295){
				if(s[6].isClicked()){
					doorUnlocked = true;
					list.remove(door);
					list.add(openDoor);
					s[6].getIL().setVisible(false);
					s[6].setBackground(Color.WHITE);
					unlocking.start();
					win.start();
					caption.l.setText("Freedom!");
				}
				
				else{
					rattle.start();
					caption.l.setText("Needs a key.");
				}
			}		
			repaint();	
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(switchClicked){
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			g.drawImage(black.getBI(), 0, 0, null); 
		}
		else
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 		
		
	}
}
