package java_book;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex87 extends WindowAdapter {
	private Frame f;
	private Button btn1, btn2, btn3;

	public Ex87() {
		f = new Frame("adapter example2");
		btn1 = new Button("OK");
		btn2 = new Button("OPEN");
		btn3 = new Button("CLOSE");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		f.addWindowListener(this);
		f.setLayout(new FlowLayout());

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Ex87 g = new Ex87();
		g.startFrame();
	}
}
