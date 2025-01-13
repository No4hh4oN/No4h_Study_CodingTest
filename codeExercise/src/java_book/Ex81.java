// 계산기_강사님 코드
package java_book;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex81 {
	private Frame frame;
	private Panel panel;
	private TextField tf;
	private Button bPlus, bMinus, bMul, bDiv, bRes;
	private Button[] bNum;

	public Ex81() {
		frame = new Frame("Calculator");
		panel = new Panel();
		tf = new TextField("0");

		bNum = new Button[10];
		
		String[] lab = {"7", "8",  "9",  "4",  "5",  "6",  "1",  "2",  "3",  "0"};
		for (int i = 0; i < bNum.length; i++) {
			bNum[i] = new Button(lab[i]);
		}

		bPlus = new Button("+");
		bMinus = new Button("-");
		bMul = new Button("*");
		bDiv = new Button("/");
		bRes = new Button("=");
		
		bPlus.setSize(50, 50);
		bPlus.setLocation(10, 10);
		
		bMinus.setSize(50, 50);
		bMinus.setLocation(70, 10);
	}

	public void startFrame() {
		frame.add(tf, BorderLayout.NORTH);
		panel.setLayout(null);

		for (int i = 0; i < bNum.length; i++) {
			panel.add(bNum[i]);
		}

		panel.add(bPlus);
		panel.add(bMinus);
		panel.add(bMul);
		panel.add(bRes);
		panel.add(bDiv);
		frame.add(panel, BorderLayout.CENTER);

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Ex81 m = new Ex81();
		m.startFrame();
	}

}
