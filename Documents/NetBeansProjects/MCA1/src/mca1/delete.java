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
public class delete {
    
    public static void main(String args[])
    {
        String url = "jdbc:ucanaccess://D:/Database5.accdb";
        try {
            Connection con = DriverManager.getConnection(url);
            
            Statement st = con.createStatement();
            
            String sql = "DELETE from Test where ID = 3"; 
            
            int x = st.executeUpdate(sql);
            
            if(x>0){
                System.out.println("User deleted successfully");
            }
            
            
              
           String sql1 = "SELECT * from Test";
           
           
//           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql1);
           
           
           while(rs.next()){
               int id = rs.getInt("Id");
               String name = rs.getString("Name1");
               int age = rs.getInt("Age");
               
               System.out.println(id + "," + name + "," +age);
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
