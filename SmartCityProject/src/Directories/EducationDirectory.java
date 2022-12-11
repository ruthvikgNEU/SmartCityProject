
package Directories;

/**
 *
 * @author Ruthvik Garlapati
 */

import java.sql.*;
public class EducationDirectory {
    Connection connection;
    public EducationDirectory(Connection connection){
        this.connection = connection;
    }
    
    public ResultSet getCourses(){
           try{
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("select * from course_applications");
           return st.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    
    public void AddCourseByAdmin(String uni,String name,String prof,String dow,String fileurl,String applied_date){
        try{
            PreparedStatement st = (PreparedStatement)connection.prepareStatement("insert into course_applications(coursename,university,professor,coursedesc,app_status,applied_date,asignee,dayofweek) values (?,?,?,?,?,?,?,?)");
            st.setString(1,name);
            st.setString(2, uni);
            st.setString(3,prof);
            st.setString(4, fileurl);
            st.setString(5,"Approved");
            st.setString(6,applied_date);
            st.setString(7, "N/A");
            st.setString(8, dow);
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
