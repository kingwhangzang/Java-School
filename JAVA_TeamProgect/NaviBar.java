import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class NaviBar extends JFrame{
	
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
    
    
    public NaviBar(String msg) {
    	
        // 홈 화면
        jf = new JFrame(msg);
        jf.setSize(500, 800);
        jf.setLayout(null);

        
        // 메인 하단 회색 패널
        bigJp = new JPanel();
        bigJp.setLayout(null);
        bigJp.setSize(500, 180);
        bigJp.setBackground(Color.decode("#E8E8E8"));
        bigJp.setLocation(0, 590);
        
        
        // 왼쪽 패널 메뉴, 수량, 가격 3개 패널로 쪼개기
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

        
        // 1열. 메뉴, 수량, 가격
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

        
        // 오론쪽 패널 회색
        rightJp = new JPanel();
        rightJp.setLayout(null);
        rightJp.setSize(100, 160);
        rightJp.setBackground(Color.decode("#D9D9D9"));
        rightJp.setLocation(370, 10);
        
        
        // 총 수량
        totalnum = new JLabel("총 수량");
        totalnum.setForeground(Color.BLACK);
        Font totalnumfont = new Font("맑은 고딕", Font.BOLD, 16);
        totalnum.setFont(totalnumfont);
        totalnum.setSize(100, 20);
        totalnum.setLocation(15, 5);
        rightJp.add(totalnum);

        
        // 오른쪽 패널 안에 검은 패널
        blackJp = new JPanel();
        blackJp.setLayout(null);
        blackJp.setSize(100, 130);
        blackJp.setBackground(Color.BLACK);
        blackJp.setLocation(0, 30);

        
        // 검은 패널 내부 상단 카드 아이콘
        card = new ImagePanel("./Img/card.png");
        card.setSize(80, 80);
        card.setLocation(10,10);
        card.setBackground(Color.BLACK);
        blackJp.add(card);

        
        // 검은 패널 내부 하단 '결제하기' 버튼
        pay_button = new JButton("결제하기");
        pay_button.setSize(100, 20);
        pay_button.setLocation(0, 100);

        // 결제 완료(PayCompleted) panel 안 보이도록 JFrame에 추가
        PayCompleted pay = new PayCompleted();
        pay.setLocation(10, 150);
        pay.setSize(470, 610);
        pay.setVisible(false);
        jf.add(pay);

        // 결제 완료 panel 보이게 만드는 버튼 설정
        pay_button.addActionListener(new ActionListener() {
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
            }
        });

        blackJp.add(pay_button);
        bigJp.add(left_menu);
        bigJp.add(left_num);
        bigJp.add(left_price);
        rightJp.add(blackJp);
        bigJp.add(rightJp);
        jf.add(bigJp);
        
        
        
        
        // 상단에 노란 패널
        NaviBarTopPanel = new JPanel();
        NaviBarTopPanel.setBackground(Color.decode("#FFE664"));
        NaviBarTopPanel.setBounds(0, 0, 500, 150);
        NaviBarTopPanel.setLayout(null);
        jf.add(NaviBarTopPanel);
        
        
        // 노란 패널 내부 "스노우 커피" 글자 삽입
        snowcoffeelabel = new JLabel("스노우 커피");
        Font panelfont = new Font("맑은 고딕", Font.PLAIN, 50);
        snowcoffeelabel.setFont(panelfont);
        snowcoffeelabel.setBounds(100, 20, 300, 50);
        NaviBarTopPanel.add(snowcoffeelabel);
        
        
        // 노란 패널 내부 왼쪽 홈버튼과 "홈버튼" 텍스트
        ImageIcon HomeButtonIcon = new ImageIcon("./Img/HomeButton.png");
        Image HomeButtonimage = HomeButtonIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledHomeButtonIcon = new ImageIcon(HomeButtonimage);
        
        HomeButton = new JButton(scaledHomeButtonIcon);
        HomeButton.setBounds(20, 20, 50, 50);
        HomeButton.setBackground(Color.decode("#FFE664"));
        HomeButton.setBorder(null);
        NaviBarTopPanel.add(HomeButton);
        // "홈버튼" 버튼에 ActionListener 추가
        HomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pay.setVisible(false);
                rightJp.setVisible(true);
                blackJp.setVisible(true);
                coffeeButton.setVisible(true);
                decafButton.setVisible(true);
                beverageButton.setVisible(true);
                sugarButton.setVisible(true);
                jf.revalidate();
                jf.repaint();

            }
        });
        
        HomeButtonletter = new JLabel("홈화면");
        Font HomeButtonletterfont = new Font("맑은 고딕", Font.BOLD, 17);
        HomeButtonletter.setFont(HomeButtonletterfont);
        HomeButtonletter.setBounds(20, 55, 100, 50);
        NaviBarTopPanel.add(HomeButtonletter);

        
        // 노란 패널 내부 오른쪽 음성인식 아이콘과 "음성인식" 텍스트
        ImageIcon VoiceButtonIcon = new ImageIcon("./Img/VoiceButton.png");
        Image VoiceButtonimage = VoiceButtonIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon scaledVoiceButtonIcon = new ImageIcon(VoiceButtonimage);
        
        VoiceButton = new JButton(scaledVoiceButtonIcon);
        VoiceButton.setBounds(390, 18, 60, 60);
        VoiceButton.setBackground(Color.decode("#FFE664"));
        VoiceButton.setBorder(null);
        NaviBarTopPanel.add(VoiceButton);
        
        VoiceButtonletter = new JLabel("음성인식");
        Font VoiceButtonletterfont = new Font("맑은 고딕", Font.BOLD, 18);
        VoiceButtonletter.setFont(VoiceButtonletterfont);
        VoiceButtonletter.setBounds(383, 63, 100, 50);
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

        // "당류 함량" 버튼에 ActionListener 추가
    sugarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // SugarContentHome 창을 열기
            SugarContentHome sugarContentHome = new SugarContentHome();
            sugarContentHome.setVisible(true); // 화면에 표시
        }
    });

        jf.setVisible(true);
    }

     // 버튼 생성을 위한 헬퍼 메서드
     private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("맑은 고딕", Font.BOLD, 18)); // 폰트 설정
        button.setBackground(Color.ORANGE); // 버튼의 배경을 주황색으로 설정
        button.setOpaque(true); // 배경색이 제대로 표시되도록 설정
        button.setBorderPainted(true);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); // 하얀색 얇은 테두리 설정
        return button;
    }
}