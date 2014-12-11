package images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

/**
 * The BufferedIm class handles images paths that need to be turned into BufferedImage objects.
 */
public class BufferedIm  {
	
	BufferedImage bf;
	
	public BufferedIm(String x){
		try {bf = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(x));} 
	    catch (IOException e) {}
	}
	public BufferedImage getBI(){return bf;}
}
