
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 import java.util.HashMap;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.Product;

public class ProductDao {
    
    public static String getNewID()throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select count(*) from products");
        int id =101;
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            id = id+rs.getInt(1);
        }
        return "P"+id;
    }
    
    public static boolean addProduct(Product p) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into Products values(?,?,?,?,?)");
        ps.setString(1,p.getProdId());
        ps.setString(2,p.getCatId());
        ps.setString(3,p.getProdName());
        ps.setDouble(4,p.getProdPrice());
        ps.setString(5,p.getIsActive());
        
        int x=ps.executeUpdate();
        
        return (x>0);
    }
    public static HashMap<String,Product>getProductsByCategory(String catId)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from products where cat_id=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        HashMap<String,Product>productList = new HashMap<String,Product>();
        ps.setString(1, catId);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            Product p = new Product();
            p.setCatId(catId);
            p.setProdId(rs.getString("prod_id"));
            p.setProdName(rs.getString("prod_name"));
            p.setProdPrice(rs.getDouble("prod_price"));
            p.setIsActive(rs.getString("active"));
            productList.put(p.getProdId(),p);
        }
        return productList;
    }
    
    public static ArrayList<Product> getAllData() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from products";

        Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery(qry);
        ArrayList<Product> ProductList = new ArrayList<Product>();
        while(rs.next())
        {
            Product p = new Product();
            p.setCatId(rs.getString("cat_id"));
            p.setProdId(rs.getString("prod_id"));
            p.setProdName(rs.getString("prod_name"));
            p.setProdPrice(rs.getDouble("prod_price"));
            p.setIsActive(rs.getString("active"));
            ProductList.add(p);
            
        }
        return ProductList;
        
    }
    public static boolean updateProduct(Product p)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update products set prod_name=?,active=?,prod_price=? where prod_id=?");
    //    ps.setString(1,p.getCatId());
       
        ps.setString(1,p.getProdName());
        ps.setString(2,p.getIsActive());
        ps.setDouble(3,p.getProdPrice());
        
         ps.setString(4,p.getProdId());
        System.out.println("hhhhh");
        int x =ps.executeUpdate();
        return(x>0);
    }    
    public static boolean removeProduct(String prodId)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update Products set active='N' where prod_id=?");
        ps.setString(1, prodId);
        int x=ps.executeUpdate();
        return x>0;
    }
    public static HashMap<String,String>getActiveProductsByCategory(String catId)throws SQLException
    {
        Connection conn= DBConnection.getConnection();
        String qry = "Select prod_name,prod_id from products where cat_id=? and active='Y'";
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,catId);
        ResultSet rs=ps.executeQuery();
        HashMap<String,String> productList=new HashMap<>();
        while(rs.next())
        {
            String prodName = rs.getString("prod_name");
            String prodId=rs.getString("prod_id");
            productList.put(prodName,prodId);
        }
        return productList;
    }
    
}
