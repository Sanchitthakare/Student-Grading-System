package buffer;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import Main.*;

import Database.*;

public class Demo extends JFrame implements ActionListener   {
   JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,l11;  //all labels for textField
    JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8;   // others fields
    JPasswordField tf9,tf10;
    JButton btn1, btn2;  //buttons for signup and clear
    JPasswordField p1, p2;  // password fields
    File f = new File("C:\\Documents");
    int ln;
    public Demo()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Student Grading System");  
        l1 = new JLabel("Information Filled By Teacher:");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l3 = new JLabel("Section:");  
        l6 = new JLabel("Total Lectures conduct:");  
        l7 = new JLabel("No of assignment given:");  
        l8 = new JLabel("Subject:");  
        l9 = new JLabel("Enter User Name:"); 
        l10 = new JLabel("Enter Password:");
        l11 = new JLabel("Confirm Password:");
        tf1 = new JTextField();  
        tf2 = new JTextField();    
        tf3 = new JTextField();  
        tf4 = new JTextField();  
        tf5 = new JTextField();
        tf6 = new  JTextField();
        tf7 = new JPasswordField();
        tf8 = new JPasswordField();
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");  
        btn1.addActionListener(this);  
        btn2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l6.setBounds(80, 150, 200, 30);  
        l7.setBounds(80, 190, 200, 30);  
        l8.setBounds(80, 230, 200, 30); 
        l9.setBounds(80,270,200,30); 
        l10.setBounds(80,310,200,30); 
        l11.setBounds(80,350,200,30); 
        tf1.setBounds(300, 70, 200, 30);  
        tf2.setBounds(300, 110, 200, 30);  
        tf3.setBounds(300, 150, 200, 30);  
        tf4.setBounds(300, 190, 200, 30);  
        tf5.setBounds(300, 230, 200, 30); 
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        tf8.setBounds(300, 350, 200, 30);   
        btn1.setBounds(50, 390, 100, 30);  
        btn2.setBounds(170, 390, 100, 30);  
        add(l1);  
        add(l2);  
        add(tf1);  
        add(l3);  
        add(tf2);  
        add(l6);  
        add(tf3);  
        add(l7);  
        add(tf4);  
        add(l8);  
        add(tf5); 
        add(l9);
        add(tf6);
        add(l10);
        add(tf7);
        add(l11);
        add(tf8);
        add(btn1);  
        add(btn2);  
    }  
    public void actionPerformed(ActionEvent e)   
    {  
        if (e.getSource() == btn1)  
         {   
            String s1 = tf1.getText();  
            String s2 = tf2.getText();  
             String s3 = tf3.getText();   
             String s4 = tf4.getText();  
             String s5 = tf5.getText();   
             String s7 = tf7.getText(); 
             String s8 = tf8.getText(); 
             String s6 = tf6.getText(); 
             if(s7.equals(s8)) {
                try  
                {  
                   
                    MysqlCon.PutTeachersInformation(s1,s2,s3,s4,s5,s6,s7);
                       
                     
                        JOptionPane.showMessageDialog(btn1, "Registered Successfully");
                        new LoginPage();
                     

                }  
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }
            }
            else{
                JOptionPane.showMessageDialog(btn1, "Password doesn't Matched");
            }
            
        }   
          else  
          {  
            tf1.setText("");  
            tf2.setText("");  
            p1.setText("");  
            p2.setText("");  
            tf5.setText("");  
            tf6.setText("");  
            tf7.setText("");  
          }  
        
    }
}

