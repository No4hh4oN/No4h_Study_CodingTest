package java_book;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex88 {
	public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        f.setLocation(screenSize.width/2-150, screenSize.height/2-100);
        f.setVisible(true);
    }
}