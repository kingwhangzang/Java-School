import javax.swing.*;
import java.awt.*;
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
    
    ImagePanel card;
    
    JButton pay_button;
    JButton HomeButton;
    JButton VoiceButton;
    
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
        
        
        jf.setVisible(true);
    }
}