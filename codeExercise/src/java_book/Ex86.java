package java_book;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex86 implements WindowListener {
	private Frame f;
	private Button btn1, btn2, btn3;

	public Ex86() {
		f = new Frame("adapter example2");
		btn1 = new Button("OK");
		btn2 = new Button("OPEN");
		btn3 = new Button("CLOSE");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowDeactivated(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowOpened(WindowEvent e) {

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
		Ex86 g = new Ex86();
		g.startFrame();
	}
}
