/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mca1;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3P
 */
public class CRUD {
    
    public static void main(String args[])
    {
        String url = "jdbc:ucanaccess://D:/Database5.accdb";
        try {
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection(url);
            
            Statement st = con.createStatement();
            
            
            // INSERT
            String sql2 = "INSERT into Test(Name1, Age)VALUES" + "('Ram', '20')";
            
            int rows = st.executeUpdate(sql2);
            
            if (rows>0){
                System.out.println("Record iserted succeefully");
            }
            
            
            
           // DELETE 
            String sql = "DELETE from Test where ID = 3"; 
            
            int x = st.executeUpdate(sql);
            
            if(x>0){
                System.out.println("User deleted successfully");
            }
            
            
           //  SELECT
           String sql1 = "SELECT * from Test";
           
           
//           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql1);
           
           
           while(rs.next()){
               int id = rs.getInt("Id");
               String name = rs.getString("Name1");
               int age = rs.getInt("Age");
               
               System.out.println(id + "," + name + "," +age);
           }
           
           String sql3 = "UPDATE Test set Age=20 where ID=5";
           int y = st.executeUpdate(sql3);
           if (y > 0){
               
               System.out.println("Record updated succefully");
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}