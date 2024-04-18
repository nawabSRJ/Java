import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code = "ChkBox" width = 500 height = 300 > </applet> 

public class ChkBox extends Applet implements ItemListener {
	Checkbox win , linux , mac;
	String msg = "";
	public void init(){

		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBackground(Color.GREEN);

		win = new Checkbox("Windows" , null , true);
		linux = new Checkbox("Linux");
		mac = new Checkbox("Mac OS");

		add(win); add(linux); add(mac);
		
		win.addItemListener(this);	linux.addItemListener(this);
		mac.addItemListener(this);
		
	}
	 public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	 //Display current state of the check boxes.
 	public void paint(Graphics g) {
		msg = "Current state: "; g.drawString(msg, 6, 80);
		msg = " Windows: " + win.getState(); g.drawString(msg, 6, 100);
		msg = " Linux: " + linux.getState(); g.drawString(msg, 6, 120);
		msg = " Mac OS: " + mac.getState(); g.drawString(msg, 6, 140);
	}	
	
}