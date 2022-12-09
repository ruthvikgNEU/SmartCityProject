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
    
    
    public void insertRecord(String name,String dir,String prod,String url,String theatre,String applied_Date){
        try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("insert into censor_applications(theatre,movie_name,director,studio,app_status,movie_status,applied_date,url) values (?,?,?,?,?,?,?,?)");
        st.setString(1,theatre);
        st.setString(2,name);
        st.setString(3, dir);
        st.setString(4,prod);
        st.setString(5, "Active");
        st.setString(6, "Pending");
        st.setString(7, applied_Date);
        st.setString(8, url);
        st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
       
    }
}
