package images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class BufferedIm  {
	
	BufferedImage bf;
	
	public BufferedIm(File x){
		//super();
		try 
	    {                
	      bf = ImageIO.read(x);
	    } 
	    catch (IOException e) 
	    { 
	  
	    } 
	
	}
	
	public BufferedImage getBI(){
		return bf;
	}

}
