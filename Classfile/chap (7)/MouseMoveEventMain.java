import javax.swing.*;

public class MouseMoveEventMain {
    JFrame jf;

    public MouseMoveEventMain(String msg) {
        jf = new JFrame(msg);
        jf.add(new MouseMoveEvent());
        jf.setSize(900, 1000); // Corrected the typo
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Add this to close the application properly
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMoveEventMain("Test Mouse Move Event Type");
    }
}
