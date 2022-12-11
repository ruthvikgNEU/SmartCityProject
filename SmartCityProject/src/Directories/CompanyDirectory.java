/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CompanyDirectory {
    //establishing connection
    Connection connection;
    public CompanyDirectory(Connection connection){
    this.connection = connection;
    }
    public ResultSet getCompanyDirectory(){
        try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from companies");
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet getJobsByCompany(String comp){
        try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select j.name from companies c ,jobs j where c.company_id = j.company_id and c.name = ?");
        st.setString(1, comp);
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
     public ResultSet getJobDescription(String comp,String role){
        try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select j.description from companies c ,jobs j where c.company_id = j.company_id and c.name = ? and j.name = ?");
        st.setString(1, comp);
        st.setString(2, role);
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
     
     public ResultSet getApplicationByUser(String username){
      try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from applications where username = ?");
        st.setString(1, username);
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
      return null;
     }
     public void withdrawApplication(String id){
          try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("update applications set status = ? where application_id = ?");
        st.setString(1,"Withdrawn");
        st.setString(2, id);
        st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
     }
}
