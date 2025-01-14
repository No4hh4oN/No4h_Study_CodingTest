package java_book;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex94 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		String uidString = "No4h";
		String upasswordString = "password";
		Frame f = new Frame("Login");
		f.setSize(400, 200);
		f.setLayout(new FlowLayout());

		Panel inputPanel = new Panel();
		Panel outputPanel = new Panel();
		f.add(inputPanel);
		f.add(outputPanel);
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');

		inputPanel.add(lid);
		inputPanel.add(id);
		inputPanel.add(lpwd);
		inputPanel.add(pwd);

		TextField text = new TextField(20);
		Button b = new Button("LOGIN");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (id.getText().equals(uidString) && pwd.getText().equals(upasswordString)) {
					text.setText("로그인 되었습니다.");
				} else if (id.getText().equals(uidString) == false) {
					text.setText("아이디가 다릅니다.");
				} else if (pwd.getText().equals(uidString) == false) {
					text.setText("비밀번호가 다릅니다.");
				}
			}
		});

		outputPanel.add(text);
		outputPanel.add(b);

        f.addWindowListener(new Ex94());
		f.setVisible(true);
	}
}
