package walls;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class SecondWall extends WallPanel{
	WallBegin b;
	public SecondWall(WallBegin b) {
		super();
		this.b = b;
		setBackground(Color.GREEN);
	}

	@Override
	public CardLayout getCl() {
		// TODO Auto-generated method stub
		return null;
	}

}
