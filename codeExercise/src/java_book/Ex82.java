package java_book;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex82 implements ActionListener {
	private Frame frame;
	private Button[] btn = new Button[5];
//	private Button btn1, btn2, btn3, btn4, btn5;

	public Ex82() {
		frame = new Frame("event handler example");
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new Button("Button" + (i+1));
		}
	}

	public void startFrame() {
		for(int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(this);
		}
		
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
//		btn3.addActionListener(this);
//		btn4.addActionListener(this);
//		btn5.addActionListener(this);
		
		frame.add(btn[0], BorderLayout.NORTH);
		frame.add(btn[1], BorderLayout.SOUTH);
		frame.add(btn[2], BorderLayout.WEST);
		frame.add(btn[3], BorderLayout.EAST);
		frame.add(btn[4], BorderLayout.CENTER);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Button1")) {
			System.out.println("Button 1 Click!");
		}
		if (e.getActionCommand().equals("Button2")) {
			System.out.println("Button 2 Click!");
		}
		if (e.getActionCommand().equals("Button3")) {
			System.out.println("Button 3 Click!");
		}
		if (e.getActionCommand().equals("Button4")) {
			System.out.println("Button 4 Click!");
		}
		if (e.getActionCommand().equals("Button5")) {
			System.out.println("Button 5 Click!");
		}
	}

	public static void main(String[] args) {
		Ex82 g = new Ex82();
		g.startFrame();
	}
}
