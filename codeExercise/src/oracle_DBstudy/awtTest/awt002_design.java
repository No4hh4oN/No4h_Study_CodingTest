package oracle_DBstudy.awtTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class awt002_design {
    public static void main(String[] args) {
        // Create Frame
        Frame f = new Frame("Login");
        f.setSize(400, 250);
        f.setLayout(new GridBagLayout());
        f.setBackground(new Color(240, 248, 255)); // Light blue background

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding between components

        // Title Label
        Label title = new Label("Login Page");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(0, 102, 204)); // Blue color
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        f.add(title, gbc);

        // ID Label and TextField
        Label lid = new Label("ID: ");
        lid.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        f.add(lid, gbc);

        TextField tfId = new TextField(10);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        f.add(tfId, gbc);

        // Password Label and TextField
        Label lpwd = new Label("Password: ");
        lpwd.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        f.add(lpwd, gbc);

        TextField tfPwd = new TextField(10);
        tfPwd.setEchoChar('*');
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        f.add(tfPwd, gbc);

        // Login Button
        Button button = new Button("Login");
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(new Color(0, 102, 204)); // Blue button
        button.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        f.add(button, gbc);

        // Message Label
        Label message = new Label("");
        message.setFont(new Font("Arial", Font.ITALIC, 12));
        message.setForeground(Color.RED);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        f.add(message, gbc);

        // Button Action
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
                        message.setForeground(new Color(0, 128, 0)); // Green for success
                        message.setText("로그인 성공!");
                    } else {
                        message.setForeground(Color.RED);
                        message.setText("비밀번호가 일치하지 않습니다.");
                    }
                }
            }
        });

        f.setVisible(true);

        // Close on Window Close
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
