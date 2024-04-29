import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="Motion" width=1000 height=900> </applet>
public class Motion extends Applet implements Runnable {
    int x = 60;
    int x_wd = 40 , y_wd = 40;
    String CLR = "Color.BLACK";
    Thread th1;

    public void paint(Graphics g) {
        int y = x * -1 + 250; // using y = mx + c (ignoring the c as of now)
	g.setColor(Color.DARK_GRAY);
        g.fillOval((int)Math.tan(x), y, x_wd, y_wd);
        x += 10;
	if(x > 100){
		x_wd += 160;
		y_wd += 160;
		//CLR = "Color.ORANGE";
		g.setColor(Color.ORANGE);

	}
        if (x > 500) {
            x = 1; 
        }
    }

    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void init() {
        th1 = new Thread(this);
        th1.start();
    }
}
