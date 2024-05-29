import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	
	public  class MyListenerEvent implements ActionListener {
		JLabel label;
		JButton button;
		
		MyListenerEvent(JLabel l) {
			label = l;
		
}
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		label.setText("Clicked the Button");
		}
	}