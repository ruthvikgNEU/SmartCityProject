/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ksara
 */
public class EducationDirector {
    Connection connection;
    public EducationDirector(Connection connection){
     this.connection = connection;   
    
}
    public ResultSet getAllApplications(){
         try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from universityapplication");
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    
     public ResultSet populateNextApplications(){
         try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from universityapplication  where app_status = 'Active' or app_status = 'Pending' order by applied_date asc ");
        return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    


public void insertRecord(String univname,String princ,String tres,String courseinfourl,String location,String applied_ondate){
        try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("insert into universityapplication(univname,princ,tres,courseinfourl,location,applied_ondate) values (?,?,?,?,?,?,?,?)");
        st.setString(1,univname);
        st.setString(2,princ);
        st.setString(3, tres);
        st.setString(4,courseinfourl);
        st.setString(5, "Active");
        st.setString(6, "Pending");
        st.setString(7, applied_ondate);
        st.setString(8, location);
        st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
}    

}