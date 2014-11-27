package walls;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import escape.GamePanel;

public class FourthWall extends JPanel{
	WallBegin b;
	GamePanel gp;
	
	public FourthWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		this.gp = gp;
		setBackground(Color.GRAY);
	}


}
