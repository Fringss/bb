package bb;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
 


public class Kontroler extends JFrame implements KeyListener {
 
	char tmp;
    public Kontroler() {
    
    }
    
    public void appletakl()
    {
    	  View.applet.addKeyListener(this);
    }

 
    public void keyPressed(KeyEvent x) {
    tmp = x.getKeyChar();
    switch(tmp)
    {
    case 'w':
    	Model.ifw();
    	System.out.println("w");
    	break;
    case 'a':
    	Model.ifa();
    	break;
    case 's':
    	 Model.ifs();
    	break;
    case 'd':
    	Model.ifd();
    	 break;
                
    }
    
    
    }
 
    public void keyReleased(KeyEvent x) {
     
    }
 
    public void keyTyped(KeyEvent x) {
 
    }

    


}
 
   