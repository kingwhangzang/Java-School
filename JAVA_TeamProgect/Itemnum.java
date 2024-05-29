import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Itemnum extends JPanel {
    private JButton plusButton, minusButton, orderButton;
    private JLabel quantityLabel;
    private int quantity = 0;
    private int price = 0;

    private SelectQuantity select;

    public Itemnum() {
        setLayout(new BorderLayout());

        // 아메리카노 이미지 아이콘 설정
        ImageIcon americanoIcon = new ImageIcon("./Img/아메리카노.png");
        Image americanoImage = americanoIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledAmericanoIcon = new ImageIcon(americanoImage);
        JLabel americanoLabel = new JLabel(scaledAmericanoIcon);

        JPanel imagePanel = new JPanel();
        imagePanel.add(americanoLabel);

        // 수량 조절 버튼 패널
        minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (quantity > 0) {
                    quantity--;
                    updatePrice();
                }
            }
        });

        quantityLabel = new JLabel(Integer.toString(quantity));

        plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity++;
                updatePrice();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(minusButton);
        buttonPanel.add(quantityLabel);
        buttonPanel.add(plusButton);

        // 주문 담기 버튼
        orderButton = new JButton("주문 담기");
        orderButton.setEnabled(false);
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProductInfo(); // 주문 담기 버튼 클릭 시 제품 정보를 추가하는 메서드 호출
            }
        });

        // 제품 정보와 주문 버튼을 담은 패널
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(buttonPanel, BorderLayout.CENTER);
        controlPanel.add(orderButton, BorderLayout.SOUTH);

        add(imagePanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.CENTER);
    }

    // NaviBar1 객체 설정
    public void setNaviBar(SelectQuantity select) {
        this.select = select;
    }

    private void updatePrice() {
        price = quantity * 3000; // 가격은 임의로 설정
        quantityLabel.setText(Integer.toString(quantity));
        orderButton.setEnabled(quantity > 0); // 주문 수량이 0 이상일 때 주문 담기 버튼 활성화
    }

    private void addProductInfo() {
        if (select != null) {
            // 제품 정보를 나타내는 레이블 생성
            JLabel menuLabel = new JLabel("아메리카노"); // 예시 제품명
            JLabel quantityLabel = new JLabel(Integer.toString(quantity));
            JLabel priceLabel = new JLabel(Integer.toString(price));

            // 각각의 JLabel을 별도의 JPanel에 추가하여 수직으로 배치
            JPanel menuPanel = new JPanel();
            menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
            menuPanel.add(menuLabel);

            JPanel quantityPanel = new JPanel();
            quantityPanel.setLayout(new BoxLayout(quantityPanel, BoxLayout.Y_AXIS));
            quantityPanel.add(quantityLabel);

            JPanel pricePanel = new JPanel();
            pricePanel.setLayout(new BoxLayout(pricePanel, BoxLayout.Y_AXIS));
            pricePanel.add(priceLabel);

            // NaviBar1의 해당 패널에 추가
            select.left_menu.add(menuPanel);
            select.left_num.add(quantityPanel);
            select.left_price.add(pricePanel);

            // 패널을 업데이트
            select.left_menu.revalidate();
            select.left_menu.repaint();
            select.left_num.revalidate();
            select.left_num.repaint();
            select.left_price.revalidate();
            select.left_price.repaint();
        }

        resetOrder();
    }

    private void resetOrder() {
        quantity = 0;
        price = 0;
        updatePrice();
    }
}

