package walls;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class FourthWall extends WallPanel{
	WallBegin b;
	public FourthWall(WallBegin b) {
		super();
		this.b = b;
		setBackground(Color.GRAY);
	}

	@Override
	public CardLayout getCl() {
		// TODO Auto-generated method stub
		return null;
	}

}
