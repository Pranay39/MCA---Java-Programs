/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mca1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3P
 */
public class update {
    
   public static void main(String args[]){
       
       String url = "jdbc:ucanaccess://D:/Database5.accdb";
       
       
       
       try {
           Connection con = DriverManager.getConnection(url);
           Statement st = con.createStatement();
           
           String sql = "UPDATE Test set Name1 ='PPP' where ID=1  ";
           
           int x = st.executeUpdate(sql);
           
           if(x>0){
               System.out.println("Name updated succefully");
           
           }
           
           
       }
       
       
       
       catch (SQLException ex) {
           Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
}
