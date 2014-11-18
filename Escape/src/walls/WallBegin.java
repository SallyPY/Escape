package walls;

import java.awt.CardLayout;
import java.awt.Color;
/*
 * Flipping through the four walls occurs here
 */
public class WallBegin extends WallPanel {
	
    CardLayout cl;
    FirstWall first;
	
	public WallBegin(){
		super();
		setBackground(Color.BLACK);
		
		cl = new CardLayout();
		
		setLayout(cl);
		
		add(new FirstWall(),"first");
		add(new SecondWall(),"second");
		
		cl.show(this, "first");	
		
	}

	@Override
	public CardLayout getCl() {
		return cl;
	}

}