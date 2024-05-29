import javax.swing.*;
import java.awt.*;

class SnowFace 
{
	JFrame jf;
	public SnowFace (String msg)
	{
		jf = new JFrame(msg);
		jf.add(new Smile());

		jf.setSize(600,600);
		jf.setVisible(true);
	}
}
