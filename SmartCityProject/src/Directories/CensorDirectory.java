/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CensorDirectory {
    Connection connection;
    public CensorDirectory(Connection connection){
     this.connection = connection;   
    }
    
    
    public ResultSet getAllApplications(){
         try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from censor_applications");
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet populateNextApplications(){
         try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from censor_applications  where app_status = 'Active' or app_status = 'Pending' order by applied_date asc ");
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
