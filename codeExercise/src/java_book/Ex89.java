package java_book;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex89 extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		
		f.setSize(300, 200);
		f.setLayout(null);
		Button b = new Button("Check");
		
		b.setSize(100, 50);
		b.setLocation(100, 75);
		
		// 버튼 클릭 시 텍스트를 변경하는 ActionListener 추가
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b.getLabel().equals("Check")) {
                    b.setLabel("Cancel");
                } else {
                    b.setLabel("Check");
                }
            }
        });
        
		f.add(b);
        f.addWindowListener(new Ex89());
		f.setVisible(true);
	}

}