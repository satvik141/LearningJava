package Labels;

import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Frame implements ItemListener{
	String msg = "";
	Checkbox na, male,female, others;
	CheckboxGroup cbg;
	public CheckboxDemo(){
		
		setLayout(new FlowLayout());
		
		// Create a group
		cbg = new CheckboxGroup();
		
		na = new Checkbox("N/A",cbg,true);
		male = new Checkbox("Male",cbg,false);
		female = new Checkbox("Female",cbg,false);
		others = new Checkbox("Other",cbg,false);
		
		add(na);
		add(male);
		add(female);
		add(others);
		
		na.addItemListener(this);
		male.addItemListener(this);
		female.addItemListener(this);
		others.addItemListener(this);

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
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,20,120);
		/*msg = "Current state: ";
		g.drawString(msg,20,120);
		msg = "	N/A: " + na.getState();
		g.drawString(msg,20,140);
		msg = "	Male: " + male.getState();
		g.drawString(msg,20,160);
		msg = "	Female: " + female.getState();
		g.drawString(msg,20,180);
		msg = "	Others: " + others.getState();
		g.drawString(msg,20,200);*/
	}

	public static void main(String args[]){
		CheckboxDemo appwin =new CheckboxDemo();
		
		appwin.setSize(new Dimension(240,220));
		appwin.setName("Check box Demo");
		appwin.setVisible(true);
	}
}