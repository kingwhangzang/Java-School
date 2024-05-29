import javax.swing.*;

public class ButtonEventType2Main 
{
    JFrame jf;

    // Constructor should have the same name as the class
    public ButtonEventType2Main(String msg) 
    {
        jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Properly handle the close operation
        jf.add(new ButtonEventType2());
        jf.setSize(300, 500);
        jf.setVisible(true);
    }

    public static void main(String[] arg) {
        // Ensure Swing components are created on the Event Dispatch Thread
		new ButtonEventType2Main("Button Event Type2");
       
    }
}
