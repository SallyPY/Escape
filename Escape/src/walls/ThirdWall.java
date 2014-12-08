package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.CaptionPanel;
import escape.GamePanel;

public class ThirdWall extends WallPanel{
	
	BufferedIm crowbarBack;
	BufferedIm lightOn;
	BufferedIm lightOff;
	
	boolean crowbarClicked;
	
	CaptionPanel caption;

	public ThirdWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		caption = gp.caption;
		
		back = new BufferedIm("res/third/thirdWallBack.png");
		crowbarBack = new BufferedIm("res/third/crowbarBack.png");
		black = new BufferedIm("res/dimWall.png");
		lightOn = new BufferedIm("res/third/lightOn.png");
		lightOff  = new BufferedIm("res/third/lightOff.png");
		
		list.add(back);
		list.add(crowbarBack);
		list.add(lightOn);
		
		addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			
			if(x > 76 && x < 184 && y > 420 && y < 440 && !crowbarClicked){
				crowbarClicked = true;
				list.remove(crowbarBack);
				s[2].getIL().setVisible(true);
				sound.start();
				caption.l.setText("I'm too weak to force my way out with this.");
			}
			
			else if(x > 354 && x < 475 && y > 155 && y < 474){
				if(s[0].isClicked()){
					s[4].getIL().setVisible(true);
					s[0].getIL().setVisible(false);
					s[0].setBackground(Color.WHITE);
					sound.start();
					caption.l.setText("In case I get thirsty...");
				}
				
				else
					caption.l.setText("The ceiling appears to be leaking.");
			}
			
			else if(x > 219 && x < 320 && y > 144 && y < 261){
				switchClicked = !switchClicked;
				
				b.first.switchClicked = !b.first.switchClicked;
				
				b.second.switchClicked = !b.second.switchClicked;
				
				b.fourth.switchClicked = !b.fourth.switchClicked;
			
				if(switchClicked){
					caption.l.setText("It's dark.");
					list.remove(lightOn);
					list.add(lightOff);
					sound.start();
				}
				else{
					sound.start();
					list.remove(lightOff);
					list.add(lightOn);
				
					caption.l.setText("How do I get out?");
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
