package oracle_DBstudy.awtTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt001 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(500, 300);
		f.setLayout(null);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(10, 50, 100, 20);

		Label lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setBounds(10, 75, 100, 20);

		TextField tfId = new TextField(10);
		tfId.setBounds(150, 50, 150, 20);
		TextField tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		tfPwd.setBounds(150, 75, 150, 20);

		Button button = new Button("Login");
		button.setBounds(230, 105, 70, 20);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				String pwd = tfPwd.getText();
				// Example logic (you can add real authentication logic here)
				if (!id.isEmpty() && !pwd.isEmpty()) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("ID 또는 Password를 입력하세요.");
				}
			}
		});

		f.add(lid);
		f.add(tfId);
		f.add(lpwd);
		f.add(tfPwd);
		f.add(button);

		f.setVisible(true);
	}
}
