package Student;
import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import Database.*;
  
public class StudInfo extends JFrame implements ActionListener 
{
    JLabel l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
        JTextField t1, t2, t3,t4,t5,t6,t7,t8;
        JComboBox j1;
        JButton b1, b2;
       static String a,b,c,d;
        public static void pars(String x,String y,String z,String w)
        {
          a=x;
          b=y;
          c=z;
          d=w;
        }
     public StudInfo()
    {
        System.out.println(a);
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Student Information");  
        l1 = new JLabel("Student Name:");
        l2 = new JLabel("Roll No.:");
        l3 = new JLabel("Subject:");
        l4 = new JLabel("Section:");
        l5 = new JLabel("CT1 Marks:");
        l6= new JLabel("CT2 Marks:");
        l7= new JLabel("Assignment submitted:");
        l8= new JLabel("Attended lectures:");
        l9= new JLabel("Give marks out of 5 Based on Student Performance:");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4=new JTextField();
        t5= new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 =new JTextField();
        String s1[]
            = {" ","5","4","3","2","1"};
        j1=new JComboBox(s1);
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        b1.addActionListener(this);  
        b2.addActionListener(this); 
        l1.setBounds(80, 70, 200, 30);  
        l2.setBounds(80, 110, 200, 30);  
        l3.setBounds(80, 150, 200, 30);  
        l4.setBounds(80, 190, 200, 30);  
        l5.setBounds(80, 230, 200, 30); 
        l6.setBounds(80,270,200,30); 
        l7.setBounds(80,310,200,30);
        l8.setBounds(80,350,200,30);
        l9.setBounds(80,390,500,30);
        t1.setBounds(300, 70, 200, 30);  
        t2.setBounds(300, 110, 200, 30);  
        t3.setBounds(300, 150, 200, 30);  
        t4.setBounds(300, 190, 200, 30);  
        t5.setBounds(300, 230, 200, 30); 
        t6.setBounds(300, 270, 200, 30);
        t7.setBounds(300, 310, 200, 30);
        t8.setBounds(300, 350, 200, 30);
        j1.setBounds(400,390,200,30);   
        b1.setBounds(50, 430, 100, 30);  
        b2.setBounds(170, 430, 100, 30);  
        t3.setText(a);
        t4.setText(b);
        add(l1);  
        add(l2);  
        add(l3);  
        add(l4);  
        add(l5); 
        add(l6);  
        add(l7);  
        add(l8);  
        add(l9);  
        add(l8);  
        add(t1); 
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(j1);
        add(b1);
        add(b2); 
    }
    public void actionPerformed(ActionEvent e)
           {
               if(e.getSource()== b1)
               {
                System.out.println("Hiiiiii");
             String s1 = t1.getText();  
             String s2 = t2.getText();  
             String s3 = t3.getText();   
             String s4 = t4.getText();  
             String s5 = t5.getText();   
             String s7 = t7.getText(); 
             String s8 = t8.getText(); 
             String s6 = t6.getText();
             String s9 = j1.getSelectedItem() + "";
             double c1 = Double.parseDouble(s5);
             double c2 = Double.parseDouble(s6);
             double p = ((c1+c2)/40)*100;
             double r = Double.parseDouble(c);
             double s = Double.parseDouble(s8);
             double pa = (s/r)*100;
             int v = Integer.parseInt(d);
             int h = Integer.parseInt(s7);
             int k = Integer.parseInt(s9);
             System.out.println(c1+" "+c2+" "+p+" "+r+" "+s+" "+pa+" "+v+" "+h+" "+s9);
             int marks;
             if(p>=80)
             {
              marks=5;
             }
             else if(p>=75 && p<80)
             {
              marks=4;
             }   
             else if (p>=50 && p<75)
             {
             marks=3;
              }
              else{
                marks=2;
                 }
                   System.out.println(marks);
                       if(pa>=90)
                       {
                           marks=marks+5;
                       }
                       else if(pa>=80 && pa<90)
                       {
                           marks=marks+4;
                       }
                       else
                        {
                            marks=marks+2;
                        }
                        System.out.println(marks);
                      if(v-h==0)
                      {
                          marks=marks+5;
                      }
                      else if(v-h==1)
                       {
                           marks=marks+4;
                       }
                       else if(v-h==2){
                       marks=marks+3;
                       }
                       else{
                           marks=marks+1;
                       }
                       System.out.println(marks);
                       marks=marks+k;
                       System.out.println(marks);
                       MysqlCon.StudInfoInsertion(s1, s2, s3, s4, s5, s6, s7, s8, s9, marks);
                       if(marks==20)
                       {
                        JOptionPane.showMessageDialog(null, "Grade of student is A  Preffered marks:"+marks);
                       }
                       else if(marks>=15 && marks<20)
                       {
                        JOptionPane.showMessageDialog(null, "Grade of student is B  Preffered marks:"+marks);  
                       }
                       else{
                        JOptionPane.showMessageDialog(null, "Grade of student is c  Preffered marks:"+marks);
                       }
                System.out.println("Submitted");
               }
            }   
  }    