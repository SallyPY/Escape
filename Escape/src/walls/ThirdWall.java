package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.GamePanel;

public class ThirdWall extends WallPanel{
	
	BufferedIm crowbarBack;
	boolean crowbarClicked;

	
	
	public ThirdWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		
		back = new BufferedIm(new File("src/res/third/thirdWallBack.png"));
		crowbarBack = new BufferedIm(new File("src/res/third/crowbarBack.png"));
		black = new BufferedIm(new File("src/res/third/thirdBlack.png"));
		
		list.add(back);
		list.add(crowbarBack);
		
		addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			System.out.println(e.getPoint());
			if(x > 76 && x < 184 && y > 420 && y < 440 ){
				crowbarClicked = true;
				s[2].getIL().setVisible(true);
				repaint();
			}
			
			else if(x > 354 && x < 475 && y > 155 && y < 474){
				if(s[0].isClicked()){
					s[4].getIL().setVisible(true);
					s[0].getIL().setVisible(false);
					s[0].setBackground(Color.WHITE);
				}
			}
			else if(x > 219 && x < 320 && y > 144 && y < 261){
				switchClicked = !switchClicked;
				
				b.first.switchClicked = !b.first.switchClicked;
				
				b.second.switchClicked = !b.second.switchClicked;
				
				b.fourth.switchClicked = !b.fourth.switchClicked;
			
				
				repaint();
			}
			
		}
			
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);	
		
		if(crowbarClicked)
			list.remove(crowbarBack);
		
		if(switchClicked)
			g.drawImage(black.getBI(), 0, 0, null); 
		else{
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 		
		}	
	}
	


}
