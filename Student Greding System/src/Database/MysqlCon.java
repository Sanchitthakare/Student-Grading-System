package Database;
import java.sql.*;

import javax.swing.JOptionPane;

import java.io.*; 
import Student.*;
public class MysqlCon{  
    public static void PutTeachersInformation(String a, String b, String c, String d, String e, String f, String g){  
        System.out.println("Hiiii");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentGredingSystem", "root", "Sanchit@mysql");   
            PreparedStatement pst = con.prepareStatement("insert into TechersInfo values(?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, a);
            pst.setString(2, b);
            pst.setString(3, c);
            pst.setString(4, d);
            pst.setString(5, e);
            pst.setString(6, f);
            pst.setString(7, g);
            pst.executeUpdate();    
            System.out.println("Data inserted successfully");  
            con.close(); 
        }
        catch(Exception ex){
            System.out.println(ex);
        } 
    } 
    public static void LoginCheck(String a,String b) 
    {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentGredingSystem", "root", "Sanchit@mysql");
            Statement st= con.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT Username FROM TechersInfo"); 
            while (resultSet.next()) {
                String username = resultSet.getString("Username");
                if(a.equals(username))
                {
                   PreparedStatement pst = con.prepareStatement("SELECT Password FROM TechersInfo WHERE Username = ?");
                   pst.setString(1, username); 
                   ResultSet rs= pst.executeQuery();
                   rs.next();
                   String Password= rs.getString("Password");
                   if(b.equals(Password))
                   {
                    System.out.println("Login Successful");
                    PreparedStatement pst1 = con.prepareStatement("SELECT Subject FROM TechersInfo WHERE Username = ? and Password=?");
                   pst1.setString(1, username);
                   pst1.setString(2,Password) ;
                   ResultSet rsx= pst1.executeQuery();
                   rsx.next();
                   String x= rsx.getString("Subject");
                   PreparedStatement pst2 = con.prepareStatement("SELECT Section FROM TechersInfo WHERE Username = ? and Password=?");
                   pst2.setString(1, username);
                   pst2.setString(2,Password) ;
                   ResultSet rsy= pst2.executeQuery();
                   rsy.next();
                   String y= rsy.getString("Section");
                   PreparedStatement pst3 = con.prepareStatement("SELECT Total_Lectures_conduct FROM TechersInfo WHERE Username = ? and Password=?");
                   pst3.setString(1, username);
                   pst3.setString(2,Password) ;
                   ResultSet rsz= pst3.executeQuery();
                   rsz.next();
                   String z= rsz.getString("Total_Lectures_conduct");
                   PreparedStatement pst4 = con.prepareStatement("SELECT Total_Assignments_Given FROM TechersInfo WHERE Username = ? and Password=?");
                   pst4.setString(1, username);
                   pst4.setString(2,Password) ;
                   ResultSet rsw= pst4.executeQuery();
                   rsw.next();
                   String w= rsw.getString("Total_Assignments_Given");
                    StudInfo.pars(x,y,z,w);
                    PreparedStatement pst5 = con.prepareStatement("SELECT Name FROM TechersInfo WHERE Username = ? and Password=?");
                   pst5.setString(1, username);
                   pst5.setString(2,Password) ;
                   ResultSet rsn= pst5.executeQuery();
                   rsn.next();
                   String n= rsn.getString("Name");
                   JOptionPane.showMessageDialog(null,"Welcome "+n);
                    new StudInfo();
                   }
                   else
                   {
                    System.out.println("Password doesn't match!");
                    JOptionPane.showMessageDialog(null,"Password Doesn't Match!!!");
                   }
                   break;
                }
              } 
            }catch (Exception e) 
            {
                System.out.println(e);
            }
        }
        public static void StudInfoInsertion(String a,String b,String c,String d,String f,String g,String h,String i,String j,int k)
        {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentGredingSystem", "root", "Sanchit@mysql");   
            PreparedStatement pst = con.prepareStatement("insert into StudentInfo values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, a);
            pst.setString(2, b);
            pst.setString(3, c);
            pst.setString(4, d);
            pst.setString(5, f);
            pst.setString(6, g);
            pst.setString(7, h);
            pst.setString(8, i);
            pst.setString(9, j);
            pst.setInt(10, k);
            pst.executeUpdate();    
            System.out.println("Data inserted successfully");  
            con.close(); 
        }
        catch(Exception ex){
            System.out.println(ex);
        } 
        

        }
    } 
