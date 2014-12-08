package walls;

import images.ImageSpacePanel;

import java.awt.CardLayout;
import java.awt.Color;

import escape.GamePanel;
/*
 * Flipping through the four walls occurs here
 */
public class WallBegin extends WallPanel {
	
    CardLayout cl;
    FirstWall first;
    SecondWall second;
    ThirdWall third;
    FourthWall fourth;
    GamePanel gp;
	
	public WallBegin(GamePanel g, ImageSpacePanel sp){
		super();
		gp = g;
		setBackground(Color.BLACK);
		
		cl = new CardLayout();		
		setLayout(cl);
		
		first = new FirstWall(this, gp);
		add(first,"first");
		
		second = new SecondWall(this, gp);
		add(second,"second");
		
		third = new ThirdWall(this, gp);
		add(third,"third");
		
		fourth = new FourthWall(this, gp);
		add(fourth, "fourth");
		
		cl.show(this, "first");
	}

	public CardLayout getCl() {return cl;}
}
