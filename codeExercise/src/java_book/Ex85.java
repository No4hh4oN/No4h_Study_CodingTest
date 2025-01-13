package java_book;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex85 {
	private Frame f;
    private Button btn1, btn2, btn3, btn4, btn5;

    public Ex85() {
        f = new Frame("event handler example2");
        btn1 = new Button("Button1");
        btn2 = new Button("Button2");
        btn3 = new Button("Button3");
        btn4 = new Button("Button4");
        btn5 = new Button("Button5");
    }

    public void startFrame() {
        btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
    			System.out.println("Button 1 Click!");
			}
		});

        btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
    			System.out.println("Button 2 Click!");
			}
		});
        btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
    			System.out.println("Button 3 Click!");
			}
		});
        btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
    			System.out.println("Button 4 Click!");
			}
		});
        btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
    			System.out.println("Button 5 Click!");
			}
		});

        f.add(btn1, "North");
        f.add(btn2, "South");
        f.add(btn3, "West");
        f.add(btn4, "East");
        f.add(btn5, "Center");

        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
    	Ex85 border = new Ex85();
        border.startFrame();
    }
}
