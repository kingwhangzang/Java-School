import javax.swing.*;
import java.awt.*;

class MyPolyLine extends JPanel
{
	public MyPolyLine(){
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		
		int[] xp = new int[] {10,50,100,200,10,10};
		int[] yp = new int[] {10,10,100,200,200,10};

		g.drawPolyline(xp,yp,6);
		g.drawLine(50,100,70,100);
	}
}
