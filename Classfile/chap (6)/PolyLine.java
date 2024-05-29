import javax.swing.*;
import java.awt.*;

class  PolyLine
{
	JFrame jf;
	public PolyLine (String msg)
	{
		jf = new JFrame(msg);
		jf.add(new MyPolyLine());
		jf.setSize(600,600);
		jf.setVisible(true);
	}
}
