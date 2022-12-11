
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
     
     
     public void addUniversityBySystemAdmin(String name,String owener,String location,double lat,double lon){
         try{
          PreparedStatement st = (PreparedStatement)connection.prepareStatement("insert into city_applications(name,type,owner,location,lat,lon,asignee,application_status) values (?,?,?,?,?,?,?,?)");
          st.setString(1,name);
          st.setString(2,"University");
          st.setString(3, owener);
          st.setString(4, location);
          st.setDouble(5,lat);
          st.setDouble(6, lon);
          st.setString(7, "N/A");
          st.setString(8, "Approved");
             st.executeUpdate();
         }
         catch(SQLException e){
             System.out.println(e);
         }
     }
     
       public void addTheatreBySystemAdmin(String name,String owener,String location,double lat,double lon){
         try{
          PreparedStatement st = (PreparedStatement)connection.prepareStatement("insert into city_applications(name,type,owner,location,lat,lon,asignee,application_status) values (?,?,?,?,?,?,?,?)");
          st.setString(1,name);
          st.setString(2,"Theatre");
          st.setString(3, owener);
          st.setString(4, location);
          st.setDouble(5,lat);
          st.setDouble(6, lon);
          st.setString(7, "N/A");
          st.setString(8, "Approved");
             st.executeUpdate();
         }
         catch(SQLException e){
             System.out.println(e);
         }
     }
     
     public ResultSet getApprovedBuildings(){
      try{   
          PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from city_applications where application_status = 'Approved'");
          return st.executeQuery();
      }
      catch(SQLException e){
          System.out.println(e);
      }
      return null;
     }
}
