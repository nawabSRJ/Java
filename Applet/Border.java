import java.awt.*;
import java.applet.*;

// <applet code="Border" width=700 height=400></applet>

public class Border extends Applet {

    public void paint(Graphics g){

	//g.setColor(Color.BLUE);
	setBackground(Color.BLUE);	
    }
    public void init() {
        setLayout(new BorderLayout());

        add(new Button("This is Top"), BorderLayout.NORTH);
        add(new Label("The footer message"), BorderLayout.SOUTH);
	
	
	add(new Button ("Righty"), BorderLayout.EAST);
	add(new Button ("LEFT"), BorderLayout.WEST);

        String msg = "Just Do it!!";
        add(new TextArea(msg), BorderLayout.CENTER);
    }
}
