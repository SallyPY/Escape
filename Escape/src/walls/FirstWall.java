package walls;

import java.awt.CardLayout;
import java.awt.Color;

public class FirstWall extends WallPanel{
	
	CardLayout cl;
	WallBegin b;

	public FirstWall(WallBegin b) {
		super();
		this.b = b;
		setBackground(Color.RED);
		
		cl = new CardLayout();
		
	}

	@Override
	public CardLayout getCl() {
		return cl;
	}

}
