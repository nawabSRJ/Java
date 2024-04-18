import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code = "Btn" width = 700 height = 500 > </applet> */

public class Calc extends Applet implements ActionListener {

TextField t1 , t2,t3;
Button b1 , b2 , b3 , b4;

public void init(){
	t1 = new TextField(20);
	t2 = new TextField(20);
	add(t1);
	add(t2);
	b1 = new Button("+");
	add(b1);
	b2 = new Button("-");
	add(b2);
	b3 = new Button("*");
	add(b3);
	b4 = new Button("/");
	add(b4);

	
	b2.addActionListener(this);
	b1.addActionListener(this);

	t3 = new TextField(20);
	add(t3);

// overriden 
}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource() == b1){
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		
		int z = x + y;
		t3.setText(z + " "); // typecast
		
	}
	if(ae.getSource() == b2){
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		
		int z = x - y;
		t3.setText(z + " "); // typecast
		
	}

}


} // class ends

