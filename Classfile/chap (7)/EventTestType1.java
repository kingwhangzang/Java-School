import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventTestType1 extends JFrame implements ActionListener
{
	JButton button1;
	JLabel label;
	JFrame f;

	public EventTestType1 (String msg) {
		f = new JFrame(msg);
		f.setSize(300,200);

		JPanel panel = new JPanel();
		button1 = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");

		button1.addActionListener(this);
		panel.add(button1);
		panel.add(label);

		f.add(panel);
		f.setVisible(true);
	}

	//event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1)
		{
			label.setText("Clicked the Button");
		}
	}
}
