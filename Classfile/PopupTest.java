import java.awt.*;
import java.event.*;

public class  PopupTest extends Frame implements ActionListener
{
	PopupMenu popup;
	Frame t;
	Button b;
	public PopupTest () {
		t = new Frame("Popup Test");
		b = new Button("Popup Test");
		b.addActionListener(this);

		popup = new PopupMenu("POP - UP");
		popup.add(new MenuItem("copy");
		popup.add(new MenuItem("paste");
		Menu.col = new Menu("color");
		col.add(new MenuItem("white");
		col.add(new MenuItem("blue");

		popup.add(col);
		b.add(popup);
		f.add("Center",b);
		f.setSize(300,200);
		f.setVisible(true);


	}
}
