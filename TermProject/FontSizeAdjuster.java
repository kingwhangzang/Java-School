import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSizeAdjuster extends JPanel {
    private JButton upButton;
    private JButton downButton;

    public FontSizeAdjuster(Container container) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        // 글씨 크기 키우는 버튼 생성
        ImageIcon upButtonIcon = new ImageIcon("./Img/upButton.png");
        Image upButtonImage = upButtonIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledUpButtonIcon = new ImageIcon(upButtonImage);
        
        upButton = new JButton(scaledUpButtonIcon);
        upButton.setPreferredSize(new Dimension(25, 25));
        upButton.setBorder(null);
        upButton.setBackground(Color.WHITE);
        
        // 글씨 크기 줄이는 버튼 생성
        ImageIcon downButtonIcon = new ImageIcon("./Img/downButton.png");
        Image downButtonImage = downButtonIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledDownButtonIcon = new ImageIcon(downButtonImage);
        
        downButton = new JButton(scaledDownButtonIcon);
        downButton.setPreferredSize(new Dimension(25, 25));
        downButton.setBorder(null);
        downButton.setBackground(Color.WHITE);

        // 버튼 리스너 추가
        upButton.addActionListener(new FontSizeChanger(2, container)); // 폰트 크기 2 증가
        downButton.addActionListener(new FontSizeChanger(-2, container)); // 폰트 크기 2 감소

        // 패널에 버튼 추가
        add(upButton);
        add(downButton);
    }

    private class FontSizeChanger implements ActionListener {
        private int change;
        private Container container;

        public FontSizeChanger(int change, Container container) {
            this.change = change;
            this.container = container;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            adjustFontSize(container);
        }

        private void adjustFontSize(Container container) {
            for (Component component : container.getComponents()) {
                if (component instanceof JLabel) {
                    JLabel label = (JLabel) component;
                    Font currentFont = label.getFont();
                    int newSize = currentFont.getSize() + change;
                    label.setFont(new Font(currentFont.getName(), currentFont.getStyle(), newSize));
                } else if (component instanceof Container) {
                    adjustFontSize((Container) component);
                }
            }
        }
    }
}

