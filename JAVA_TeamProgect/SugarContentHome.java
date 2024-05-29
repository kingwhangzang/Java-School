import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SugarContentHome extends JFrame {

    JFrame jf;

    LeftJp left_menu;
    LeftJp left_num;
    LeftJp left_price;

    JPanel bigJp;
    JPanel NaviBarTopPanel;
    JPanel rightJp;
    JPanel blackJp;
    JPanel whitePanel;
    JPanel categoryPanel;
    JPanel sugarJP;

    ImagePanel card;

    JButton pay_button;
    JButton HomeButton;
    JButton VoiceButton;
    JButton coffeeButton;
    JButton decafButton;
    JButton beverageButton;
    JButton sugarButton;

    JLabel menu;
    JLabel num;
    JLabel price;
    JLabel totalnum;
    JLabel pay;
    JLabel HomeButtonletter;
    JLabel VoiceButtonletter;
    JLabel snowcoffeelabel;
    JLabel FontSize;
    JLabel firstLevel;
    JLabel secondLevel;
    JLabel thirdLevel;
    JLabel c1, c2, c3, c4, c5, c6, c7, c8, c9;

    // 기본 생성자
    public SugarContentHome() {
        this("당류 함량");
    }

    // 파라미터를 받는 생성자
    public SugarContentHome(String msg) {
        // 홈 화면 설정
        jf = new JFrame(msg);
        jf.setSize(500, 800);
        jf.setLayout(null);

        // 메인 하단 회색 패널
        bigJp = new JPanel();
        bigJp.setLayout(null);
        bigJp.setSize(500, 180);
        bigJp.setBackground(Color.decode("#E8E8E8"));
        bigJp.setLocation(0, 590);

        // 왼쪽 패널 설정
        left_menu = new LeftJp();
        left_menu.setSize(150, 160);
        left_menu.setBackground(Color.WHITE);
        left_menu.setLocation(10, 10);

        left_num = new LeftJp();
        left_num.setSize(80, 160);
        left_num.setBackground(Color.WHITE);
        left_num.setLocation(160, 10);

        left_price = new LeftJp();
        left_price.setSize(120, 160);
        left_price.setBackground(Color.WHITE);
        left_price.setLocation(240, 10);

        // 레이블 설정
        menu = new JLabel("메뉴");
        num = new JLabel("수량");
        price = new JLabel("가격");

        Font letterfont = new Font("맑은 고딕", Font.BOLD, 17);
        menu.setFont(letterfont);
        num.setFont(letterfont);
        price.setFont(letterfont);

        left_menu.add(menu, BorderLayout.CENTER);
        left_num.add(num, BorderLayout.CENTER);
        left_price.add(price, BorderLayout.CENTER);

        // 오른쪽 패널 설정
        rightJp = new JPanel();
        rightJp.setLayout(null);
        rightJp.setSize(100, 160);
        rightJp.setBackground(Color.decode("#D9D9D9"));
        rightJp.setLocation(370, 10);

        totalnum = new JLabel("총 수량");
        totalnum.setForeground(Color.BLACK);
        Font totalnumfont = new Font("맑은 고딕", Font.BOLD, 16);
        totalnum.setFont(totalnumfont);
        totalnum.setSize(100, 20);
        totalnum.setLocation(15, 5);
        rightJp.add(totalnum);

        // 검은 패널 설정
        blackJp = new JPanel();
        blackJp.setLayout(null);
        blackJp.setSize(100, 130);
        blackJp.setBackground(Color.BLACK);
        blackJp.setLocation(0, 30);

        // 결제 완료(PayCompleted) panel 안 보이도록 JFrame에 추가
        PayCompleted pay = new PayCompleted();
        pay.setLocation(10, 150);
        pay.setSize(470, 610);
        pay.setVisible(false);
        jf.add(pay);

        card = new ImagePanel("./Img/card.png");
        card.setSize(80, 80);
        card.setLocation(10, 10);
        card.setBackground(Color.BLACK);
        blackJp.add(card);

        pay_button = new JButton("결제하기");
        pay_button.setSize(100, 20);
        pay_button.setLocation(0, 100);
        pay_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pay.setVisible(true);
                rightJp.setVisible(false);
                blackJp.setVisible(false);
                coffeeButton.setVisible(false);
                decafButton.setVisible(false);
                beverageButton.setVisible(false);
                sugarButton.setVisible(false);
                jf.revalidate();
                jf.repaint();
                jf.revalidate();
                jf.repaint();
            }
        });

        blackJp.add(pay_button);
        bigJp.add(left_menu);
        bigJp.add(left_num);
        bigJp.add(left_price);
        rightJp.add(blackJp);
        bigJp.add(rightJp);
        jf.add(bigJp);

        // 상단 노란 패널 설정
        NaviBarTopPanel = new JPanel();
        NaviBarTopPanel.setBackground(Color.decode("#FFE664"));
        NaviBarTopPanel.setBounds(0, 0, 500, 150);
        NaviBarTopPanel.setLayout(null);
        jf.add(NaviBarTopPanel);

        snowcoffeelabel = new JLabel("스노우 커피");
        Font panelfont = new Font("맑은 고딕", Font.PLAIN, 50);
        snowcoffeelabel.setFont(panelfont);
        snowcoffeelabel.setBounds(100, 20, 300, 50);
        NaviBarTopPanel.add(snowcoffeelabel);

        HomeButton = new ImageButton("./Img/HomeButton.png");
        HomeButton.setBounds(20, 20, 50, 50);
        HomeButton.setBackground(Color.decode("#FFE664"));
        NaviBarTopPanel.add(HomeButton);

        HomeButtonletter = new JLabel("홈화면");
        Font HomeButtonletterfont = new Font("맑은 고딕", Font.BOLD, 17);
        HomeButtonletter.setFont(HomeButtonletterfont);
        HomeButtonletter.setBounds(20, 55, 100, 50);
        NaviBarTopPanel.add(HomeButtonletter);

        HomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // NaviBar 인스턴스 생성 및 표시
                NaviBar naviBar = new NaviBar("스노우 커피 홈 화면");
                naviBar.setVisible(true); // NaviBar 창을 보이게 함

                // 현재 창을 숨김 (또는 dispose()를 호출하여 완전히 닫을 수 있음)
                jf.setVisible(false); // 또는 jf.dispose();
            }
        });

        VoiceButton = new ImageButton("./Img/VoiceButton.png");
        VoiceButton.setBounds(400, 18, 55, 55);
        VoiceButton.setBackground(Color.decode("#FFE664"));
        VoiceButton.setBorder(null);
        NaviBarTopPanel.add(VoiceButton);

        VoiceButtonletter = new JLabel("음성인식");
        Font VoiceButtonletterfont = new Font("맑은 고딕", Font.BOLD, 18);
        VoiceButtonletter.setFont(VoiceButtonletterfont);
        VoiceButtonletter.setBounds(390, 55, 100, 50);
        NaviBarTopPanel.add(VoiceButtonletter);

        // 패널 내의 모든 글씨 크기 조절
        FontSizeAdjuster fontSizeAdjuster = new FontSizeAdjuster(jf.getContentPane());
        fontSizeAdjuster.setBounds(410, 110, 120, 60);
        jf.add(fontSizeAdjuster);


        // "글씨 크기" 텍스트
        FontSize = new JLabel("글씨 크기");
        Font FontSizefont = new Font("맑은 고딕", Font.BOLD, 18);
        FontSize.setFont(FontSizefont);
        FontSize.setBounds(330, 102, 150, 50);
        NaviBarTopPanel.add(FontSize);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setLayout(null);
        whitePanel.setBounds(322, 110, 160, 35);
        NaviBarTopPanel.add(whitePanel);

        // 카테고리 패널 설정
        categoryPanel = new JPanel();
        categoryPanel.setLayout(new GridLayout(1, 4)); // 1행 4열 그리드 레이아웃
        categoryPanel.setBounds(0, 150, 490, 60); // 위치와 크기 설정
        jf.add(categoryPanel);

        // 각 카테고리 버튼 생성 및 추가
        coffeeButton = createButton("커피");
        decafButton = createButton("디카페인");
        beverageButton = createButton("음료");
        sugarButton = createButton("당류 함량");

        categoryPanel.add(coffeeButton);
        categoryPanel.add(decafButton);
        categoryPanel.add(beverageButton);
        categoryPanel.add(sugarButton);


        //당류 함량 1행 패널 설정
        sugarJP = new JPanel();
        sugarJP.setLayout(new GridLayout(1, 4));//1행 4열 그리드
        sugarJP.setBounds(0, 210, 490, 126);
        jf.add(sugarJP);

        // 당류 함량 1레벨 레이블 생성 및 추가
        firstLevel = new JLabel("0-10g", SwingConstants.CENTER);
        firstLevel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        sugarJP.add(firstLevel);

        sugarJP.add(createImagePanelWithText("./Img/아메리카노.png", "아메리카노"));
        sugarJP.add(createImagePanelWithText("./Img/카푸치노.png", "카푸치노"));
        sugarJP.add(createImagePanelWithText("./Img/카페라떼.png", "카페라떼"));

        //당류 함량 2행 패널 설정
        sugarJP = new JPanel();
        sugarJP.setLayout(new GridLayout(1, 4));//1행 4열 그리드
        sugarJP.setBounds(0, 336, 490, 126);
        jf.add(sugarJP);

        // 당류 함량 2레벨 레이블 생성 및 추가
        firstLevel = new JLabel("11-20g", SwingConstants.CENTER);
        firstLevel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        sugarJP.add(firstLevel);

        sugarJP.add(createImagePanelWithText("./Img/바닐라더블.png", "바닐라더블"));
        sugarJP.add(createImagePanelWithText("./Img/바닐라라떼.png", "바닐라라떼"));
        sugarJP.add(createImagePanelWithText("./Img/사케라또.png", "사케라또"));

        //당류 함량 3행 패널 설정
        sugarJP = new JPanel();
        sugarJP.setLayout(new GridLayout(1, 4));//1행 4열 그리드
        sugarJP.setBounds(0, 462, 490, 126);
        jf.add(sugarJP);

        // 당류 함량 3레벨 레이블 생성 및 추가
        firstLevel = new JLabel("21-30g", SwingConstants.CENTER);
        firstLevel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        sugarJP.add(firstLevel);

        sugarJP.add(createImagePanelWithText("./Img/라벤더라떼.png", "라벤더라떼"));
        sugarJP.add(createImagePanelWithText("./Img/카라멜 마키아또.png", "마키아또"));
        sugarJP.add(createImagePanelWithText("./Img/카페모카.png", "카페모카"));

        jf.add(sugarJP);


        jf.setVisible(true);
    }

    // Helper method for button creation
    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        if (label.equals("당류 함량")) {
            button.setBackground(Color.decode("#E8E8E8")); // 당류 함량 버튼의 배경색을 회색으로 설정
        } else {
            button.setBackground(Color.ORANGE); // 다른 버튼의 배경색을 주황색으로 설정
        }
        button.setOpaque(true);
        button.setBorderPainted(true);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); // 하얀색 얇은 테두리 설정
        return button;
    }

    private JPanel createImagePanelWithText(String imgPath, String text) {
        JPanel panel = new JPanel(new BorderLayout());
        ImageIcon icon = new ImageIcon(new ImageIcon(imgPath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(icon, SwingConstants.CENTER);
        JLabel textLabel = new JLabel(text, SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        textLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(textLabel, BorderLayout.SOUTH);

        // 마우스 리스너 추가
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 이미지가 아메리카노인 경우 SelectQuantity 창 열기
                if (imgPath.contains("아메리카노")) {
                    openNaviBar1();
                }
            }
        });
        return panel;
    }


    private void openNaviBar1() {
        // NaviBar1.java 인스턴스 생성 및 보이기
        SelectQuantity naviBar1 = new SelectQuantity("수량선택");
        naviBar1.setVisible(true);
    }

    public class ImageButton extends JButton {
        private Image image;

        public ImageButton(String imgPath) {
            this.image = new ImageIcon(imgPath).getImage();
            setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
            setContentAreaFilled(false);
            setBorderPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
