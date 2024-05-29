import java.awt.*;
import java.awt.event.*;
 
public class ItemEventCheck extends Frame implements ItemListener, ActionListener
{
	Frame f;
	Checkbox one, two, male, female;
	CheckboxGroup cbg;
	Button exit;

	public ItemEventCheck (String msg) {
		f = new Frame(msg);

		Panel top = new Panel();
		top.add(one = new Checkbox("One"));
		one.addItemListener(this);
		top.add(two = new Checkbox("Two"));
		two.addItemListener(this);

		Panel bottom = new Panel();
		cbg = new CheckboxGroup();
		bottom.add(male = new Checkbox("남자", cbg, true));
		male.addItemListener(this);
		bottom.add(female = new Checkbox("여자", cbg, true));
		female.addItemListener(this);
	
		exit = new Button("Exit"); // Create exit button
		exit.addActionListener(this);
	
		f.add("North", top);
		f.add("South", bottom);
		f.add("East", exit);

		f.setSize(300,200);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	}
	public void itemStateChanged (ItemEvent e) {
		Object o = e.getSource();
		
		if (o == two) {
			if (e.getStateChange() == ItemEvent.SELECTED)
				System.out.println("Two is selected");
			else 
				System.out.println("Two is deselected");
		} else if (o == one)
		{
			if (e.getStateChange() == ItemEvent.SELECTED)
				System.out.println("One is selected");
			else 
				System.out.println("One is deselected");
		} 
		else if (o == male) {
			System.out.println("남자 - selected");
		} else if (o == female) {
			System.out.println("여자 - selected");
		}
	}
}  
