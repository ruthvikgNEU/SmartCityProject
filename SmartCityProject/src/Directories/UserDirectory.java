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
    //Function to gets the data from the user
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
}
