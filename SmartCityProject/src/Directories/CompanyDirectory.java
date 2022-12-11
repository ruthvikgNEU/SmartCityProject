
package Directories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CompanyDirectory {
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
     
     
     public void addNewJobByAdmin(String comp,String role,String desc,String applied_date){
         try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("insert into company_jobs(company,role,roledesc,app_status,asignee,applied_date,applied_by) values(?,?,?,?,?,?,?)");
        st.setString(1,comp);
        st.setString(2, role);
        st.setString(3,desc);
        st.setString(4, "Approved");
        st.setString(5, "N/A");
        st.setString(6, applied_date);
        st.setString(7,"sysadmin");
        st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
     }
     public void addNewJob(String comp,String role,String desc,String applied_date,String asignee,String user){
         try{
        PreparedStatement st= (PreparedStatement)connection.prepareStatement("insert into company_jobs(company,role,roledesc,app_status,asignee,applied_date,applied_by) values(?,?,?,?,?,?,?)");
        st.setString(1,comp);
        st.setString(2, role);
        st.setString(3,desc);
        st.setString(4, "Pending");
        st.setString(5, asignee);
        st.setString(6, applied_date);
        st.setString(7,user);
        st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
     }
     
     public ResultSet getAllJobsByAppliedPerson(String uname){
      try{   
          PreparedStatement st= (PreparedStatement)connection.prepareStatement("select * from company_jobs where applied_by = ? ");
        st.setString(1, uname);
        return st.executeQuery();
      }
      catch(Exception e){
          System.out.println(e);
      }
      return null;
     }
     
}
