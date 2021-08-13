/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3P
 */
public class insert {
    
    public static void main(String args[]){
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pranay", "pranay123");
            
            String sql = "INSERT INTO Test1(Customer_id, Name, Phone) VALUES (?, ?, ?)";
            PreparedStatement ptst = con.prepareStatement(sql);
            
            ptst.setInt(1, 101);
            ptst.setString(2, "Dk");
            ptst.setInt(3, 1234);
            
            ptst.setInt(2, 102);
            ptst.setString(2, "Jk");
            ptst.setInt(3, 1234);
            
            int z = ptst.executeUpdate();
            
            if (z > 0){
                System.out.println(z+ " Record inserted");
            }
            
            
            String sql2 = "SELECT * from Test1";
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            
            while(rs.next()){
                int id = rs.getInt("Customer_id");
                String name = rs.getString("Name");
                int phone = rs.getInt("Phone");
                
                System.out.println(id+ "," +name+ "," +phone);
                
            }
            
            
        } 
        
        
        
        
        
        
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
