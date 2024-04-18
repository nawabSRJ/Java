import java.awt.*;
import java.applet.*;
/* <applet code = "Bus" width = 300 height = 200 > </applet> */
public class Ball extends Applet implements Runnable {
    int x = 0;
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(100);  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.WHITE); // Set background color
        g.fillRect(0, 0, d.width, d.height);

        g.setColor(Color.BLACK); // Set the color for the oval
        g.fillOval(x, d.height / 4, 50, 50);
        x += 5;
        if (x + 50 > d.width) {
            x = 0;
        }
    }
}
