// TODO - make a form with BORDER Layout


// -----------------------------------------------------------

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Form extends Applet implements ActionListener {
    String name, passwd;

    TextField t1, t2;
    Button b1;

    public void init() {
        setLayout(new BorderLayout());

        // Create a panel for the text fields and add them
        Panel textFieldPanel = new Panel();
        textFieldPanel.setLayout(new GridLayout(2, 1)); // Two rows, one column
        t1 = new TextField(20);
        t2 = new TextField(20);
        textFieldPanel.add(t1);
        textFieldPanel.add(t2);
        add(textFieldPanel, BorderLayout.CENTER); // Add the panel to the center

        // Create a panel for the button and add it
        Panel buttonPanel = new Panel();
        b1 = new Button("Verify");
        buttonPanel.add(b1);
        add(buttonPanel, BorderLayout.SOUTH); // Add the button panel to the south

        // Add action listener to the button
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            name = t1.getText();
            passwd = t2.getText();
            System.out.println(name);
            System.out.println(passwd);
        }
    }
}
