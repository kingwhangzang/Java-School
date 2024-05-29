import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RacingTest extends JFrame {
	JPanel contentPane;
	JPanel menuPanel;
	JPanel centerPanel;
	JButton srartBt;
	Thread[] ths;
	Car[] cars = new Car[] {
		new Car(new ImageIcon("car1.png"),0,10),
		new Car(new ImageIcon("car2.png"),0,10),
		new Car(new ImageIcon("car3.png"),0,10),
		new Car(new ImageIcon("car4.png"),0,10),
		};

	public RacingTest() {
		super("Runnable Test");
		ths = new Thread[cars.length];

		setBounds(100,10,1024,800);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPnae(contentPane);

		menuPanel = new JPanel();
		menuPanel.setLayout(new GridLayout(1,4,5,5));
		startBt = new JButton(new ImageIcon("play.jpg"));
		menuPanel.add(startBt);
		contentPane.add("North", menuPanel);

		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(cars.length,1,5,5));
		contentPane.add("Center",centerPanel);

		startBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0;i < cars.length ; i++) {
					centerPanel.add(cars[i].lane);
				}
				centerPanel.updateUI();
				Car.rank1 = 0;
				game_play();
			}
		});
	}

	public void game_play() {
		makeThread();
		for (int i = 0;i < cars.length; i++){
			ths[i].start();
		}
	}
	public void makeThread() {
		for (int i = 0;i < cars.length; i++){
			ths[i] = new Thread(cars[i]);
		}
	}
}  