/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package record_class_implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author bhayu
 */
public class UI {
    
    public void getVal()
    {
        Connection conn;
       PreparedStatement pstmt;
       ResultSet rst;
       int count=0;
        try
        {
          // String h=" jdbc:sqlite:C:\Users\bhayu\Desktop\Text files\History0.557617990577663"
            System.out.println("\nEnter the File Name");
            String file="";
            file=new Scanner(System.in).nextLine();
            String url="jdbc:sqlite:"+file;//.db ya koi ext nahi lagana// python se ho chuka hai 
            conn= DriverManager.getConnection(url);
            System.out.println("Success"); 
            pstmt=  conn.prepareStatement("select *  from urls");
            System.out.println("Success"); 
            rst= pstmt.executeQuery(); 
            Data d;
            
           while(rst.next())
            {
                d=new Data(count,rst.getString(2),file);
                System.out.println(d);
                count++;
            }
          }
        catch(Exception e)
        {
                e.printStackTrace();
        }
        
    }
    
}
