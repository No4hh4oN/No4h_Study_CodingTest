// 계산기
package java_book;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex80 {
	private Frame frame;
	private Panel p1, p2;
	private Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, plus, min, mul, div, equalButton, none, clear;
	private TextField tf1;
	
	public Ex80() {
		frame = new Frame("Calculator example");
		tf1 = new TextField("Input...");
		p1 = new Panel();
		p2 = new Panel();
		n1 = new Button("1");
		n2 = new Button("2");
		n3 = new Button("3");
		n4 = new Button("4");
		n5 = new Button("5");
		n6 = new Button("6");
		n7 = new Button("7");
		n8 = new Button("8");
		n9 = new Button("9");
		n0 = new Button("0");
		plus = new Button("+");
		min = new Button("-");
		mul = new Button("x");
		div = new Button("÷");
		equalButton = new Button("=");
		none = new Button(" ");
		clear = new Button("CLEAR");
	}

	public void startFrame() {
		p2.setLayout(new GridLayout(4, 4));
		p2.add(n7);
		p2.add(n8);
		p2.add(n9);
		p2.add(plus);
		
		p2.add(n4);
		p2.add(n5);
		p2.add(n6);
		p2.add(min);
		
		p2.add(n1);
		p2.add(n2);
		p2.add(n3);
		p2.add(mul);
		
		p2.add(none);
		p2.add(n0);
		p2.add(equalButton);
		p2.add(div);
		
		p1.setLayout(new BorderLayout());
		p1.add(tf1, BorderLayout.CENTER);
		p1.add(clear, BorderLayout.EAST);
		
		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.CENTER);
		
		frame.setSize(300, 450);
		frame.setVisible(true);
	}

	public static void main(String[] arsg) {
		Ex80 cal = new Ex80();
		cal.startFrame();
	}

}
