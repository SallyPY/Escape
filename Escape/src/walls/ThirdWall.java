package walls;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ThirdWall extends WallPanel{
	WallBegin b;
	public ThirdWall(WallBegin b) {
		super();
		this.b = b;
		setBackground(Color.yellow);
	}

	@Override
	public CardLayout getCl() {
		// TODO Auto-generated method stub
		return null;
	}

}
