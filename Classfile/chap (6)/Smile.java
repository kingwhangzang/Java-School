import javax.swing.*;
import java.awt.*;

class Smile extends JPanel
{
	public Smile() {
		
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(20,30,200,200);
		
		g.setColor(Color.black);
		g.drawArc(60,80,50,50,180,-180);
		g.drawArc(150,80,50,50,180,-180);
		g.drawArc(70,130,100,70,180,180);
	}
}
