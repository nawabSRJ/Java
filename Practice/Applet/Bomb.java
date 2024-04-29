import java.awt.*;
import java.applet.*;
import java.awt.event.*;
// <applet code="Bomb" width=1000 height=900> </applet>
public class Bomb extends Applet implements Runnable , ActionListener{
    Thread th1;
    int x, y, ht, wd, xwd, ywd;
    Button msg;
    public void init() {
        ht = 768;
        wd = 1366;
        x = wd / 2;
        y = 0;
        xwd = 40;
        ywd = 40;
	msg = new Button("Allahh huu Akbar");
	add(msg);
	msg.addActionListener(this);
        th1 = new Thread(this);
        // th1.start(); ~ move to actionPerformed function for click and perform animation
    }

    public void paint(Graphics g) {
	setBackground(Color.BLACK);
	Font font = new Font("Arial", Font.BOLD, 44);
	g.setFont(font);


        g.setColor(Color.ORANGE);
        g.fillOval(x, y, xwd, ywd);

        // changing dimensions :
        y += 25;
        if (y > ht - 40) {
		setBackground(Color.WHITE);
		
            // blast
            xwd = wd;
            ywd = ht;
            x = (wd - xwd) / 2; // Update x position
            // y = (ht - ywd) / 2; // Update y position
	    y -= ht - 20;
	
        }
    }
    public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == msg){
			th1.start();
		}
	}
    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(100); 
            }
        } catch(Exception e){
		System.out.println(e);
	} 
}

} // class ends                                                                                      