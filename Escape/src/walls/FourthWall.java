package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.GamePanel;

public class FourthWall extends WallPanel{
	
	BufferedIm dirt;
	BufferedIm blackLight;
	
	boolean spotClicked;
	boolean unhidden;
	boolean seedClicked;
	boolean openingUnhidden;
	
	boolean seedInHole;
	boolean waterInHole;
	boolean keyClicked;
	
	boolean[] correctArrow = new boolean[3];
	BufferedIm [] arrow = new BufferedIm[3];
	
	
	BufferedIm firstP;
	BufferedIm secondP;
	BufferedIm thirdP;
	
	BufferedIm firstPu;
	BufferedIm secondPu;
	BufferedIm thirdPu;
	
	BufferedIm opening;
	BufferedIm seeds;
	
	BufferedIm tree;
	BufferedIm key;
	
	public FourthWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		
		back = new BufferedIm(new File("src/res/fourth/fourthWallBack.png"));
		blackLight= new BufferedIm(new File("src/res/fourth/fourthWallBlack.png"));
		black = new BufferedIm(new File("src/res/compblack.png"));

		firstP = new BufferedIm(new File("src/res/fourth/firstP.png"));
		secondP  = new BufferedIm(new File("src/res/fourth/secondP.png"));
		thirdP = new BufferedIm(new File("src/res/fourth/thirdP.png"));
		
		firstPu  = new BufferedIm(new File("src/res/fourth/firstPu.png"));
		secondPu = new BufferedIm(new File("src/res/fourth/secondPu.png"));
		thirdPu = new BufferedIm(new File("src/res/fourth/thirdPu.png"));
		
		dirt = new BufferedIm(new File("src/res/fourth/dirt.png"));
		opening = new BufferedIm(new File("src/res/fourth/seedOpening.png")); 
		seeds = new BufferedIm(new File("src/res/fourth/seedsInOpening.png")); 
		tree = new BufferedIm(new File("src/res/fourth/tree.png"));  
		key = new BufferedIm(new File("src/res/fourth/keyOnFloor.png"));   
		
		arrow[0] = firstP;
		arrow[1] = secondP;
		arrow[2] = thirdP;
		correctArrow[0] = true;
		
		list.add(back);
		
		addMouseListener(new MyMouseListener());
	}
	class MyMouseListener extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			System.out.println(e.getPoint());
			
			if(x > 297 && x < 315 && y > 418 && y < 450 ){
				if(s[2].isClicked()){
					spotClicked =  true;
					s[2].getIL().setVisible(false);
				}
			}
			
			else if(x > 176 && x < 315 && y > 415 && y < 450 ){
				if(s[4].isClicked()){
					if(spotClicked){
						waterInHole =  true;
						s[4].getIL().setVisible(false);
						s[4].setBackground(Color.WHITE);
						s[0].getIL().setVisible(true);
					}
				}
				
				else if(s[5].isClicked()){
					if(spotClicked){
						seedInHole =  true;
						s[5].getIL().setVisible(false);
						s[5].setBackground(Color.WHITE);
					}
				}
			}
			

			else if(x > 322 && x < 358 && y > 310 && y < 418){
				correctArrow[0] = !correctArrow[0];
				if(arrow[0].equals(firstP))
					arrow[0] = firstPu;
				else 
					arrow[0] = firstP;
			}
			else if(x > 372 && x < 410 && y > 310 && y < 418){
				correctArrow[1] = !correctArrow[1];
				if(arrow[1].equals(secondP))
					arrow[1] = secondPu;
				else 
					arrow[1] = secondP;
			}
			else if(x > 425 && x < 460 && y > 310 && y < 418){
				correctArrow[2] = !correctArrow[2];
				if(arrow[2].equals(thirdP))
					arrow[2] = thirdPu;
				else 
					arrow[2] = thirdP;
			}
			
			else if(x > 380 && x < 435 && y > 420 && y < 454){
				keyClicked = true;
				s[6].getIL().setVisible(true);	
			}
			
			else if(x > 350 && x < 436 && y > 259 && y < 282)
				if(openingUnhidden){
					seedClicked = true;
					s[5].getIL().setVisible(true);
				}	
		
			repaint();
		}
			
	}
	
	public boolean allTrue(boolean[] a){
		
		for(int i = 0; i < a.length; i++){
			if(a[i]==false)
				return false;
		}
		openingUnhidden = true;
		return true;
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);	
		
		if(spotClicked){
			if(!list.contains(dirt))
				list.add(dirt);
		}
		
		if(allTrue(correctArrow)){
			if(!list.contains(opening))
				list.add(opening);
			if(!seedClicked)
				list.add(seeds);
			else
				list.remove(seeds);
		}
		
		if(seedInHole && waterInHole){
			if(!list.contains(tree))
				list.add(tree);
			if(!list.contains(key))
				list.add(key);
		}
		
		if(keyClicked)
			list.remove(key);
		
		if(switchClicked){
			if(unhidden)
				g.drawImage(blackLight.getBI(), 0, 0, null); 
			else
				g.drawImage(black.getBI(), 0, 0, null); 
		}
		
		else{
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			for(BufferedIm x: arrow)
				g.drawImage(x.getBI(), 0, 0, null); 
		}
		
		
	}


}
