import java.awt.*;
import java.awt.event.*;

public class CardTest 
{	
	Frame f;
	Panel p1,p2,p3;
	Label l1,l2,l3;
	CardLayout card;

	public CardTest(String msg) {
		f = new Frame(msg);
		card = new CardLayout();
		f.setLayout(card);
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		l1 = new Label("First Panel");
		l2 = new Label("Second Panel");
		l3 = new Label("Third Panel");

		p1.add(l1);
		p1.setBackground(Color.yellow);
		p2.add(l2);
		p2.setBackground(Color.green);
		p3.add(l3);
		p3.setBackground(Color.blue);

		MouseHandler handler = new MouseHandler();
		p1.addMouseListener(handler);
		p2.addMouseListener(handler);
		p3.addMouseListener(handler);

		f.add("First",p1);
		f.add("Second", p2);
		f.add("Third", p3);

		card.show(f,"First");
		f.setSize(800,800);
		f.setVisible(true);	
	}

	public class MouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			card.next(f);		//card.next(this);
		}
	}
}
