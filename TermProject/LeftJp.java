import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class LeftJp extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.GRAY);

        // (x1, y1)에서 (x2, y2)까지의 줄 그리기
        g2d.drawLine(0, 30, 500, 30);  // 예시로 위쪽에 가로줄 그리기
    }
}