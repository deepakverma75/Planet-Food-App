
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.Employee;


public class EmployeeDao {
    public static boolean addEmployees(Employee e) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into employees values(?,?,?,?)");
        ps.setString(1,e.getEmpId());
        ps.setString(2,e.getEname());
        ps.setString(3,e.getJob());
        ps.setDouble(4,e.getSalary());
        int x= ps.executeUpdate();
        return (x>0);
    }

   
    public static boolean RegisterCashier(Employee e) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1,e.getUserId());
        ps.setString(2,e.getEmpId());
        ps.setString(3,e.getEname());
        ps.setString(4,e.getPassword());
        ps.setString(5, e.getUserType());
        int x= ps.executeUpdate();
        return (x>0);
    }

   
   
   
       public static HashMap<String,String>getAlljob()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select jobtype,no from job");
        HashMap<String,String>job = new HashMap<>();
        while(rs.next())
        {
            String jobName = rs.getString(1);
            String no= rs.getString(2);
            job.put(jobName,no);
        }
        return job;
    }
   
       public static boolean editEmployee(Employee c) throws SQLException
    { 
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update employees set ename =(?), job=?, sal=? where empid=(?)");
        
     //  ps.setString(1, catId);
       
        ps.setString(1, c.getEname());
        ps.setString(2, c.getJob());
        ps.setDouble(3, c.getSalary());
        ps.setString(4,c.getEmpId());
       
        int x= ps.executeUpdate();
       
        return (x>0);
    }   


       
       
       public static ArrayList<Employee> getAllEmployee() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from employees";

        Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery(qry);
        ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
        while(rs.next())
        {
            Employee e = new Employee();
            e.setEmpId(rs.getString("empid")); 
            e.setEname(rs.getString("Ename"));
            e.setJob(rs.getString("job"));
            e.setSalary(rs.getDouble("sal"));
           EmployeeList.add(e);
            
        }
        return EmployeeList;
        
    }
  
  public static HashMap<String,String>getAllEmployeeid()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select empid,ename from employees");
        HashMap<String,String>empidList = new HashMap<>();
        while(rs.next())
        {
            String ename= rs.getString(1);
            String empid = rs.getString(2);
            empidList.put(ename,empid );
        }
        return empidList;
    }
   
      public static HashMap<String,Employee>getEmpDetailByEmpid(String empid)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        
        String qry = "Select * from employees where empid=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        HashMap<String,Employee>EmployeeList = new HashMap<String,Employee>();
        ps.setString(1, empid);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            
            Employee p = new Employee();
            p.setEmpId(empid);
            p.setEname(rs.getString("ename"));
            p.setJob(rs.getString("job"));
            p.setSalary(rs.getDouble("sal"));
            
            EmployeeList.put(p.getEmpId(),p);
        }
        
        return EmployeeList;
    }
  
  
  
    public static String getNewID()throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select count(*) from employees");
        int id =101;
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            id = id+rs.getInt(1);
        }
        return "E"+id;
    }
    
  
    
    
     public static ArrayList<Employee>getDetail(String empid)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from Employees where empid=(?)");
         ps.setString(1, empid);         
        ResultSet rs= ps.executeQuery();
        ArrayList<Employee> orderList = new ArrayList<Employee>();
        while(rs.next())
        {
            Employee obj = new Employee();
            obj.setEmpId(rs.getString("empid"));       
            
            obj.setEname(rs.getString("Ename"));
            obj.setJob(rs.getString("job"));       
            obj.setSalary(rs.getDouble("sal"));
            
            orderList.add(obj);
        }
        return orderList;
    }
    
     
     public static boolean removeEmployee(String EmpId)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete Employees where empid=(?)");
        ps.setString(1, EmpId);
        int x=ps.executeUpdate();
        return x>0;
    }
  
      public static ArrayList<Employee>getCashierDetail(String userid)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from users where userid=(?)");
         ps.setString(1, userid);         
        ResultSet rs= ps.executeQuery();
        ArrayList<Employee> orderList = new ArrayList<Employee>();
        while(rs.next())
        {
            Employee obj = new Employee();
            obj.setUserId(rs.getString("Userid"));
            obj.setUserName(rs.getString("username"));
            obj.setEmpId(rs.getString("empid"));
            obj.setUserType(rs.getString("usertype"));
            
            
            orderList.add(obj);
        }
        return orderList;
    }
    
     public static boolean removeCashier(String UserId)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete users where userid=(?)");
        ps.setString(1, UserId);
        int x=ps.executeUpdate();
        return x>0;
    }
     
  
    }
  

