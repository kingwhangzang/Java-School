import javax.swing.*;
import java.awt.*;

class  BasicPaint
{
	JFrame jf;

	public BasicPaint(String msg) 
	{
		jf = new JFrame(msg);
		jf.add(new MyPanel());
		jf.setSize(300,200);
		jf.setVisible(true);
	}
}
