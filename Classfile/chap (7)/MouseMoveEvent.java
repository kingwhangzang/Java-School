import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class MouseMoveEvent extends JPanel implements MouseListener, MouseMotionListener {
    BufferedImage img = null;
    int img_x = 0, img_y = 0;

    public MouseMoveEvent() {
        try {
            img = ImageIO.read(new File("car.png"));
        } catch (IOException e) {
            System.out.println("no image");
            System.exit(1);
        }
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        img_x = e.getX();
        img_y = e.getY();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        img_x = e.getX();
        img_y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}
