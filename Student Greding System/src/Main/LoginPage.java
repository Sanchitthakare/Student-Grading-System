package Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Database.*;

import buffer.*;

public class LoginPage extends JFrame  {

    private JFrame frame;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;

    public LoginPage() {
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame = new JFrame("Login Page");
        lblUsername = new JLabel("Username:");
        lblUsername.setBounds(10, 10, 100, 20);
        txtUsername = new JTextField();
        txtUsername.setBounds(120, 10, 200, 20);
        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(10, 40, 100, 20);
        txtPassword = new JTextField();
        txtPassword.setBounds(120, 40, 200, 20); 
        btnLogin = new JButton("Login");
        btnLogin.setBounds(10, 70, 100, 20);
        btnCancel = new JButton("Register");
        btnCancel.setBounds(120, 70, 100, 20);
       lblUsername.setBounds(10, 10, 100, 20);
       txtUsername.setBounds(120, 10, 200, 20); 
       lblPassword.setBounds(10, 40, 100, 20);
       txtPassword.setBounds(120, 40, 200, 20); 
       btnLogin.setBounds(10, 70, 100, 20);
       btnCancel.setBounds(120, 70, 100, 20);
       add(lblUsername);
       add(txtUsername);
       add(lblPassword);
       add(txtPassword);
       add(btnLogin);
       add(btnCancel);


        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MysqlCon.LoginCheck(txtUsername.getText(), txtPassword.getText()); 
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Demo();
                frame.dispose();
            }
        });

    
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPage();
            }
        });
    }
}