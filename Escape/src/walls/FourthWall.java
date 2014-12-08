package walls;

import images.BufferedIm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import escape.CaptionPanel;
import escape.GamePanel;
import escape.Sound;

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
	
	boolean[] correctflower = new boolean[3];
	BufferedIm [] flower = new BufferedIm[3];
	
	BufferedIm firstP;
	BufferedIm secondP;
	BufferedIm thirdP;
	
	BufferedIm firstPu;
	BufferedIm secondPu;
	BufferedIm thirdPu;
	
	BufferedIm opening;
	BufferedIm seedsAndOpening;
	
	BufferedIm tree;
	BufferedIm key;
	
	CaptionPanel caption;
	
	boolean flowers;
	
	Sound floorboard;
	
	public FourthWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		caption = gp.caption;
		
		back = new BufferedIm("res/fourth/fourthWallBack.png");
		blackLight= new BufferedIm("res/fourth/fourthWallBlack.png");
		black = new BufferedIm("res/dimWall.png");

		firstP = new BufferedIm("res/fourth/firstP.png");
		secondP  = new BufferedIm("res/fourth/secondP.png");
		thirdP = new BufferedIm("res/fourth/thirdP.png");
		
		firstPu  = new BufferedIm("res/fourth/firstPu.png");
		secondPu = new BufferedIm("res/fourth/secondPu.png");
		thirdPu = new BufferedIm("res/fourth/thirdPu.png");
		
		dirt = new BufferedIm("res/fourth/dirt.png");
		opening = new BufferedIm("res/fourth/seedOpening.png"); 
		seedsAndOpening = new BufferedIm("res/fourth/seedsInOpening.png"); 
		tree = new BufferedIm("res/fourth/tree.png");  
		key = new BufferedIm("res/fourth/keyOnFloor.png");   
		
		floorboard = new Sound("/res/sfx.wav");
		
		flowers = true;
	
		
		flower[0] = firstP;
		flower[1] = secondP;
		flower[2] = thirdP;
		correctflower[0] = true;
		
		list.add(back);
		
		addMouseListener(new MyMouseListener());
	}
	class MyMouseListener extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			s = gp.getImageSpacePanel().getPanelHolder();
			double x = e.getPoint().getX();
			double y = e.getPoint().getY();
			
			if(x > 297 && x < 330 && y > 415 && y < 4550 && !spotClicked){
				if(s[2].isClicked()){
					spotClicked =  true;
					list.add(dirt);
					s[2].getIL().setVisible(false);
					s[2].setBackground(Color.WHITE);
					floorboard.start();
					caption.l.setText("The floorboard has been removed.");
				}
				
			}
			
			else if(x > 167 && x < 315 && y > 415 && y < 450 ){
				if(s[4].isClicked()){
					if(spotClicked){
						waterInHole =  true;
						s[4].getIL().setVisible(false);
						s[4].setBackground(Color.WHITE);
						s[0].getIL().setVisible(true);
						sound.start();
						if(seedInHole){
							list.add(tree);
							list.add(key);
							caption.l.setText("A giant beanstalk?");
						}
					}
				}

				else if(s[5].isClicked()){
					if(spotClicked){
						seedInHole =  true;
						s[5].getIL().setVisible(false);
						s[5].setBackground(Color.WHITE);
						sound.start();
						if(waterInHole){
							list.add(tree);
							list.add(key);
							caption.l.setText("A giant beanstalk?");
						}
					}
				}
				else if(spotClicked)
					caption.l.setText("This is dirt...");
			}

			else if(x > 322 && x < 358 && y > 310 && y < 418){
				correctflower[0] = !correctflower[0];
				if(flower[0].equals(firstP))
					flower[0] = firstPu;
				else 
					flower[0] = firstP;
			}
			
			else if(x > 372 && x < 410 && y > 310 && y < 418){
				correctflower[1] = !correctflower[1];
				if(flower[1].equals(secondP))
					flower[1] = secondPu;
				else 
					flower[1] = secondP;
			}
			
			else if(x > 425 && x < 460 && y > 310 && y < 418){
				correctflower[2] = !correctflower[2];
				if(flower[2].equals(thirdP))
					flower[2] = thirdPu;
				else 
					flower[2] = thirdP;
			}
			
			else if(x > 380 && x < 435 && y > 420 && y < 454 && !keyClicked){
				keyClicked = true;
				list.remove(key);
				s[6].getIL().setVisible(true);	
				sound.start();
				caption.l.setText("This fell out of the ceiling.");
			}
	
			else if(x > 350 && x < 436 && y > 259 && y < 279 && !seedClicked){
				if(openingUnhidden){
					seedClicked = true;
					s[5].getIL().setVisible(true);
					caption.l.setText("These look like big seeds...");
					list.remove(seedsAndOpening);
					list.add(opening);
					sound.start();
				
				}
			}
			
			if(allTrue(correctflower) && flowers){
				flowers = false;
				openingUnhidden = true;
				list.add(seedsAndOpening);
			}
			
		
			
			repaint();
		}		
	}
	
	public boolean allTrue(boolean[] a){
		
		for(int i = 0; i < a.length; i++){
			if(a[i]==false)
				return false;
		}
		return true;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);	
		
		if(switchClicked){
			if(unhidden){
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			
				
			for(BufferedIm x: flower)
				g.drawImage(x.getBI(), 0, 0, null); 
			
			g.drawImage(black.getBI(), 0, 0, null); 
			g.drawImage(blackLight.getBI(), 0, 0, null); 
			
			}
			else{
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			for(BufferedIm x: flower)
				g.drawImage(x.getBI(), 0, 0, null); 
			
				g.drawImage(black.getBI(), 0, 0, null); 
			}
		}
		
		else{
			for(BufferedIm x: list)
				g.drawImage(x.getBI(), 0, 0, null); 
			for(BufferedIm x: flower)
				g.drawImage(x.getBI(), 0, 0, null); 
		}	
	}
}
