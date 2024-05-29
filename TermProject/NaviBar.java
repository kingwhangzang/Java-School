import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class NaviBar extends JFrame {
    Itemnum itemnumPanel;
    FontSizeAdjuster fontSizeAdjuster;
    JPanel blackPanel;
	JFrame jf;
    
    LeftJp left_menu;
    LeftJp left_num;
    LeftJp left_price;
    
    JPanel bigJp, NaviBarTopPanel, rightJp, whitePanel, blackJp;
        
    ImagePanel card;
    
    JButton pay_button, VoiceButton, HomeButton;
    JLabel menu, num, price, totalnum, pay, HomeButtonletter, VoiceButtonletter, snowcoffeelabel, FontSize;
    
    public NaviBar(String msg) {
		//홈화면 
        jf = new JFrame(msg);
        jf.setSize(500, 800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
		
		// 메인 하단 회색 패널
        bigJp = new JPanel();
        bigJp.setLayout(null);
        bigJp.setSize(500, 180);
        bigJp.setBackground(Color.decode("#E8E8E8"));
        bigJp.setLocation(0, 590);

        // 상단 노란 패널
        NaviBarTopPanel = new JPanel();
        NaviBarTopPanel.setBackground(Color.decode("#FFE664"));
        NaviBarTopPanel.setBounds(0, 0, 500, 150);
        NaviBarTopPanel.setLayout(null);
        jf.add(NaviBarTopPanel);

        // 노란 패널 내부 컴포넌트들 추가
        snowcoffeelabel = new JLabel("스노우 커피");
        Font panelfont = new Font("맑은 고딕", Font.PLAIN, 50);
        snowcoffeelabel.setFont(panelfont);
        snowcoffeelabel.setBounds(150, 20, 300, 50);
        NaviBarTopPanel.add(snowcoffeelabel);

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

        // 아이템 수량 패널 추가
        itemnumPanel = new Itemnum();
        itemnumPanel.setBounds(0, 150, 500, 450);
        jf.add(itemnumPanel);

        // 글꼴 크기 조절기 추가
        fontSizeAdjuster = new FontSizeAdjuster(jf.getContentPane());
        fontSizeAdjuster.setBounds(410, 110, 120, 60);
        jf.add(fontSizeAdjuster);

        FontSize = new JLabel("글씨 크기");
        Font FontSizefont = new Font("맑은 고딕", Font.BOLD, 18);
        FontSize.setBounds(330, 102, 150, 50);
        NaviBarTopPanel.add(FontSize);

        // 검정 패널 추가
        blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(0, 150, 500, 30);
        jf.add(blackPanel);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new NaviBar("Navigation Bar");
    }
}
