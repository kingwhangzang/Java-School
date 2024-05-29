import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class  JButtonImageLabelTest implements ActionListener {
	JPanel panel;
	JLabel label;
	JButton button;
	JLabel imglabel;
	JFrame jf;
	boolean current = false;

	public JButtonImageLabelTest (String msg) {
		jf = new JFrame(msg);
		jf.setTitle("JButton Event Test");
		jf.setSize(700,700);

		panel = new JPanel();
		label = new JLabel("Click JButton to see Image");
		imglabel = new JLabel();

		button = new JButton("See Img");
		ImageIcon icon = new ImageIcon("Null");
		button.setIcon(icon);
		button.addActionListener(this);
		
		panel.add(imglabel);
		panel.add(label);
		panel.add(button);

		jf.add(panel);
		jf.setVisible(true);		
	}

	public void actionPerformed (ActionEvent e) {
		if(current) {
			imglabel.setIcon(null);
			label.setText ("이미지를 보고 싶으면 버튼을 누르세요");
			current = false;

		}else {
			ImageIcon dog = new ImageIcon("dog.jpeg");
			imglabel.setIcon(dog);
			label.setText("MY DOG-Tan");
			button.setText("Good Luck");	
			current = true;
		}
	}
}
