package escape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import walls.WallPanel;

public class GamePanel extends JPanel{
	
	//ImageSpacePanel sp
	//WallPanel w;
	//ArrowPanel right;
	//ArrowPanel left;
	
	public GamePanel() {
		super();
		setBackground(Color.BLUE);
		setLayout(new BorderLayout());
		
		
		add(new ArrowPanel("right"), BorderLayout.EAST);
		add(new ArrowPanel("left"), BorderLayout.WEST);
		add(new WallPanel(), BorderLayout.CENTER);
	//	add(new JButton("hi",new ImageIcon("src/images/x.png")));
		add(new ImageSpacePanel(), BorderLayout.SOUTH);
		// w = new WallPanel();
		
		// sp = new ImageSpacePanel()
		//add(
		//add(w);
		//add(sp);
		
		
		
	}
	

}
