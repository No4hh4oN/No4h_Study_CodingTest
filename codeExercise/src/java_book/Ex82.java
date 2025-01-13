package java_book;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex82 implements ActionListener {
	private Frame frame;
	private Button btn1, btn2, btn3, btn4, btn5;

	public Ex82() {
		frame = new Frame("event handler example");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void startFrame() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);

		frame.add(btn1, "North");
		frame.add(btn2, "South");
		frame.add(btn3, "West");
		frame.add(btn4, "East");
		frame.add(btn5, "Center");

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
