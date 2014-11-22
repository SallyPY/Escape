package walls;

import java.awt.CardLayout;

import javax.swing.JPanel;

/*
 * Abstract class that helps navigation using the arrows in ArrowPanel
 */
public abstract class WallPanel extends JPanel{
	
	public abstract CardLayout getCl();//dfs

}
