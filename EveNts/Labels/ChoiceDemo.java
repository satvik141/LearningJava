package Labels;

import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {
	// Insted of Choice try using List(int numRows, Boolean multipleSelect)
	// for above implements ActionListener
	Choice os,browser;
	String msg = "";
	
	public ChoiceDemo(){
		
		// Set Label
		setLayout(new FlowLayout());

		// Create choice lists
		os = new Choice();
		browser = new Choice();
		
		//Add items to os list.
		os.add("Windows");
		os.add("Linux");
		os.add("Parrot");
		
		browser.add("Chrome");
		browser.add("Firefox");
		browser.add("Brave");

		add(os);
		add(browser);

		os.addItemListener(this);
		browser.addItemListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie){
		repaint();
	}

	public void paint(Graphics g){
		msg = "OS: "+os.getSelectedItem();
		g.drawString(msg,20,100);
		msg ="Browser: "+ browser.getSelectedItem();
		g.drawString(msg,20,120);
	}
	
	public static void main(String args[]){
		ChoiceDemo appwin = new ChoiceDemo();
		
		appwin.setSize(new Dimension(200,200));
		appwin.setVisible(true);
		appwin.setTitle("Choice Demo");
	}
}