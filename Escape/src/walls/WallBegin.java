package walls;

import java.awt.CardLayout;
import java.awt.Color;
/*
 * Flipping through the four walls occurs here
 */
public class WallBegin extends WallPanel {
	
    CardLayout cl;
    FirstWall first;
    SecondWall second;
    ThirdWall third;
    FourthWall fourth;
	
	public WallBegin(){
		super();
		setBackground(Color.BLACK);
		
		cl = new CardLayout();
		
		setLayout(cl);
		
		first = new FirstWall(this);
		add(first,"first");
		
		second = new SecondWall(this);
		add(second,"second");
		
		third = new ThirdWall(this);
		add(third,"third");
		
		fourth = new FourthWall(this);
		add(fourth, "fourth");
		
		
		cl.show(this, "first");	
		
	}

	@Override
	public CardLayout getCl() {
		return cl;
	}

}
