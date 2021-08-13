/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3P
 */
public class CRUD {
    
    public static void main(String args[]){
        
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pranay", "pranay123");
            
            Statement st = con.createStatement();
            
            String sql1 = "INSERT INTO Test1(Customer_id, Name, Phone)VALUES"+ " (1, 'Ak', '1234')"; 
            
//            PreparedStatement st = con.prepareStatement(sql1);
//            st.setInt(1, 2);
//            st.setString(2, "Alshay");
//            st.setInt(3, 123);
//            
            
            
            
           
            int x = st.executeUpdate(sql1);
            if (x > 0){
                System.out.println("Record inserted successfully");
            }
            
            
            String sql3 = "UPDATE Test1 set Phone=999 where Customer_id =1 ";
            int y = st.executeUpdate(sql3);
            if (y > 0){
                System.out.println("Record updated");
            }
            
            
            String sql2 = "SELECT * from Test1";
            ResultSet rs = st.executeQuery(sql2);
            
           
            
            
            while(rs.next()){
                 
            int cust = rs.getInt("Customer_id");
            String name = rs.getString("Name");
            int no = rs.getInt("Phone");
            
            System.out.println(cust+ "," +name + "," +no);
        }
            
            
            String sql4 = "DELETE from Test1 where Customer_id=1";
            
            int z = st.executeUpdate(sql4);
            
             if (z > 0){
                System.out.println("Record deleted");
            }
            
            
            
                 st.close();
                 con.close();
            
        } 
        
        
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
         
        
    }
    
}
