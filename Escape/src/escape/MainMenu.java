package escape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * The game begins by showing the main menu, which contains the instructions and the buttons either starting or exiting the game
 */
public class MainMenu extends JPanel implements ActionListener{
	private JButton startButton, exitButton;
	
	private int fullSize = 600;
	JFrame frame;
	URL url;
	
	public MainMenu(JFrame j) {
		super();
		frame = j;
		setPreferredSize(new Dimension(fullSize, fullSize));
		setMaximumSize(new Dimension(fullSize, fullSize));
	    setMinimumSize(new Dimension(fullSize, fullSize));
	    
	    GridBagLayout gl = new GridBagLayout();
		setLayout(gl);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridx = 0;
		c.gridy = 0;	
		c.insets= new Insets(0,0,20,0);
		c.ipady=200;
		c.ipadx=50;
		
		add(new InstructionPanel(), c); //adds instructions
		
		c.gridx = 0;
		c.gridy = 1;
		//c.gridheight=20;
		c.ipady=20;
		c.ipadx=300;
		c.insets= new Insets(20,0,0,0);
		add(new ButtonPanel(),c);
		startButton.addActionListener(this);
		exitButton.addActionListener(this);
		
		url = getClass().getResource("/res/mainMenuBack.png");
	}

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.drawImage(new ImageIcon(url).getImage(),0,0,null);
    }
    
    private class ButtonPanel extends JPanel{ //panel that holds the buttons
    	
    	public ButtonPanel(){
    		super();
    		setLayout(new GridBagLayout());
    		setBackground(new Color(69, 56, 35));
    		
    		GridBagConstraints c = new GridBagConstraints();
    		
    		startButton = new JButton("Start");
    		startButton.setFocusable(false);
    		add(startButton,c);
    		
    		c.insets=new Insets(0,40,0,0);
    	
    		exitButton = new JButton("Exit");
    		exitButton.setFocusable(false);
    		add(exitButton,c);	
    	}
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(exitButton)) {//exits if exitButton is pushed
			System.exit(0);
		}
		
		if (e.getSource().equals(startButton)) 
		setVisible(false);
		frame.setContentPane(new GamePanel()); //begins a new GamePanel if startButton is pushed
		frame.getContentPane().remove(this);	
		
	}    
}
