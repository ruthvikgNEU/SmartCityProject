
package Directories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityDirectory {
     Connection connection;
    public CityDirectory(Connection connection){
     this.connection = connection;   
    }
    
    public ResultSet getAllApplications(){
     try{
        PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from city_applications");
        return st.executeQuery();
     }
     catch(SQLException e){
         System.out.println(e);
    }
     return null;
    }
     public ResultSet getAllApplicationsByAsignee(String username){
     try{
        PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from city_applications where asignee = ?");
        st.setString(1,username);
        return st.executeQuery();
     }
     catch(SQLException e){
         System.out.println(e);
    }
     return null;
    }
}
