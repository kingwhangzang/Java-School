import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class  KeyTypeEvent extends JPanel
{
    BufferedImage img = null;
    int img_x = 1, img_y = 1;

    public KeyTypeEvent ()
    {
        try
        {
            img = ImageIO.read(new File("car.png"));
        } catch (IOException e){
            System.out.println("No image");
            System.exit(1);
        }

        addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode(); // Corrected method name to getKeyCode()
                switch (keycode) {
                    case KeyEvent.VK_UP : img_y -= 10;        break;
                    case KeyEvent.VK_DOWN : img_y += 10;      break;
                    case KeyEvent.VK_LEFT : img_x -= 10;      break;
                    case KeyEvent.VK_RIGHT : img_x += 10;     break;
                }
                repaint();
            }
            public void keyReleased(KeyEvent e){  } // Corrected method name to keyReleased
            public void keyTyped (KeyEvent e) {  } // Corrected method name to keyTyped
        });
        this.requestFocus();
        setFocusable(true);
    }
    public void paintComponent(Graphics g) { // Corrected method name to paintComponent
        super.paintComponent(g);
        g.drawImage(img,img_x,img_y, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new KeyTypeEvent());
        frame.setVisible(true);
    }
}
