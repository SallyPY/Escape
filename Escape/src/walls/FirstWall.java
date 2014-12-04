package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.CaptionPanel;
import escape.GamePanel;

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
	
	
	public FirstWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		caption = gp.caption;
		
		
	
		
		
		back = new BufferedIm("res/first/firstBack.png");
		black = new BufferedIm("res/compblack.png");
		
		couch = new BufferedIm("res/first/couch.png");
		door = new BufferedIm("res/first/door.png");
		bowl = new BufferedIm("res/first/bowlOnGround.png");
		openCouch = new BufferedIm("res/first/openCouch.png");
		key = new BufferedIm("res/first/keyOnCouch.png");
		
		openDoor =  new BufferedIm("res/first/openDoor.png");
		
		
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
			System.out.println(e.getPoint());
			
			if(x > 460 && x < 492 && y > 420 && y < 440 ){
				bowlClicked = true;
				s[0].getIL().setVisible(true);
			}
			
			else if(x > 323 && x < 348 && y > 390 && y < 410 && couchClicked){
				keyClicked = true;
				s[1].getIL().setVisible(true);
			}
			
			else if(x > 260 && x < 369 && y > 375 && y < 416){
				couchClicked = true;		
			}
			
			else if(x > 179 && x < 200 && y > 260 && y < 295){
				if(s[6].isClicked()){
					doorUnlocked = true;
					s[1].getIL().setVisible(false);
					s[1].setBackground(Color.WHITE);
					caption.l.setText("Freedom!");
				}
				else
					caption.l.setText("Needs a key.");
			}
			
			repaint();
			
		}
	}
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(bowlClicked)
			list.remove(bowl);
		
		if(keyClicked)
			list.remove(key);
		
		if(couchClicked)
			list.remove(couch);
		
		if(doorUnlocked){
			list.remove(door);
			list.add(openDoor);
		}	
		
		if(switchClicked)
			g.drawImage(black.getBI(), 0, 0, this); 
		else{
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 		
		}	
		
		
		
	}
	


}
