package walls;

import images.BufferedIm;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JPanel;

import escape.GamePanel;

public class SecondWall extends JPanel{
	WallBegin b;
	BufferedIm back;
	public SecondWall(WallBegin b, GamePanel gp) {
		super();
		this.b = b;
		setBackground(Color.GREEN);
		back = new BufferedIm(new File("src/res/Background.png"));
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			repaint();
		}
	}
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(back.getBI(), 0, 0, null);
		
		
		
	}
	

	

}
