/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mca1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3P
 */
public class select {
    
    public static void main(String args[]){
        
        String url  = "jdbc:ucanaccess://D:/Database5.accdb";
          
        try {
            Connection con = DriverManager.getConnection(url);
            
            System.out.println("Connectecd to MS Access");
            
           String sql = "SELECT * from Test";
           
           
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           
           while(rs.next()){
               int id = rs.getInt("Id");
               String name = rs.getString("Name1");
               int age = rs.getInt("Age");
               
               System.out.println(id + "," + name + "," +age);
           }
                   
                
       
        }
        catch (SQLException ex) {
            Logger.getLogger(select.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
        
        
       