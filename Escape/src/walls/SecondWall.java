package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.GamePanel;

public class SecondWall extends WallPanel{
	
	BufferedIm openLock;
	
	boolean lockClicked;
	
	public SecondWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		
		
		back = new BufferedIm(new File("src/res/second/secWallBack.png"));
		openLock = new BufferedIm(new File("src/res/second/openLock.png"));
		
		black = new BufferedIm(new File("src/res/compblack.png"));
		
		list.add(back);
		
		addMouseListener(new MyMouseListener());
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			System.out.println(e.getPoint());
			
			if(x > 313 && x < 329 && y > 190 && y < 220 ){
				if(s[1].isClicked()){
					lockClicked =  true;
					b.fourth.unhidden = true;
					s[1].getIL().setVisible(false);
					s[1].setBackground(Color.WHITE);
				}
				
			
			}
			repaint();
		}
	}
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(lockClicked)
			if(!list.contains(openLock))
				list.add(openLock);
		
		
		if(switchClicked)
			g.drawImage(black.getBI(), 0, 0, null); 
		else
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 		
		
		
		
		
	}
	

	

}
