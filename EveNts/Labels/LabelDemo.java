package Labels;

import java.awt.*;
import java.awt.event.*;

public class LabelDemo extends Frame implements ActionListener{
	String msg = "";
	Button yes,no,maybe;
	public LabelDemo(){
		// Use a flow layout
		setLayout(new FlowLayout()); // compulsory
		
		/*Label one = new Label("One");
		Label two = new Label("Two");
		Label three = new Label("Three");

		// Add lables to frame;
		add(one);
		add(two);
		add(three);*/

		// For Buttons
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("May Be");

		add(yes);
		add(no);
		add(maybe);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	// Handle button action events. it overrides method from ActionListener
	public void actionPerformed(ActionEvent ae){

		//ae.getSource() .getLable() = str
		String str = ae.getActionCommand();
		if (str.equals("Yes")) msg = "Yes pressed.";
		else if (str.equals("No")) msg = "No pressed.";
		else msg = "May Be pressed";
		repaint();
	}

	public void paint(Graphics g){
		g.drawString(msg,20,100);
	}

	public static void main(String args[]){
		LabelDemo appwin = new LabelDemo();

		appwin.setSize(new Dimension(250,150));
		appwin.setTitle("Lable window");
		appwin.setVisible(true);
	}
}