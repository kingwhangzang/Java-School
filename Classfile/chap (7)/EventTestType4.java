import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventTestType4 extends JFrame
{
	JButton button;
	JLabel label;
	JFrame f;

	public EventTestType4 (String msg) {
		f = new JFrame(msg);
		f.setSize(300,200);

		JPanel panel = new JPanel();
		button = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");

		button.addActionListener(new MyListenerEvent(label));
		panel.add(button);
		panel.add(label);

		f.add(panel);
		f.setVisible(true);
	}

}
