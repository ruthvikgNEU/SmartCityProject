/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

/**
 *
 * @author Ruthvik Garlapati
 */
import java.sql.*;
public class TheatreDirectory {
   Connection connection;
   
   public TheatreDirectory(Connection connection){
    this.connection = connection;   
   }
   public ResultSet getTheatreData(){
        try{
        PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from theatres");
        return st.executeQuery();
     }
     catch(SQLException e){
         System.out.println(e);
    }
     return null;
   }
   public void addTheatre(String name,String location,double lat,double lon,String owner){
       
       
   }
}
