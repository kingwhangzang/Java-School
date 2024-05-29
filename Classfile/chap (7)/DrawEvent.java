import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;

class DrawEvent extends JPanel
{
    int startX, startY, w, h;
    JPanel jp;

    public DrawEvent() {
        drawPanel(); // drawPanel 메서드 호출
    }

    void drawPanel() {
        addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }
            public void mouseReleased(MouseEvent e) {
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
        });

        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }
            public void mouseMoved(MouseEvent e) {}
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(startX, startY, w, h); // 직사각형 그리기
    }
}