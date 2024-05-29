import java.awt.*;
import java.awt.event.*;

public class ItemEventTest22 extends Frame implements ItemListener, ActionListener {
    Choice fruitChoice;
    List colorList;
    Button exitButton;
    Frame f = this; // 현재 프레임을 나중에 사용하기 위해 참조를 저장

    public ItemEventTest22() {
        setLayout(new BorderLayout());
        
        Panel topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());

        fruitChoice = new Choice();
        fruitChoice.add("사과");
        fruitChoice.add("포도");
        fruitChoice.add("바나나");
        fruitChoice.add("배");
        fruitChoice.addItemListener(this);

        topPanel.add(fruitChoice);
        
        Panel bottomPanel = new Panel();
        bottomPanel.setLayout(new FlowLayout());

        colorList = new List(3, false);
        colorList.add("blue");
        colorList.add("red");
        colorList.add("yellow");
        colorList.addActionListener(this); // ActionListener 추가

        bottomPanel.add(colorList);
        
        exitButton = new Button("Exit");
        exitButton.addActionListener(this); // ActionListener 추가
        
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
        add(exitButton, BorderLayout.EAST);
        
        setTitle("Item Event Test");
        setSize(400, 300);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == fruitChoice) {
            System.out.println("선택된 과일: " + fruitChoice.getSelectedItem());
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == colorList) {
            System.out.print("더블클릭이 발생한 아이템 : ");
            System.out.println(e.getActionCommand());
        } else if (o == exitButton) {
            f.setVisible(false);
            f.dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ItemEventTest22();
    }
}
