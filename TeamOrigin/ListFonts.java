import java.awt.*;

public class ListFonts {
    public static void main(String[] args) {
        // 내장된 폰트 이름 가져오기
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        // 모든 폰트 이름 출력
        System.out.println("Available Fonts:");
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}