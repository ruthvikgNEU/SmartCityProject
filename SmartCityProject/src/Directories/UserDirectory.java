/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDirectory {
    
    Connection connection;
    
    public UserDirectory(Connection connection){
     this.connection   = connection;
    }
    public String getCanLogin(String username,String password){
        try{
           PreparedStatement st = (PreparedStatement)connection.prepareStatement("select can_login from users where username = ? and passwordFld = ?");
           st.setString(1, username);
           st.setString(2, password);
              return st.executeQuery().getString(1);
        }
        catch(Exception e){
            
        }
     return null;
    }
    public ResultSet getUserData(){
        try{
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from users");
            return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
     public ResultSet getAdminsData(){
        try{
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from users where role not in ('User','SystemAdmin')");
            return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
     
     public void addAdmin(String fname,String lname,String uname,String password, String email,String role){
           try{
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("insert into users(firstname,lastname,username,passwordFld,email,role) values (?,?,?,?,?,?)");
            st.setString(1, fname);
            st.setString(2, lname);
            st.setString(3, uname);
            st.setString(4, password);
            st.setString(5, email);
            st.setString(6, role);
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
     }
}
