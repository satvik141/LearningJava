import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FrameWindow extends Frame{
	int chsX = 100, chsY=100;
	GraphicsEnvironment ge;

	Font f;
	String msg;

	public FrameWindow(){

		f =  new Font("Hello Satvik",Font.ITALIC,19);
		msg = "Hello Satvik";
		setFont(f);
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent me){
				int x = me.getX();
				int y = me.getY();
				chsX = x-10;
				chsY = y-10;
				repaint();
			}
		});
		//Anonymous inner class to handle window close events.
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		// Get the graphics environment.
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		// Obtain list of the fints.
		//String fontList[] = ge.getAvailableFontFamilyNames();

	}
	// paints displays what we want in on window (overriding)
	public void paint(Graphics g){
		g.drawString(msg,50,50);

		
		//fill or drawRoundRect(int left, int top, int width, int height, int xDiam, int yDiam)
		g.fillRoundRect(150,150,200,200,50,50);

		//drawLine(int startX, int startY, int endX, int endY )
		g.setColor(new Color(255,100,100));
		g.drawLine(250,500,250,0);
		g.drawLine(500,250,0,250);

		// Everything has filll and draw
		//drawRect(int left, int top, int width, int height);
		//fillRect(int left, int top, int width, int height);
		g.setColor(new Color(100,255,100));
		g.drawRect(200,200,100,100);
		g.fillRect(225,225,50,50);

		// Ellipses and Circles
		g.drawOval(100,100,30,50); // Width and height are different for ellipse
		g.drawOval(100,400,30,30); // both are same

		// Arcs drawArc(int left, int top, int width, int height, int startAngle, int sweepAngle)
		g.fillArc(200,250,100,100,180,180);
		g.fillArc(250,200,100,100,270,180);
		g.fillArc(200,150,100,100,0,180);
		g.fillArc(150,200,100,100,90,180);

		// Polygon
		int x[] = {50,100,50,100};
		int y[] = {50,50,100,100};
		g.drawPolygon(x,y,4);

		// setXORMode() setPaintMode()
		g.setXORMode(Color.black);
		g.drawLine(chsX-10,chsY,chsX+10,chsY);
		g.drawLine(chsX,chsY-10,chsX,chsY+10);
		g.setPaintMode();
		//void repaint(long maxDelay, int x, int y, int width, int height)
		//repaint();
	}
	public static void main(String args[]){
		FrameWindow fw = new FrameWindow();
		
		// Specify (int Width, int Height)
		fw.setSize(500, 500);

		// Specify Title of the window
		fw.setTitle("InnerClassDemo");
		fw.setVisible(true);

		fw.setBackground(Color.white);
		fw.setForeground(Color.orange);
		
	}
}