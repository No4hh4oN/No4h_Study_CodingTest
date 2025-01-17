package oracle_DBstudy.awtTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class awt002_design {
	public static void main(String[] args) {
		// Frame 생성
		Frame f = new Frame("Login");
		f.setSize(400, 300);
		f.setLayout(new BorderLayout());
		f.setBackground(new Color(240, 248, 255));

		Panel inputPanel = new Panel(new GridBagLayout());
		inputPanel.setBackground(Color.WHITE);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);

		Label title = new Label("Login Page");
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setForeground(new Color(0, 102, 204));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		inputPanel.add(title, gbc);

		Label lid = new Label("ID: ");
		lid.setFont(new Font("Arial", Font.PLAIN, 14));
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.EAST;
		inputPanel.add(lid, gbc);

		TextField tfId = new TextField(10);
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		inputPanel.add(tfId, gbc);

		Label lpwd = new Label("Password: ");
		lpwd.setFont(new Font("Arial", Font.PLAIN, 14));
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.EAST;
		inputPanel.add(lpwd, gbc);

		TextField tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		inputPanel.add(tfPwd, gbc);

		Button button = new Button("Login");
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBackground(new Color(0, 102, 204));
		button.setForeground(Color.WHITE);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		inputPanel.add(button, gbc);

		Panel messagePanel = new Panel();
		messagePanel.setBackground(new Color(245, 245, 245));
		messagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		Label message = new Label("", 1);
		message.setFont(new Font("Arial", Font.ITALIC, 12));
		message.setForeground(Color.RED);
		message.setPreferredSize(new Dimension(200, 20)); 
		messagePanel.add(message);

		f.add(inputPanel, BorderLayout.CENTER);
		f.add(messagePanel, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				String pwd = tfPwd.getText();

				if (id.isEmpty() || pwd.isEmpty()) {
					message.setText("ID 또는 Password를 입력하세요.");
					return;
				}

				Awt_MemberDAO dao = new Awt_MemberDAO();
				ArrayList<Awt_MemberVo> userList = dao.list(id);

				if (userList.isEmpty()) {
					message.setText("존재하지 않는 ID입니다.");
				} else {
					Awt_MemberVo user = userList.get(0);
					if (user.getPassword().equals(pwd)) {
						message.setForeground(new Color(0, 128, 0));
						message.setText("로그인 성공!");
					} else {
						message.setForeground(Color.RED);
						message.setText("비밀번호가 일치하지 않습니다.");
					}
				}
			}
		});

		f.setVisible(true);

		f.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
}
