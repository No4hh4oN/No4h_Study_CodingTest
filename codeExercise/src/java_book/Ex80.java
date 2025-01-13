package java_book;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex80 {
	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private TextField tf1;
	
	public Ex80() {
		f = new Frame("Panel example");
		ok = new Button("전송");
		cancel = new Button("삭제");
		
		tf1 = new TextField("Input...");
		p = new Panel();
	}
	
	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH);
		p.setBackground(Color.cyan);
		p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400, 400);;
		f.setVisible(true);
	}
	
	public static void main(String[] arsg) {
		Ex80 g = new Ex80();
		g.startFrame();
	}
	
}
