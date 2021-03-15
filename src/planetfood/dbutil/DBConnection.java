
package planetfood.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-OU4LNJFF:1521/xe","planetfood","student");
            System.out.println("connection open !");
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,"Connection not Done!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
            conn.close();
            System.out.println("connection close !");
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,"DB error in Closing Connection","Error!",JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }
    }
    
}