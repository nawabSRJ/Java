import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;

// <applet code = "Box" width = 500 height = 300 > </applet>

class Box extends Applet implements ItemListener{

String msg = "";

Checkbox windows , mac , solaris , android;
	
	public void init(){
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		windows = new Checkbox("windows" , null , true);
		android = new Checkbox("android");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");
		add(windows);
		add(android);
		add(solaris);
		add(mac);

		// register to receive item events 

		windows.addItemListener(this); 
		android.addItemListener(this); 
		solaris.addItemListener(this); 
 		mac.addItemListener(this); 
	}
	  public void itemStateChanged(ItemEvent ie) { 
  
		repaint(); // paint function will run again and again
  
	}

	public void paint(Graphics g){
		msg = "Current state: "; g.drawString(msg, 6, 80); 
		msg = " Windows: " + windows.getState(); g.drawString(msg, 6, 100); 
		msg = " Android: " + android.getState(); g.drawString(msg, 6, 120); 
		msg = " Solaris: " + solaris.getState(); g.drawString(msg, 6, 140); 
		msg = " Mac: " + mac.getState(); g.drawString(msg, 6, 160);
	}

} // class ends

