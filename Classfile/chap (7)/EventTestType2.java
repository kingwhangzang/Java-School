import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventTestType2 extends JFrame
{
	JButton button;
	JLabel label;
	JFrame f;

	public EventTestType2 (String msg) {
		f = new JFrame(msg);
		f.setSize(300,200);

		JPanel panel = new JPanel();
		button = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");

		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);

		f.add(panel);
		f.setVisible(true);
	}

	//event
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button)
			{
				label.setText("Clicked the Button");
			}
	}
	}
}
