import java.awt.*;
import java.awt.event.*;

class  RacingTestMain
{
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					RacingTest frame = new RacingTest();
					frame.setVisible(true);
				} catch ()
				{
					e.printStackTrace();
				}
			}
		});
	}
}
