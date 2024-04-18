import java.awt.*;
import java.applet.*;

/* <applet code = "Shapes" width = 700 height = 500> </applet> */

public class Shapes extends Applet{

	public void paint(Graphics g){
	  g.setColor(Color.RED);	
	  g.drawRect(10 , 50 , 200 , 80);
	  
	  g.setColor(Color.RED);
	  g.fillRect(10 , 150 , 200 , 80);
	
	}

} // class ends