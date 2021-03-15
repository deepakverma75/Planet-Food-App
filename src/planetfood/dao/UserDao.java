
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.User;
import planetfood.pojo.registerCashier;
 
public class UserDao {
   public static String validateUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        String qry;
        qry = "Select username from Users where userid=? and password=? and usertype=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs=ps.executeQuery();
        String username=null; 
        if(rs.next())
           {
               username=rs.getString(1);
           }
    return username;
 }


 public static boolean registerUser(registerCashier register)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        
        
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1,register.getUserId());
        ps.setString(2, register.getEmpId());
        ps.setString(3,register.getUserName());
        ps.setString(4,register.getPassword());
        ps.setString(5, register.getUserType());
        
        int x=ps.executeUpdate();
        return (x>0);
 }
 
}
 
















