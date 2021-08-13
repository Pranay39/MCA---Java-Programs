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
public class MCA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello");
                
          String url  = "jdbc:ucanaccess://D:/Database5.accdb";
          
        try {
            Connection con = DriverManager.getConnection(url);
            
            System.out.println("Connectecd");
            
           String sql = "INSERT into Test(Name1, Age)VALUES" + "('Akshay','22')";
           
           
           Statement st = con.createStatement();
           int rows = st.executeUpdate(sql);
           
           if (rows > 0){
               System.out.println("Record inserted");
           }
                   
                  
       
        } 
        
        
        catch (SQLException ex) {
            Logger.getLogger(MCA1.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
}
