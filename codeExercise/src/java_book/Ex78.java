package java_book;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class Ex78 {
	private Frame frame;
	private Button b1, b2, b3;
	private TextField tf1, tf2, tf3;
	
	public Ex78() {
		frame = new Frame("FlowLayout example");
		b1 = new Button("button1");
		b2 = new Button("button2");
		b3 = new Button("button3");
		
		tf1 = new TextField("Input Text 1");
		tf2 = new TextField("Input Text 2");
		tf3 = new TextField("Input Text 3");
	}
	
	public void startFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b2);
		frame.add(tf2);
		frame.add(b3);
		frame.add(tf3);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] arsg) {
		Ex78 flow = new Ex78();
		flow.startFrame();
	}
	
}
