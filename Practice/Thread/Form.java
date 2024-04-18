import java.awt.*;
import java.applet.*;
import java.awt.event.*;


// <applet code = "Form" width = 500 height = 300 > </applet> 

public class Form extends Applet implements ActionListener{

	TextField t1 , t2;
	Button b1;

	public void init(){
		
		setLayout(new FlowLayout(FlowLayout.CENTER));

		
		t1 = new TextField(20);	t2 = new TextField(20);
		add(t1);  add(t2);
		
		
		b1 = new Button("Submit");
		add(b1);

		b1.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){
			String name = t1.getText();
			String stn = t2.getText();
			System.out.println("Name : " + name);
			System.out.println("Class : " + stn);
		}
	}

} // class ends