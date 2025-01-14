package java_book;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Ex95 extends WindowAdapter {

	public static void main(String[] args) {
		Frame f = new Frame("Canvas Test");
		f.setSize(300, 200);
		f.setLayout(null);

		Canvas c = new Canvas();
		c.setBackground(Color.pink);
		c.setBounds(50, 50, 150, 100);

		f.add(c);
		f.setVisible(true);
	}

}
