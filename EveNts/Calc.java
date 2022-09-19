import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener{
	String msg  = "";
	Button b0,b1 , b2, b3, b4, b5, b6, b7, b8, b9 ,add,sub,mult,div,cls;
	List lst[];
	public Calc(){
		setLayout(new FlowLayout());

		b0 = new Button("0");
		b1= new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");

		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae){
		repaint();
	}
	
	public static void main(String args[]){
		Calc appwin = new Calc();
		
		appwin.setSize(new Dimension(300, 300));
		appwin.setTitle("Calc");
		appwin.setVisible(true);
	}
}
