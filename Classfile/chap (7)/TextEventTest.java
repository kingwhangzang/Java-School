import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEventTest implements TextListener, ActionListener, KeyListener {
	TextArea edit;
	Button exit;
	Frame f;

	public TextEventTest (String msg) {
		f = new Frame(msg);
		edit = new TextArea();
		edit.addTextListener(this);
		edit.addKeyListener(this); // KeyListener 추가
		exit = new Button("Exit");
		exit.addActionListener(this);

		f.add("Center", edit);
		f.add("South", exit);
		f.setSize(300,250);
		f.setVisible(true);		
	}

	public void textValueChanged(TextEvent e) {}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			System.out.println("Text Value 내용이 변경되었습니다.");
		}
	}

	public void actionPerformed(ActionEvent e) {
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	}
}
